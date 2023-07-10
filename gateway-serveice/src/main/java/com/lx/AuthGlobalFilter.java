package com.lx;

import com.alibaba.nacos.api.utils.StringUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.annotation.Order;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;

import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.lang.annotation.Annotation;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lx
 */
@Component
@Slf4j
public class AuthGlobalFilter implements GlobalFilter,Order {

    @Autowired
    ObjectMapper objectMapper;

    /**
     * 放行路径，可以编写配置类，配置在YML中
     */
    private static final String[] SKIP_PATH = {"/toLogin","/login","/","/static/**"};

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        // 1. 判断是否放行路径
        String requestPath = exchange.getRequest().getPath().pathWithinApplication().value();
        boolean match = Arrays.stream(SKIP_PATH)
                .map(path -> path.replaceAll("/\\*\\*", "")).anyMatch(path -> path.startsWith(requestPath));
        ServerHttpRequest request= exchange.getRequest();
//        HttpServletRequest my = (HttpServletRequest) request;
//        HttpSession session = my.getSession();
        if (match) {
            return chain.filter(exchange);
        }
        return chain.filter(exchange);
    }

    @Override
    public int value() {
        return 0;
    }


    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
