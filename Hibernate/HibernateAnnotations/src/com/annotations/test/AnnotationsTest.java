package com.annotations.test;

import com.annotations.accessor.MusicStudioAccessor;
import com.annotations.entities.MusicStudio;

public class AnnotationsTest {
	public static void main(String[] args) {
		MusicStudioAccessor accessor = new MusicStudioAccessor();
		MusicStudio ms = accessor.getMusicStudio(1);
		System.out.println(ms);
	}
}
