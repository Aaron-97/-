package com.example.Mapper;

import com.example.po.Backstage;
import com.example.po.BackstageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BackstageMapper {
    long countByExample(BackstageExample example);

    int deleteByExample(BackstageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Backstage record);

    int insertSelective(Backstage record);

    List<Backstage> selectByExample(BackstageExample example);

    Backstage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Backstage record, @Param("example") BackstageExample example);

    int updateByExample(@Param("record") Backstage record, @Param("example") BackstageExample example);

    int updateByPrimaryKeySelective(Backstage record);

    int updateByPrimaryKey(Backstage record);
}