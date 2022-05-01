package cn.yhm.passjava.common.result;

import cn.hutool.http.HttpStatus;
import lombok.Data;

import java.util.HashMap;

/**
 * 统一返回对象
 *
 * @author victor2015yhm@gmail.com
 * @date 2022-02-13 20:22:10
 */
@Data
public class CommonResult {
    /**
     * 状态码
     */
    private long code;
    /**
     * 状态消息
     */
    private String message;
    /**
     * 状态数据
     */
    private HashMap<String, Object> data = new HashMap<>();

    /**
     * 私有空参构造方法
     */
    private CommonResult() {
    }

    /**
     * 设置code
     *
     * @param code 代码
     * @return {@link  CommonResult}
     */
    public CommonResult code(long code) {
        this.setCode(code);
        return this;
    }

    /**
     * 设置message
     *
     * @param message 消息
     * @return {@link  CommonResult}
     */
    public CommonResult message(String message) {
        this.setMessage(message);
        return this;
    }

    /**
     * 设置data子元素
     *
     * @param key   键
     * @param value 值
     * @return {@link  CommonResult}
     */
    public CommonResult data(String key, Object value) {
        this.data.put(key, value);
        return this;
    }


    /**
     * OK
     *
     * @return {@link CommonResult}
     */
    public static CommonResult ok() {
        CommonResult commonResult = new CommonResult();
        commonResult.setCode(HttpStatus.HTTP_OK);
        commonResult.setMessage("Success");
        return commonResult;
    }

    /**
     * ok
     *
     * @param message 消息
     * @return {@link CommonResult}
     */
    public static CommonResult ok(String message) {
        CommonResult commonResult = new CommonResult();
        commonResult.setCode(HttpStatus.HTTP_OK);
        commonResult.setMessage(message);
        return commonResult;
    }

    /**
     * error
     * code 400
     *
     * @return {@link CommonResult}
     */
    public static CommonResult error() {
        CommonResult commonResult = new CommonResult();
        commonResult.setCode(HttpStatus.HTTP_BAD_REQUEST);
        commonResult.setMessage("error");
        return commonResult;
    }

    /**
     * error
     *
     * @param message 消息
     * @return {@link CommonResult}
     */
    public static CommonResult error(String message) {
        CommonResult commonResult = new CommonResult();
        commonResult.setCode(HttpStatus.HTTP_BAD_REQUEST);
        commonResult.setMessage(message);
        return commonResult;
    }

    /**
     * 自定义状态
     *
     * @param code    状态码
     * @param message 消息
     * @return {@link CommonResult}
     */
    public static CommonResult status(int code, String message) {
        CommonResult commonResult = new CommonResult();
        commonResult.setCode(code);
        commonResult.setMessage(message);
        return commonResult;
    }
}
