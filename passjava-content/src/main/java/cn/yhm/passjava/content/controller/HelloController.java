package cn.yhm.passjava.content.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello控制器
 *
 * @author victor2015yhm@163.com
 * @date 2022-05-01 11:26:16
 */
@RestController
@RequestMapping(path = {"/hello"})
@Slf4j
public class HelloController {

    @PostMapping(path = {"/"})
    public String index() {
        log.info("path:{},method:{}", "/hello/", "index()");
        return "Content Hello...";
    }
}
