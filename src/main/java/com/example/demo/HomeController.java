package com.example.demo;

import com.example.demo.cmm.utl.Proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class HomeController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    Proxy px;

    @GetMapping("/")
    public String index() {
        logger.info("Hello. This is LogManager's logger");
        return "index";
    }
    @GetMapping("/move/{dir}/{page}")
    public String move(@PathVariable String dir, @PathVariable String page) {
        logger.info("이동 디렉토리: "+dir);
        logger.info("이동 페이지: "+page);
        return String.format("%s/%s", dir, page);
    }
}