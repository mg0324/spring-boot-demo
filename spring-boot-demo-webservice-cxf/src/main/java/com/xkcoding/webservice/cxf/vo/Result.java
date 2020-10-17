package com.xkcoding.webservice.cxf.vo;

import lombok.Data;

import java.util.Date;

@Data
public class Result implements java.io.Serializable{
    private String food;
    private float price;
    private int age;
    private Date birthday;
}
