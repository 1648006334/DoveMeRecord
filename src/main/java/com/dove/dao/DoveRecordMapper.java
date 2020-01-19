package com.dove.dao;

import com.dove.entity.DoveRecord;

public interface DoveRecordMapper {
    int insert(DoveRecord record);

    int insertSelective(DoveRecord record);

    DoveRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DoveRecord record);

    int updateByPrimaryKeyWithBLOBs(DoveRecord record);

    int updateByPrimaryKey(DoveRecord record);
}