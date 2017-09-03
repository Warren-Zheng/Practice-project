package com.zxh.dao;

import java.util.List;

import com.zxh.pojo.BaseDict;

public interface DictMapper {

	public List<BaseDict> findDictByCode(String code);
}
