package com.yht.cloud.nacos.dao;
import com.yht.cloud.nacos.vo.MapCh;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MapDao {
     List<MapCh> getAll();
}
