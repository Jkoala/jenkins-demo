package com.koala.controller.domain;

import cn.hutool.core.date.DatePattern;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Description TODO
 * @Date 2022/5/18 23:44
 * @Created by koala
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person {

    private Long id;

    @Length(min = 2, max = 20, message = "姓名在2-10个字母之间")
    private String name;
    @Range(min = 0,max = 100,message = "年龄不在有效范围内")
    private Integer age;
    @NotNull
    @JsonFormat( pattern = DatePattern.NORM_DATETIME_PATTERN,timezone="GMT+8")
    private LocalDateTime birthday;
}
