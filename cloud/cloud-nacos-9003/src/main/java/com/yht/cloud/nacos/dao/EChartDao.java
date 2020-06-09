package com.yht.cloud.nacos.dao;

import com.yht.cloud.nacos.vo.EChart;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EChartDao {
    List<EChart> getAll();
    List getRate();
    List getIncrease();
}
