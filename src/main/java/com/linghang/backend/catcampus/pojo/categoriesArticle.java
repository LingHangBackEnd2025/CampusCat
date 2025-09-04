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
@TableName("categories_article")
public class categoriesArticle {
    @TableId(value = "id" ,type = IdType.AUTO)
    Integer articleId;
    Integer categoryId;
    Integer type;
    Integer secondType;
}
