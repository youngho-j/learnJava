package com.java8to11.L2;

import java.util.function.Function;

//�Լ� ���, ù��° �Ķ���ʹ� �Է°�, �ι�° �Ķ���ʹ� ���ϰ��� Ÿ��
public class Plus10 implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer integer) {
		return integer + 10;
	}
	
}
