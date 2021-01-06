package com.java8to11.L1;

public class Foo {
	public static void main(String[] args) {
		//�ڹ� 8 �������� �������̽� ����ü�� ����� ��� - �͸� ���� Ŭ���� anonymous inner class
//		RunSomthing runSomthing = new RunSomthing() {			
//			@Override
//			public void doIt() {
//				System.out.println("Hello");
//			}
//		};
		// �� �ڵ带 ���� �������� ��ȯ - ��������� �� ������ ��� �Ʒ��� ���� ��밡��
//		RunSomthing runSomthing2 = () -> System.out.println("Hi");
		
		// ��������� ���������� ��� �Ʒ��� ���� {}�� ��� ��밡��
//		RunSomthing runSomthing3 = () -> {
//			System.out.println("�ȳ�");
//			System.out.println("���ָ�");
//		};
		
		// ����ǥ���� - �Լ��� �������̽��� �ζ��� ���·� ������ ������Ʈ, �Լ�ó�� ����
		// ������ �Ҵ簡��, �޼��� �Ķ���� ���ް���, ���� ���� -> 1�� ��ü(First class Object)
		// 1�� ��ü�� �����ϴٸ� �����Լ��� �翬�� ����!
		
//		runSomthing3.doIt();
		
		// �������� �Լ����� ���� �߿��� ���� �Է¹��� ���� �����ϸ� ����� ���ƾ��� - �Һ���
		// Pure fuction�� �޼��ϱ� ���� ������ ��! 
		// - �Լ� �ۿ� �ִ� ���� �����ϰų� ���� �ȵ� / ���޹��� �Ķ���͸� ������ �����
		RunSomthing runSomthing4 = (number) -> {
			return number + 10;
		};
		System.out.println(runSomthing4.doIt(1));
	}
}
