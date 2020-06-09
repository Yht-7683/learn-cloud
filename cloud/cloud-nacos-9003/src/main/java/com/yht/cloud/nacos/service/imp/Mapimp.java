package com.yht.cloud.nacos.service.imp;

import com.yht.cloud.nacos.dao.MapDao;
import com.yht.cloud.nacos.vo.MapCh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Mapimp {
    @Autowired
    private MapDao mapDao;
    public List<MapCh> getAll(){
        return mapDao.getAll();
    }
}
