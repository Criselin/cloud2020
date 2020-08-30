package com.ldr.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by LD
 * 2020/8/22 15:55
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable
{
    private long id;
    private String serial;


}
