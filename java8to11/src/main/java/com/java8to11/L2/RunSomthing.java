package com.java8to11.L2;

@FunctionalInterface // 자바가 제공해주는 어노테이션임 - 함수형 인터페이스를 좀 더 견고하게 사용하기 위해 사용
public interface RunSomthing {
	/*
	 * 함수형 인터페이스와 람다 표현식2
	 * 	java.lang.funcation 패키지 - 자바 기본 제공
	 * 	자바에서 미리 정의해둔 자주 사용할만한 함수 인터페이스
	 * 	Function<T,R>
	 *	BiFunction<T,U,R>
	 *	Consumer<T>
	 *	Supplier<T>
	 *	Predicate<T>
	 *	UnaryOperator<T>
	 *	BinaryOperator<T>
	 *	
	 * Function<T,R>
	 *	T 타입을 받아서 R 타입을 리턴하는 함수 인터페이스
	 *		R apply(T t)
	 *	함수 조합용 메소드
	 *		andThen
	 *		compose
	 *
	 * BiFunction<T,U,R>
	 *	두 개의 값(T, U)를 받아서 R 타입을 리턴하는 함수 인터페이스
	 *		R apply(T t, U u)
	 *
	 * Consumer<T>
	 * 	T 타입을 받아서 아무값도 리턴하지 않는 함수 인터페이스
	 * 		void Accept(T t)
	 * 	함수 조합용 메소드
	 * 		andThen
	 * 
	 * Supplier<T>
	 * 	T 타입의 값을 제공하는 함수 인터페이스
	 * 		T get()
	 * 
	 * Predicate<T>
	 * 	T 타입을 받아서 boolean을 리턴하는 함수 인터페이스
	 * 		boolean test(T t)
	 * 	함수 조합용 메소드
	 * 		And
	 * 		Or
	 * 		Negate
	 * 
	 * UnaryOperator<T>
	 *	Function<T, R>의 특수한 형태로, 입력값 하나를 받아서 동일한 타입을 리턴하는 함수 인터페이스
	 * 
	 * BinaryOperator<T>
	 * 	BiFunction<T, U, R>의 특수한 형태로, 동일한 타입의 입력값 두개를 받아 같은 타입을 리턴하는 함수 인터페이스, 세개의 타입이 모두 같아야함
	 */
	void doIt();
}
