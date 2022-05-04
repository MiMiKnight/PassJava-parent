# 创建t_province表
#drop table if exists `t_province`;
create table if not exists `t_province`
(
    id       int comment 'id',
    `name`   varchar(64) not null default '' comment '省份名称',
    `number` int comment '编号',
    primary key (id)
) engine = InnoDB
  default charset = UTF8 comment '省份表';
commit;

# 创建t_city表
#drop table if exists `t_city`;
create table if not exists `t_city`
(
    id          int comment 'id',
    province_id int         not null comment '省份id',
    `name`      varchar(64) not null default '' comment '城市名称',
    `number`    int comment '城市编号',
    primary key (id)
) engine = InnoDB
  default charset = UTF8 comment '城市表';
commit;

# 创建t_county表
#drop table if exists `t_county`;
create table if not exists `t_county`
(
    id       int comment 'id',
    city_id  int         not null comment '城市id',
    `name`   varchar(64) not null default '' comment '县城表',
    `number` int comment '县城编号',
    primary key (id)
) engine = InnoDB
  default charset = UTF8 comment '县城表';
commit;

# 插入数据
insert into t_province (id, `name`, `number`)
values (1, '海南省', 0100),
       (2, '安徽省', 0200),
       (3, '江苏省', 0300),
       (4, '浙江省', 0400),
       (5, '河南省', 0500),
       (6, '江西省', 0600),
       (7, '四川省', 0700),
       (8, '青海省', 0800);
commit;

# 插入数据
insert into t_city (id, province_id, `name`, `number`)
values (1, 2, '芜湖市', 0100),
       (2, 2, '淮南市', 0200),
       (3, 2, '蚌埠市', 0300),
       (4, 2, '安庆市', 0400),

       (5, 1, '三亚市', 0100),
       (6, 1, '海口市', 0200),
       (7, 1, '三沙市', 0300),
       (8, 1, '儋州市', 0400),

       (9, 3, '南京市', 0100),
       (10, 3, '无锡市', 0200),
       (11, 3, '苏州市', 0300),
       (12, 3, '常州市', 0400),

       (13, 4, '杭州市', 0100),
       (14, 4, '宁波市', 0200),
       (15, 4, '嘉兴市', 0300),
       (16, 4, '丽水市', 0400),

       (17, 5, '郑州市', 0100),
       (18, 5, '开封市', 0200),
       (19, 5, '洛阳市', 0300),
       (20, 5, '平顶山市', 0400),

       (21, 6, '南昌市', 0100),
       (22, 6, '景德镇市', 0200),
       (23, 6, '九江市', 0300),
       (24, 6, '上饶市', 0400),

       (25, 7, '成都市', 0100),
       (26, 7, '自贡市', 0200),
       (27, 7, '攀枝花市', 0300),
       (28, 7, '绵阳市', 0400);
commit;
