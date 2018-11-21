package com.json.service;

import java.util.Map;

import net.sf.json.JSONObject;

import cn.hutool.json.JSON;

/**
 * ͨ��json�ӿ�
 * @author admin
 * @version 2018-11-15 14:51:37
 */
public interface CurrencyJson {
	
	public String load(String alias,Map map);
}