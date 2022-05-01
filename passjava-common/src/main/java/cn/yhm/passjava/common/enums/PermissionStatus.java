package cn.yhm.passjava.common.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;
import lombok.ToString;

/**
 * 权限状态
 *
 * @author victor2015yhm@gmail.com
 * @date 2022-02-13 23:30:39
 */
@Getter
@ToString
public enum PermissionStatus {

    /**
     * 禁用   (默认设置)
     */
    DISABLE(1, "enbale", "启用"),
    /**
     * 启用
     */
    ENABLE(2, "disable", "禁用");

    /**
     * 权限状态码
     */
    @EnumValue
    private final int code;
    /**
     * 权限状态码类型
     */
    @JsonValue
    private final String type;
    /**
     * 权限状态描述
     */
    private final String description;


    /**
     * 许可状态
     *
     * @param code        权限状态码
     * @param type        权限状态码类型
     * @param description 权限状态描述
     */
    PermissionStatus(int code, String type, String description) {
        this.code = code;
        this.type = type;
        this.description = description;
    }
}
