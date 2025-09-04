快速开始
1.导入DDL建库
2.下好maven依赖
3.在application.yml里面写入自定义的密码
4.启动mywust_basic
5.启动redis

一些改变：
1.此项目目前将框架精简
  所有图片的调用形式都变成获取id
  前端或移动端根据id从mywust_basic的接口中拿取url
  不再在此项目数据库中直接存储url 减少了数据冗余
2.猫的数据表结构也大大简化 具体可看数据库里的注释
