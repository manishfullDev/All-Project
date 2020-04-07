package com.sasr.test;

import com.sasr.accessor.SingerAccessor;
import com.sasr.entities.Singer;

public class SASRTest {
	public static void main(String[] args) {
		SingerAccessor accessor = new SingerAccessor();
		Singer singer = accessor.getSinger(1);
		System.out.println(singer);
	}
}
