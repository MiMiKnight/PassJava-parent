package cn.yhm.passjava.common.enums;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * 系统错误码枚举类
 *
 * @author victor2015yhm@163.com
 * @date 2022-05-02 23:55:22
 */
@Getter
public enum ErrorCodeEnum {

    /**
     * 成功
     */
    SUCCESS("HD00000", "Success."),

    /**
     * 参数校验异常
     * HD01xxx
     */
    VALIDATE_EXCEPTION("HD01000", "Params validate exception."),

    /**
     * 数据库异常
     * HD02xxx
     */

    /**
     * 系统异常
     * HD03xxx
     */

    /**
     * 业务异常
     * HD04xxx
     */
    ;

    /**
     * 错误码
     */
    private final String code;

    /**
     * 错误信息
     */
    private final String msg;

    ErrorCodeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
