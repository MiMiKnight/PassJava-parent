package cn.yhm.passjava.common.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;
import lombok.ToString;

/**
 * 审核状态
 *
 * @author victor2015yhm@gmail.com
 * @date 2022-02-13 23:44:12
 */
@Getter
@ToString
public enum AuditStatus {
    /**
     * 未审核  (默认)
     */
    UNAUDITED(1, "unaudited", "未审核"),
    /**
     * 审核中
     */
    AUDITING(2, "auditing", "审核中"),
    /**
     * 审核通过
     */
    AUDIT_PASS(3, "audit_pass", "审核通过"),
    /**
     * 未审核通过
     */
    AUDIT_NOT_PASS(4, "audit_not_pass", "未审核通过");

    /**
     * 发布状态码
     */
    @EnumValue
    private final int code;
    /**
     * 审核状态类型
     */
    @JsonValue
    private final String type;
    /**
     * 审核状态描述
     */
    private final String description;

    /**
     * 审核状态
     *
     * @param code        审核状态码
     * @param type        审核状态类型
     * @param description 审核状态描述
     */
    AuditStatus(int code, String type, String description) {
        this.code = code;
        this.type = type;
        this.description = description;
    }

}
