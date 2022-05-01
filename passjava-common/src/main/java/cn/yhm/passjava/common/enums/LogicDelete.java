package cn.yhm.passjava.common.enums;

import lombok.Getter;
import lombok.ToString;

/**
 * 逻辑删除
 *
 * @author victor2015yhm@gmail.com
 * @date 2022-02-13 23:58:19
 */
@Getter
@ToString
public enum LogicDelete {

    /**
     * 未删除  (默认设置)
     */
    NOT_DELETED(0, "not_delete", "未删除"),
    /**
     * 已删除
     */
    DELETED(1, "deleted", "已经删除");

    /**
     * 删除状态代码
     */
    private final int code;
    /**
     * 删除状态类型
     */
    private final String type;
    /**
     * 删除状态描述
     */
    private final String description;

    /**
     * 逻辑删除
     *
     * @param code        代码
     * @param type        类型
     * @param description 描述
     */
    LogicDelete(int code, String type, String description) {
        this.code = code;
        this.type = type;
        this.description = description;
    }

}
