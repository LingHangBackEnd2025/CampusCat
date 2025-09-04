package com.linghang.backend.catcampus.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("cat")
public class Cat {
    @TableId(value = "id",type = IdType.AUTO)
    private int id;
    private String name;
    private String age;
    private String variety;
    private String meet_message;
    private int cat_status;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Integer cover_photo_id;
}
