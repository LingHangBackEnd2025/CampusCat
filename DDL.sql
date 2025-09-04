create database campuscat;
use campuscat;
create table admin
(
    id       int auto_increment
        primary key,
    username varchar(30) not null,
    password varchar(60) not null
)
    comment '管理员信息表';

create table article
(
    id             int auto_increment
        primary key,
    title          varchar(255)                                                          not null,
    content        longtext                                                              not null comment '正文',
    excerpt        varchar(500)                                                          null comment '摘要',
    author         varchar(40)                                                           null comment '作者',
    status         enum ('unreviewed', 'approved', 'rejected') default 'unreviewed'      null comment '文章状态',
    created_at     timestamp                                   default CURRENT_TIMESTAMP null,
    update_at      timestamp                                   default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP,
    cover_photo_id int                                                                   null comment '封面图片ID'
)
    comment '文章信息表';

create index fk_article_cover_photo
    on article (cover_photo_id);

create table cat
(
    id             int auto_increment
        primary key,
    name           varchar(10)                            null,
    age            varchar(255)                           null comment '大致年龄',
    variety        varchar(15)                            null comment '品种',
    meet_message   varchar(200)                           null comment '相遇信息',
    cat_status     varchar(255) default 'no'              null comment '当时状态',
    created_at     datetime     default (now())           null,
    updated_at     datetime     default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP,
    cover_photo_id int                                    null comment '封面图片ID'
)
    comment '猫的信息表';

create index fk_cat_cover_photo
    on cat (cover_photo_id);

create table categories_article
(
    id          int auto_increment
        primary key,
    name        varchar(100) not null comment '文章类别名称',
    type        tinyint      not null comment '分类',
    second_type int          null comment '二级分类',
    constraint name
        unique (name)
)
    comment '管理文章的分类';

create table article_category
(
    article_id  int not null,
    category_id int not null,
    primary key (article_id, category_id),
    constraint article_category_ibfk_1
        foreign key (article_id) references article (id)
            on delete cascade,
    constraint article_category_ibfk_2
        foreign key (category_id) references categories_article (id)
            on delete cascade
)
    comment '文章类别关联表';

create index category_id
    on article_category (category_id);

