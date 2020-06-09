package com.yht.cloud.nacos.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class ResultPay<T> {  //泛型：如果装的payment 返回payment,装的order 返回order

    private Integer code;
    private String message;
    private T data;

    public ResultPay(Integer code, String message, T data){
        this.code=code;
        this.message=message;
        this.data=data;
    }
}