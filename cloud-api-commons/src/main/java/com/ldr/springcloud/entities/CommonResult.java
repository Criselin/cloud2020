package com.ldr.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by LD
 * 2020/8/22 15:57
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private int code;
    private String message;
    private T data;

    public CommonResult(int code,String message){
        this(code,message,null);
    }

}
