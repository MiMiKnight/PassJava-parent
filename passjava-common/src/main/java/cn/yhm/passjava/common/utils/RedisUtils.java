package cn.yhm.passjava.common.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * 项目公共Redis工具类
 *
 * @author victor2015yhm@163.com
 * @date 2022-05-01 09:51:59
 */
@Component
public class RedisUtils<V> {

    RedisTemplate<String, V> redisTemplate;

    @Autowired
    private void setRedisTemplate(RedisTemplate<String, V> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    // =============================common============================

    /**
     * 指定缓存失效时间
     *
     * @param key  键
     * @param time 时间(秒)
     * @return boolean 设置成功返回true,设置失败返回false
     */
    public Boolean expire(String key, long time) {
        if (time > 0) {
            return redisTemplate.expire(key, time, TimeUnit.SECONDS);
        }
        return Boolean.FALSE;
    }

    /**
     * 根据key 获取过期时间
     *
     * @param key 键 不能为null
     * @return 时间(秒) 返回0代表为永久有效
     */
    public Long getExpire(String key) {
        return redisTemplate.getExpire(key, TimeUnit.SECONDS);
    }

    /**
     * 判断key是否存在
     * @param key 键
     * @return true 存在 false不存在
     */

    /**
     * 删除缓存
     * @param key 可以传一个值 或多个
     */

    // ============================String=============================
    /**
     * 普通缓存获取
     * @param key 键
     * @return 值
     */

    /** 普通缓存放入
     * @param key   键
     * @param value 值
     * @return true成功 false失败
     */

    /**
     * 普通缓存放入并设置时间
     * @param key   键
     * @param value 值
     * @param time  时间(秒) time要大于0 如果time小于等于0 将设置无限期
     * @return true成功 false 失败
     */

    /**
     * 递增
     * @param key   键
     * @param delta 要增加几(大于0)
     */

    /**
     * 递减
     * @param key   键
     * @param delta 要减少几(小于0)
     */

    // ================================Map=================================

}
