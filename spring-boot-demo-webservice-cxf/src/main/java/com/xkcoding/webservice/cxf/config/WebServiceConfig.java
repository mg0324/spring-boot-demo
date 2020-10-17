package com.xkcoding.webservice.cxf.config;

import javax.xml.ws.Endpoint;

import com.xkcoding.webservice.cxf.service.ICatService;
import com.xkcoding.webservice.cxf.service.impl.CatServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class WebServiceConfig {
    @Autowired
    private Bus bus;
    @Autowired
    private ICatService catService;

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, catService);
        endpoint.publish("/cat");
        return endpoint;
    }
}
