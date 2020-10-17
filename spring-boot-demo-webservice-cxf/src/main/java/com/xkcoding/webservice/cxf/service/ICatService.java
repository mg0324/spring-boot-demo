package com.xkcoding.webservice.cxf.service;

import com.xkcoding.webservice.cxf.vo.Result;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.Date;

@WebService(
    targetNamespace = "http://service.cxf.webservice.xkconding.com/"// 命名空间,一般是接口的包名倒序
)
public interface ICatService {
    @WebMethod
    Result eat(@WebParam(name = "food",targetNamespace = "http://service.cxf.webservice.xkconding.com/") String food,
               @WebParam(name = "age",targetNamespace = "http://service.cxf.webservice.xkconding.com/") int age,
               @WebParam(name = "price",targetNamespace = "http://service.cxf.webservice.xkconding.com/") float price,
               @WebParam(name = "birthday",targetNamespace = "http://service.cxf.webservice.xkconding.com/") Date birthday);
}
