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
@NoArgsConstructor
@Entity
@Table(name="d_goods")
public class Goods implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)//主键自动增长使用序列
    private Integer gid;
    @Column
    private String gname;
    @Column
    private String gremain;
    @Column
    private String gdetails;
    @Column
    private Integer gprice;
    @Column
    private String types;
}
