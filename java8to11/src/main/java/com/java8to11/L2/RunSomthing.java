package com.java8to11.L2;

@FunctionalInterface // �ڹٰ� �������ִ� ������̼��� - �Լ��� �������̽��� �� �� �߰��ϰ� ����ϱ� ���� ���
public interface RunSomthing {
	/*
	 * �Լ��� �������̽��� ���� ǥ����2
	 * 	java.lang.funcation ��Ű�� - �ڹ� �⺻ ����
	 * 	�ڹٿ��� �̸� �����ص� ���� ����Ҹ��� �Լ� �������̽�
	 * 	Function<T,R>
	 *	BiFunction<T,U,R>
	 *	Consumer<T>
	 *	Supplier<T>
	 *	Predicate<T>
	 *	UnaryOperator<T>
	 *	BinaryOperator<T>
	 *	
	 * Function<T,R>
	 *	T Ÿ���� �޾Ƽ� R Ÿ���� �����ϴ� �Լ� �������̽�
	 *		R apply(T t)
	 *	�Լ� ���տ� �޼ҵ�
	 *		andThen
	 *		compose
	 *
	 * BiFunction<T,U,R>
	 *	�� ���� ��(T, U)�� �޾Ƽ� R Ÿ���� �����ϴ� �Լ� �������̽�
	 *		R apply(T t, U u)
	 *
	 * Consumer<T>
	 * 	T Ÿ���� �޾Ƽ� �ƹ����� �������� �ʴ� �Լ� �������̽�
	 * 		void Accept(T t)
	 * 	�Լ� ���տ� �޼ҵ�
	 * 		andThen
	 * 
	 * Supplier<T>
	 * 	T Ÿ���� ���� �����ϴ� �Լ� �������̽�
	 * 		T get()
	 * 
	 * Predicate<T>
	 * 	T Ÿ���� �޾Ƽ� boolean�� �����ϴ� �Լ� �������̽�
	 * 		boolean test(T t)
	 * 	�Լ� ���տ� �޼ҵ�
	 * 		And
	 * 		Or
	 * 		Negate
	 * 
	 * UnaryOperator<T>
	 *	Function<T, R>�� Ư���� ���·�, �Է°� �ϳ��� �޾Ƽ� ������ Ÿ���� �����ϴ� �Լ� �������̽�
	 * 
	 * BinaryOperator<T>
	 * 	BiFunction<T, U, R>�� Ư���� ���·�, ������ Ÿ���� �Է°� �ΰ��� �޾� ���� Ÿ���� �����ϴ� �Լ� �������̽�, ������ Ÿ���� ��� ���ƾ���
	 */
	void doIt();
}
