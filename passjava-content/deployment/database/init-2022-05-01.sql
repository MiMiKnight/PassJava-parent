# 创建t_hello 表
drop table if exists `t_hello`;
create table if not exists `t_hello`
(
    id       int auto_increment comment 'ID',
    username varchar(64) not null default 'John' comment '姓名',
    age      int comment '年龄',
    primary key (id)
) engine = InnoDB
  default charset = UTF8 comment 'Hello测试表';
commit;
# 插入数据
insert into t_hello (username, age)
values ('Jack', 18),
       ('Mary', 19),
       ('Simon', 28);
commit;
