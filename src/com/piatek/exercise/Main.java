package com.piatek.exercise;

import java.util.Arrays;

public class Main {
	
	private static final String PACKAGE_NAME_WITH_CHAPTERS_EXERCISE = "com.piatek.exercise.chapter";

	public static void main(String[] args) throws Exception {
		PackageUtil.getClasses(PACKAGE_NAME_WITH_CHAPTERS_EXERCISE).forEach(chapterClass -> {
			Arrays.stream(chapterClass.getDeclaredMethods()).forEach(chapterClassMethod -> {
				try {
					chapterClassMethod.invoke(chapterClass.newInstance());
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
		});
	}

}
