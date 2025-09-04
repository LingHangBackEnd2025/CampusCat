package com.linghang.backend.catcampus.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.linghang.backend.catcampus.mapper.CatMapper;
import com.linghang.backend.catcampus.pojo.Cat;
import com.linghang.backend.catcampus.service.CatService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("catService")
@Transactional
public class CatServiceimpl extends ServiceImpl<CatMapper, Cat> implements CatService {

}

