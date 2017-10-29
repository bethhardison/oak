package com.taiga.oak.tester;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.deserializer.EnumDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;

import org.junit.Test;

import tester.Gender;

public class AppTest {

	@Test
	public void test() {
		System.err.println((char)65279);
//		Gender g=Enum.valueOf(Gender.class, "FEMAL");
//		System.err.println(g.toString());
		System.err.println(System.identityHashCode(short.class));
		System.err.println(System.identityHashCode(Short.class));
	}

	@Test
	public void genderTest() {
		Gender gender = Gender.FEMALE;

		//序列化
		String text = JSON.toJSONString(gender);
		System.out.println(text);

		//反序列化
		Gender sk = JSON.parseObject("5", Gender.class);
		System.out.println(sk);
	}

	public void getDeserializer() {
		ObjectDeserializer derializer = new EnumDeserializer(Gender.class);
		//derializer.deserialze();

	}

	@Test
	public void StringTest() {
		Long a = 5l;
		//序列化
		String text = JSON.toJSONString(a);
		System.out.println(text);

		//反序列化
		Long sk = JSON.parseObject(text, Long.class);
		System.out.println(sk);


	}

}