package com.java8to11.L3;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
/*
람다 표현식
	람다
		(인자 리스트) -> {바디}

	인자 리스트
		인자가 없을 때: ()
		인자가 한개일 때: (one) 또는 one
		인자가 여러개 일 때: (one, two)
		인자의 타입은 생략 가능, 컴파일러가 추론(infer)하지만 명시할 수도 있다. (Integer one, Integer two)
	
	바디
		화상표 오른쪽에 함수 본문을 정의한다.
		여러 줄인 경우에 { }를 사용해서 묶는다.
		한 줄인 경우에 생략 가능, return도 생략 가능.
		
	변수 캡처 (Variable Capture)
		로컬 변수 캡처
			final이거나 effective final 인 경우에만 참조할 수 있다.
			그렇지 않을 경우 concurrency 문제가 생길 수 있어서 컴파일가 방지한다.
		effective final
			이것도 역시 자바 8부터 지원하는 기능으로 “사실상" final인 변수. 
			final 키워드 사용하지 않은 변수를 익명 클래스 구현체 또는 람다에서 참조할 수 있다.
		익명 클래스 구현체와 달리 ‘쉐도윙’하지 않는다.
			익명 클래스는 새로 스콥을 만들지만, 람다는 람다를 감싸고 있는 스콥과 같다.
 */
public class Foo {
	public static void main(String[] args) {
		//인자(파라미터)가 없을 경우의 람다식 표현
		//화살표 우측 바디부분 {}는 생략해도 상관없음 단, 한줄일경우만 생략 가능
//		Supplier<Integer> get10 = () -> 10;
		
		//아래와 같은 경우는 인자가 들어가는 부분에 타입을 생략해도 컴파일시 알아서 추론하기때문에 변수명만 써도 됨
//		BinaryOperator<Integer> sum = (a, b) -> a + b;
		
		Foo foo = new Foo();
		foo.run();
	}
	
	private void run() {
		// java8부터는 final(값 지정시 변경을 못한다) 을 생략할 수 있는 경우가 있음 
		// -> 사실상 final인 경우 생략가능
		// 사실상 final은 무엇인가? final 키워드는 없지만 이 변수를 더이상 어디서도 변경하지 않는 경우
		// effective final이라고 함
		int baseNumber = 10;
		
		//로컬 클래스
		class LocalClass {
			void  printBaseNumber() {
				int baseNumber = 11;
				System.out.println(baseNumber); 
				//위와 같은 경우 출력값은 11이됨. 즉, 쉐도잉(덮어버리는 현상)이 일어난 것
			}
		}
		
		//익명 클래스
		Consumer<Integer> integerConsumer = new Consumer<Integer>() {
			@Override
			public void accept(Integer baseNumber) {
				//이 경우 파라미터를 baseNumber라는 변수명으로 받기때문에 쉐도잉이 일어남
				System.out.println(baseNumber);
			}
		};
		
		//람다, 현재 run 메소드의 영역과 같음 따라서 매개변수 i를 baseNumber로 받게 될 경우 컴파일 오류
		IntConsumer printInt = (i) -> {
			System.out.println(i + baseNumber);
		};
		
		printInt.accept(10);
		// 위의 클래스들의 공통점 : baseNumber를 참조 할 수 있다.
		// 위의 클래스들과 람다식의 차이점 : 쉐도잉이 일어나는가 아닌가 / 람다는 새로운 스콥(영역)을 만들지 않음
	}
}
