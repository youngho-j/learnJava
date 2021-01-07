package com.java8to11.L2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Foo {
	public static void main(String[] args) {
		//���� ��Ű���� �ִ� Plus10�� �ν��Ͻ��� �����Ͽ� �޼ҵ� ���
//		Plus10 plus10 = new Plus10();
//		System.out.println(plus10.apply(1));
		
		//���� ������ ����, �Լ��� �ҷ��µ� ���� ���� ���� ���� �� �޼ҵ� ����Ͽ� �ܼ�â�� ���
//		Function<Integer, Integer> plus10 = (i) -> i + 10;
//		System.out.println(plus10.apply(1));
		
		//�Լ� ����
		Function<Integer, Integer> plus10 = (i) -> i + 10;
		Function<Integer, Integer> multiply2 = (i) -> i * 2;
		
		//compose�� �Լ��� �ΰ����� ��� �Ķ���Ϳ� ���� ���� ���� ���� �ѵ� ���� ���� �����Ͽ� ��� ����
		//���⿡���� multiply ���� �� plus ����, �������ϵ��� �Լ��� 
//		Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2);
//		System.out.println(multiply2AndPlus10.apply(2));
		
		//andThen�� ���� ���� �Է°��� �����ϰ� �Ķ���Ϳ� ���� ������ �����Ͽ� ��� ���� 
		Function<Integer, Integer> multiply2AndPlus10 = plus10.andThen(multiply2);
		System.out.println(multiply2AndPlus10.apply(2));
		
		//���� �޾Ƽ� �������� ����, �Ʒ��� ��� ��¸�
		Consumer<Integer> printT = (i) -> System.out.println(i);
		printT.accept(10);
		
		//�޾ƿ� ���� ����, �Է� ���� �� �����Ƿ� ���ڴ� �ʿ� ����, �Ʒ��� ��� ������ 10�� �����ϰڴ�
		Supplier<Integer> get10 = () -> 10;
		System.out.println(get10);

		//���� �޾Ƽ� boolean������ ����
		Predicate<String> startsWithRa = (s) -> s.startsWith("Ra");
		Predicate<Integer> isEven = (i) -> i%2 == 0;
		System.out.println(startsWithRa.test("RastsRa"));
		System.out.println(isEven.test(2));
		
		//�Է°��� ������� Ÿ���� ���� ��� ��� ����
		UnaryOperator<Integer> plus20 = (i) -> i + 20;
		UnaryOperator<Integer> multiply4 = (i) -> i * 4;
		
	}
}
