package cn.yhm.passjava.common.xss;

import org.apache.commons.lang3.StringUtils;

/**
 * 文本非法sql过滤处理程序
 *
 * @author victor2015yhm@gmail.com
 * @date 2022-02-13 19:37:15
 */
public class SQLFilter {

    public static String sqlInject(String text) {
        if (StringUtils.isBlank(text)) {
            return null;
        }
        // 过滤特殊字符 单引号' 双引号" 分号; 反斜杠\
        text = StringUtils.replace(text, "'", "");
        text = StringUtils.replace(text, "\"", "");
        text = StringUtils.replace(text, ";", "");
        text = StringUtils.replace(text, "\\", "");
        // 统一转换成小写形式
        text = text.toLowerCase();
        // 定义非法字符
        String[] keywords = {"master", "truncat", "insert", "select", "delete", "update", "declare", "drop", "alter"};
        // 判断是否包含非法字符
        for (String keyword : keywords) {
            // 存在非法字符
            if (text.contains(keyword)) {
                //throw new RRException("包含非法字符");
                // TODO 自定义项目异常类
            }
        }
        return text;
    }

}
