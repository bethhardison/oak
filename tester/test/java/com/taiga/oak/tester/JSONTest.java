package com.taiga.oak.tester;

import com.alibaba.fastjson.JSONObject;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class JSONTest {

	@Test
	public void test() {
		JSONObject love = new JSONObject();
		love.put("我", "青菜");
		love.put("猫", "鱼");

		System.out.println(love.toString());
	}

	@Test
	public void testMap() {
		Map<String, Object> map = new HashMap<>();
		System.err.println(map.put("a", 1));
		System.err.println(map.put("a", 1));
	}

}
