package com.linghang.backend.catcampus.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("article")
public class Article {
    @TableId(value = "id" ,type = IdType.AUTO)
    private Integer id;
    private String title;
    private String content;
    private String excerpt;
    private String author;
    private int status;
    private String createdAt;
    private String updatedAt;
    private Integer coverPhotoId;
}
