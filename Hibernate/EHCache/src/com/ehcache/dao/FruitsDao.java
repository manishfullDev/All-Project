package com.ehcache.dao;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

public class FruitsDao {
	private CacheManager cacheManager;
	// private Cache fruitsCache = null;

	public FruitsDao() {
		this.cacheManager = new CacheManager();

	}

	public List<String> getSeasonalFruits() throws IOException {
		Element element = null;
		List<String> fruits = null;
		Properties props = null;
		String allFruits = null;
		String[] seasonalFruits = null;
		Cache fruitsCache = null;
		
		fruitsCache = this.cacheManager.getCache("fruitsCache");
		if (fruitsCache.isElementInMemory("seasonal-fruits")) {
			element = fruitsCache.get("seasonal-fruits");
			fruits = (List<String>) element.getObjectValue();
			System.out.println("from cache");
		} else {
			props = new Properties();
			props.load(this.getClass().getClassLoader().getResourceAsStream("fruits.properties"));
			allFruits = props.getProperty("seasonal-fruits");
			seasonalFruits = allFruits.split(",");
			fruits = Arrays.asList(seasonalFruits);
			element = new Element("seasonal-fruits", fruits);
			fruitsCache.put(element);
			System.out.println("from properties");
		}

		return fruits;
	}
}
