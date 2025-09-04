package com.linghang.backend.catcampus.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.linghang.backend.catcampus.mapper.ArticleMapper;
import com.linghang.backend.catcampus.pojo.Article;
import com.linghang.backend.catcampus.service.ArticleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("articleService")
@Transactional
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

}
