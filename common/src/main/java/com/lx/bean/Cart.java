package com.lx.bean;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author lx
 */
@Data
@Entity
@Table(name="d_cart")
public class Cart implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column
    private String goodsname;
    @Column
    private Integer num;
    @Column
    private Integer price;
    @Column
    private Integer goodid;
    @Column
    private Integer uaccount;

}
