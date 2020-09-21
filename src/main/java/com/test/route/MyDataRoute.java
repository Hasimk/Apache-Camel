package com.test.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyDataRoute extends RouteBuilder{

    @Override
    public void configure() throws Exception {
        from("file:C:\\Users\\Hasim\\Desktop\\source").to("file:C:\\Users\\Hasim\\Desktop\\destination");
        
    }

}
