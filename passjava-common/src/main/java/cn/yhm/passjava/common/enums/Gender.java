package cn.yhm.passjava.common.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;
import lombok.ToString;

/**
 * 性别枚举类
 *
 * @author victor2015yhm@gmail.com
 * @date 2022-02-13 22:53:09
 */
@Getter
@ToString
public enum Gender {

    /**
     * 性别未知 (默认设置)
     */
    UNKNOWN(1, "unknown", "性别未知"),

    /**
     * 男性
     */
    MALE(2, "male", "男性"),

    /**
     * 女性
     */
    FEMALE(3, "female", "女性");

    /**
     * 性别代码
     */
    @EnumValue
    private final int code;

    /**
     * 性别类型
     */
    @JsonValue
    private final String type;


    /**
     * 性别描述
     */
    private final String description;


    /**
     * 性别枚举
     *
     * @param code        性别代码
     * @param type        性别类型
     * @param description 性别描述
     */
    Gender(int code, String type, String description) {
        this.code = code;
        this.type = type;
        this.description = description;
    }

}
