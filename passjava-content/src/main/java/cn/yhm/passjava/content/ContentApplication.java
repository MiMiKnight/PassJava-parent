package cn.yhm.passjava.content;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author victor
 */
@SpringBootApplication(scanBasePackages = {"cn.yhm.passjava.content", "cn.yhm.passjava.content"})
@MapperScan({"cn.yhm.passjava.content.mapper"})
public class ContentApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContentApplication.class, args);
    }
}