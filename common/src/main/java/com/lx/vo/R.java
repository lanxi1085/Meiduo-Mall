package com.lx.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class R implements Serializable {
    private Integer code;
    private String message;
    private Object data;

    public R(Object data) {
        this.code = 200;
        this.message = "请求成功";
        this.data = data;
    }

}
