package com.java8to11.L2;

import java.util.function.Function;

//함수 상속, 첫번째 파라미터는 입력값, 두번째 파라미터는 리턴값의 타입
public class Plus10 implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer integer) {
		return integer + 10;
	}
	
}
