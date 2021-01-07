package com.java8to11.L3;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
/*
���� ǥ����
	����
		(���� ����Ʈ) -> {�ٵ�}

	���� ����Ʈ
		���ڰ� ���� ��: ()
		���ڰ� �Ѱ��� ��: (one) �Ǵ� one
		���ڰ� ������ �� ��: (one, two)
		������ Ÿ���� ���� ����, �����Ϸ��� �߷�(infer)������ ����� ���� �ִ�. (Integer one, Integer two)
	
	�ٵ�
		ȭ��ǥ �����ʿ� �Լ� ������ �����Ѵ�.
		���� ���� ��쿡 { }�� ����ؼ� ���´�.
		�� ���� ��쿡 ���� ����, return�� ���� ����.
		
	���� ĸó (Variable Capture)
		���� ���� ĸó
			final�̰ų� effective final �� ��쿡�� ������ �� �ִ�.
			�׷��� ���� ��� concurrency ������ ���� �� �־ �����ϰ� �����Ѵ�.
		effective final
			�̰͵� ���� �ڹ� 8���� �����ϴ� ������� ����ǻ�" final�� ����. 
			final Ű���� ������� ���� ������ �͸� Ŭ���� ����ü �Ǵ� ���ٿ��� ������ �� �ִ�.
		�͸� Ŭ���� ����ü�� �޸� �������������� �ʴ´�.
			�͸� Ŭ������ ���� ������ ��������, ���ٴ� ���ٸ� ���ΰ� �ִ� ���߰� ����.
 */
public class Foo {
	public static void main(String[] args) {
		//����(�Ķ����)�� ���� ����� ���ٽ� ǥ��
		//ȭ��ǥ ���� �ٵ�κ� {}�� �����ص� ������� ��, �����ϰ�츸 ���� ����
//		Supplier<Integer> get10 = () -> 10;
		
		//�Ʒ��� ���� ���� ���ڰ� ���� �κп� Ÿ���� �����ص� �����Ͻ� �˾Ƽ� �߷��ϱ⶧���� ������ �ᵵ ��
//		BinaryOperator<Integer> sum = (a, b) -> a + b;
		
		Foo foo = new Foo();
		foo.run();
	}
	
	private void run() {
		// java8���ʹ� final(�� ������ ������ ���Ѵ�) �� ������ �� �ִ� ��찡 ���� 
		// -> ��ǻ� final�� ��� ��������
		// ��ǻ� final�� �����ΰ�? final Ű����� ������ �� ������ ���̻� ��𼭵� �������� �ʴ� ���
		// effective final�̶�� ��
		int baseNumber = 10;
		
		//���� Ŭ����
		class LocalClass {
			void  printBaseNumber() {
				int baseNumber = 11;
				System.out.println(baseNumber); 
				//���� ���� ��� ��°��� 11�̵�. ��, ������(��������� ����)�� �Ͼ ��
			}
		}
		
		//�͸� Ŭ����
		Consumer<Integer> integerConsumer = new Consumer<Integer>() {
			@Override
			public void accept(Integer baseNumber) {
				//�� ��� �Ķ���͸� baseNumber��� ���������� �ޱ⶧���� �������� �Ͼ
				System.out.println(baseNumber);
			}
		};
		
		//����, ���� run �޼ҵ��� ������ ���� ���� �Ű����� i�� baseNumber�� �ް� �� ��� ������ ����
		IntConsumer printInt = (i) -> {
			System.out.println(i + baseNumber);
		};
		
		printInt.accept(10);
		// ���� Ŭ�������� ������ : baseNumber�� ���� �� �� �ִ�.
		// ���� Ŭ������� ���ٽ��� ������ : �������� �Ͼ�°� �ƴѰ� / ���ٴ� ���ο� ����(����)�� ������ ����
	}
}
