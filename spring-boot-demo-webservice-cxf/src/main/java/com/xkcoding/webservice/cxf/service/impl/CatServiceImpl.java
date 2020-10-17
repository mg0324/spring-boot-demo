package com.xkcoding.webservice.cxf.service.impl;

import com.xkcoding.webservice.cxf.service.ICatService;
import com.xkcoding.webservice.cxf.vo.Result;
import org.springframework.stereotype.Component;

import javax.jws.WebService;
import java.util.Date;

@WebService(serviceName = "catService", // 与接口中指定的name一致
    targetNamespace = "http://service.cxf.webservice.xkconding.com/", // 与接口中的命名空间一致,一般是接口的包名倒
    endpointInterface = "com.xkcoding.webservice.cxf.service.ICatService"// 接口地址
)
@Component
public class CatServiceImpl implements ICatService {

    @Override
    public Result eat(String food, int age,float price, Date birthday) {
        String str = "我是一只小猫猫，今年"+age+"岁，想吃"+food+",身价"+price+"元";
        //String str = "我是一只小猫猫，今年"+age+"岁，想吃"+food+",身价";//+price+"元，出生于"+birthday.toLocaleString();
        System.out.println(str);
        Result result = new Result();
        result.setAge(age);
        result.setBirthday(birthday);
        result.setFood(food);
        result.setPrice(price);
        return result;
    }
}
