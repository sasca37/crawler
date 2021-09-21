package com.crawler.sasca.web.dto;

import com.crawler.sasca.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto {

    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
    }

}
