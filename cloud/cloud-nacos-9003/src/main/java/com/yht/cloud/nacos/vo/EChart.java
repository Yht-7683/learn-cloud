package com.yht.cloud.nacos.vo;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EChart {
    private String month;
    private int increase;
    private float rate;
    public EChart(String month,int increase,float rate){
        this.month=month;
        this.increase=increase;
        this.rate=rate;
    }
}
