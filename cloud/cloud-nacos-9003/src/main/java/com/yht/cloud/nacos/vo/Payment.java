package com.yht.cloud.nacos.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Payment {
    private Long id;
    private String serial;
    public Payment(Long id, String serial) {
        this.id=id;
        this.serial=serial;
    }


}