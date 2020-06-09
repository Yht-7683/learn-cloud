package com.yht.cloud.nacos.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MapCh {
    private String name;
    private int value;
    public MapCh(String name,int value){
        this.name=name;
        this.value=value;
    }
}
