package com.licious.gateway.zuulgateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import com.netflix.zuul.context.RequestContext;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.StringUtils;
import org.apache.http.HttpHeaders;

import javax.servlet.http.HttpServletRequest;
import java.nio.charset.Charset;

public class PreFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run()  {
//        RequestContext ctx = RequestContext.getCurrentContext();
//        String auth = "user" + ":" + "password";
//        byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("ISO-8859-1")));
//        String authValue = "Basic " + new String(encodedAuth);
//        ctx.addZuulRequestHeader(HttpHeaders.AUTHORIZATION, authValue);
        return null;
    }
}
