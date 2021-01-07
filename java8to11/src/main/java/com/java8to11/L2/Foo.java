package com.java8to11.L2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Foo {
	public static void main(String[] args) {
		//같은 패키지에 있는 Plus10의 인스턴스를 생성하여 메소드 사용
//		Plus10 plus10 = new Plus10();
//		System.out.println(plus10.apply(1));
		
		//람다 식으로 변형, 함수를 불러온뒤 값을 받을 변수 지정 후 메소드 사용하여 콘솔창에 출력
//		Function<Integer, Integer> plus10 = (i) -> i + 10;
//		System.out.println(plus10.apply(1));
		
		//함수 조합
		Function<Integer, Integer> plus10 = (i) -> i + 10;
		Function<Integer, Integer> multiply2 = (i) -> i * 2;
		
		//compose는 함수가 두개있을 경우 파라미터에 들어온 조건 먼저 실행 한뒤 다음 조건 실행하여 결과 도출
		//여기에서는 multiply 실행 후 plus 실행, 보기편하도록 함수로 
//		Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2);
//		System.out.println(multiply2AndPlus10.apply(2));
		
		//andThen은 먼저 들어온 입력값을 실행하고 파라미터에 들어온 조건을 실행하여 결과 도출 
		Function<Integer, Integer> multiply2AndPlus10 = plus10.andThen(multiply2);
		System.out.println(multiply2AndPlus10.apply(2));
		
		//값을 받아서 리턴하지 않음, 아래의 경우 출력만
		Consumer<Integer> printT = (i) -> System.out.println(i);
		printT.accept(10);
		
		//받아올 값을 정의, 입력 받을 값 없으므로 인자는 필요 없음, 아래의 경우 무조건 10을 리턴하겠다
		Supplier<Integer> get10 = () -> 10;
		System.out.println(get10);

		//값을 받아서 boolean값으로 리턴
		Predicate<String> startsWithRa = (s) -> s.startsWith("Ra");
		Predicate<Integer> isEven = (i) -> i%2 == 0;
		System.out.println(startsWithRa.test("RastsRa"));
		System.out.println(isEven.test(2));
		
		//입력값과 결과값의 타입이 같은 경우 사용 가능
		UnaryOperator<Integer> plus20 = (i) -> i + 20;
		UnaryOperator<Integer> multiply4 = (i) -> i * 4;
		
	}
}
