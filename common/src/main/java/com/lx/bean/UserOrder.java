package com.lx.bean;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author lx
 */
@Data
@Entity//映射实体类
@Table(name = "d_userorder")//映射数据库表

public class UserOrder implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)//主键自动增长使用序列
    private Integer id;
    @Column
    private String goodsname;
    @Column
    private Integer num;
    @Column
    private Integer price;
    @Column
    private Date time;
    @Column
    private Integer uaccount;

}
