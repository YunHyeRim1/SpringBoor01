package com.example.demo.cop.bbs.service.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class ReplyDto extends ArticleDto {
    private String replyNum, content, artNum;
}