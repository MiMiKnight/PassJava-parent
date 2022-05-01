package cn.yhm.passjava.common.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 登录日志方面
 *
 * @author victor2015yhm@gmail.com
 * @date 2022-02-15 14:17:09
 */
@Component
@Aspect
@Slf4j
public class LoginLogAspect {

    /**
     * 定义切点
     * 定义匹配规则
     * 本文主要介绍spring aop中9种切入点表达式的写法
     * <p>
     */
    @Pointcut("@annotation(cn.e8.passjava.common.annotation.LoginLog)")
    public void loginLogPointCut() {
        System.out.println("Login Log 切点");
    }

    /**
     * 前置通知
     */
    @Before("loginLogPointCut()")
    public void doBefore(JoinPoint joinPoint) {
        log.info("前置通知......");
        //System.out.println("前置通知......");
    }

    @Around("loginLogPointCut()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("环绕通知......前前前前前前前前前前前前");
        Object proceed = joinPoint.proceed();
        log.info("环绕通知......后后后后后后后后后后后后");
        return proceed;
    }

}
