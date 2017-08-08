package com.taiga.oak.tester;

import com.alibaba.fastjson.JSON;

public class App {

	public static void main(String[] args) {
		Skirt skirt = new Skirt();
		skirt.setColor("red");
		skirt.setObj("obj");

		//序列化
		String text = JSON.toJSONString(skirt);
		System.out.println(text);

		//反序列化
		Skirt sk = JSON.parseObject(text, Skirt.class);
		JSON.parseObject(text, Skirt.class);
		System.out.println(sk);


	}
}
