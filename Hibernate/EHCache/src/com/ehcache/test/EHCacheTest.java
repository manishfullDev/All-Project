package com.ehcache.test;

import java.io.IOException;
import java.util.List;

import com.ehcache.dao.FruitsDao;

public class EHCacheTest {
	public static void main(String[] args) throws IOException {
		FruitsDao dao = new FruitsDao();
		List<String> fruits = dao.getSeasonalFruits();
		System.out.println("hash : " + fruits.hashCode() + fruits);

		fruits = dao.getSeasonalFruits();
		System.out.println("hash : " + fruits.hashCode() + fruits);
	}
}
