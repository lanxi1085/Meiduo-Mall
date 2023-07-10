package com.lx.bean;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author lx
 */
@Data
@Entity
@Table(name="d_user")

public class User implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)//主键自动增长使用序列
    private String uaccount;
    @Column
    private String upassword;
    @Column
    private String uname;
    @Column
    private String usex;
}
