package com;

import java.util.List;

import redis.clients.jedis.Jedis;

public class test {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost");
		System.out.println("连接成功");
//		jedis.set("runoobkey","www.runoob.com");
//		System.out.println("redis存储的字母为:"+jedis.get("runoobkey"));
		jedis.lpush("s", "s1");
		jedis.lpush("s", "s2");
		jedis.lpush("s", "s3");
		jedis.lpush("s", "s4");
		List<String> list = jedis.lrange("s", 0, 10);
		for (int i = 0; i < list.size(); i++) {
			System.out.println("列表项为:"+list.get(i));
		}
		
	}
}
