package com.licious.gateway.zuulgateway.config;

import com.licious.gateway.zuulgateway.filter.ErrorFilter;
import com.licious.gateway.zuulgateway.filter.PostFilter;
import com.licious.gateway.zuulgateway.filter.PreFilter;
import com.licious.gateway.zuulgateway.filter.RouteFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Bean
    public ErrorFilter adderrorFilter(){
        return new ErrorFilter();
    }

    @Bean
    public PostFilter addPostFilter(){
        return new PostFilter();
    }

    @Bean
    public PreFilter addPreFilter(){
        return new PreFilter();
    }

    @Bean
    public RouteFilter addRouteFilter(){
        return new RouteFilter();
    }

}
