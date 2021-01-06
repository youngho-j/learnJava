package com.java8to11.L1;

public class Foo {
	public static void main(String[] args) {
		//자바 8 이전에는 인터페이스 구현체를 만들어 사용 - 익명 내부 클래스 anonymous inner class
//		RunSomthing runSomthing = new RunSomthing() {			
//			@Override
//			public void doIt() {
//				System.out.println("Hello");
//			}
//		};
		// 위 코드를 람다 형식으로 변환 - 구현기능이 한 가지일 경우 아래와 같이 사용가능
//		RunSomthing runSomthing2 = () -> System.out.println("Hi");
		
		// 구현기능이 여러가지인 경우 아래와 같이 {}를 묶어서 사용가능
//		RunSomthing runSomthing3 = () -> {
//			System.out.println("안녕");
//			System.out.println("봉주르");
//		};
		
		// 람다표현식 - 함수형 인터페이스를 인라인 형태로 구현한 오브젝트, 함수처럼 보임
		// 변수에 할당가능, 메서드 파라미터 전달가능, 리턴 가능 -> 1급 객체(First class Object)
		// 1급 객체가 가능하다면 고차함수는 당연히 가능!
		
//		runSomthing3.doIt();
		
		// 수학적인 함수에서 가장 중요한 것은 입력받은 값이 동일하면 결과가 같아야함 - 불변성
		// Pure fuction을 달성하기 위해 주의할 점! 
		// - 함수 밖에 있는 값을 참조하거나 변경 안됨 / 전달받은 파라미터만 가지고 써야함
		RunSomthing runSomthing4 = (number) -> {
			return number + 10;
		};
		System.out.println(runSomthing4.doIt(1));
	}
}
