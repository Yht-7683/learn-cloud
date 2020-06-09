package com.yht.cloud.nacos.service.imp;

import com.yht.cloud.nacos.dao.EChartDao;
import com.yht.cloud.nacos.vo.EChart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EChartimp {
    @Autowired
    private EChartDao eChartDao;
    public List<EChart> getAll(){
        return  eChartDao.getAll();
    }
    public List getRate(){
        return eChartDao.getRate();
    }
    public List getIncrease(){
        return eChartDao.getIncrease();
    }
}
