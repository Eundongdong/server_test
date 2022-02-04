package com.jojoldu.book.springboot.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsUpdateRequestDto {
    private String title;
    private String content;
    private Integer check1;
    private Integer check2;
    private Integer check3;
    private Integer check4;
    private Integer check5;

    @Builder
<<<<<<< Updated upstream
    public PostsUpdateRequestDto(String title, String content){
        this.title= title;
=======
    public PostsUpdateRequestDto(String content, Integer check1, Integer check2, Integer check3, Integer check4,Integer check5 ){
>>>>>>> Stashed changes
        this.content = content;
        this.check1 = check1;
        this.check2 = check2;
        this.check3 = check3;
        this.check4 = check4;
        this.check5 = check5;
    }
}
