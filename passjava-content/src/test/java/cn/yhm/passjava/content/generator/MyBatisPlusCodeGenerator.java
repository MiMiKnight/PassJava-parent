package cn.yhm.passjava.content.generator;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.po.LikeTable;
import com.baomidou.mybatisplus.generator.config.querys.MySqlQuery;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.fill.Column;
import com.baomidou.mybatisplus.generator.keywords.MySqlKeyWordsHandler;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;

/**
 * MyBatisPlus 代码生成器
 * <p>
 * 　此代码依据MyBatisPlus 3.5.x 以上版本手册编写
 *
 * @author victor2015yhm@gmail.cm
 * @date 2022-02-13 22:34:27
 */
@Slf4j
@SpringBootTest
public class MyBatisPlusCodeGenerator {
    /**
     * 运行
     */
    @Test
    public void run() {
        // 设置基本参数
        log.info("MyBatisPlus Code Generator 基本信息配置");
        // URL
        String url = "jdbc:mysql://mysql.public.yhm.cn:3306/db_passjava?characterEncoding=UTF8&useSSL=false&serverTimezone=UTC";
        // 数据库用户名
        String username = "root";
        // 数据库密码
        String password = "123456";
        // 数据库名
        String database = "db_passjava";
        // 作者名
        String author = "victor2015yhm@gmail.com";
        // 代码输出文件夹
        String codeOutputDir = "src/main/java";
        // 包名
        String packageName = "cn.yhm.passjava";
        // 模块名
        String moduleName = "content";
        // 表名
        String[] tableNameArray = {"", ""};
        // 过滤表前缀
        String[] tablePrefixArray = {"t_"};
        // 过滤字段前缀
        String[] fieldPrefixArray = {"is_"};
        // 乐观锁
        String versionName = "version";
        // 逻辑删除字段名
        String logicDeleteColumnName = "is_deleted";
        // 逻辑删除实体属性名
        String logicDeletePropertyName = "deleted";
        // 创建时间字段名
        String createTimeColumnName = "create_time";
        // 更新时间字段名
        String updateTimeColumnName = "update_Time";

        //**************************************************************************
        // 设置mapper.xml位置
        String mapperXmlOutputDir = codeOutputDir + "/" +
                packageName.replace(".", "/") +
                "/" +
                moduleName +
                "/mapper/xml";

        // 1、数据源配置
        //如果你的MySQL版本为8，必需要在数据库地址后面加上时区, 像serverTimezone=Asia/Shanghai
        log.info("MyBatisPlus Code Generator 数据源配置");
        DataSourceConfig dataSourceConfig = new DataSourceConfig.Builder(url, username, password)
                .dbQuery(new MySqlQuery())
                .schema(database)
                .typeConvert(new MySqlTypeConvert())
                .keyWordsHandler(new MySqlKeyWordsHandler())
                .build();

        // 2、全局配置
        log.info("MyBatisPlus Code Generator 全局配置");
        GlobalConfig globalConfig = new GlobalConfig.Builder()
                .outputDir(codeOutputDir)      // 设置输出文件夹
                //.fileOverride()                // 覆盖已生成文件
                .disableOpenDir()              // 生成后不打开资源管理器
                .author(author)                // 设置作者
                .enableSwagger()               // 启用Swagger注解
                .dateType(DateType.TIME_PACK)  // 设置日期类型
                .commentDate("yyyy-MM-dd HH:mm:ss")
                .build();

        // 3、包生成配置
        log.info("MyBatisPlus Code Generator 包配置");
        PackageConfig packageConfig = new PackageConfig.Builder()
                .parent(packageName)         // 父包名
                .moduleName(moduleName)      // 父包模块名
                .controller("controller")    // Controller 包名
                .service("service")          // Service 包名
                .serviceImpl("service.impl") // Service Impl 包名
                .mapper("mapper")            // Mapper 包名
                .xml("mapper.xml")           // Mapper XML 包名
                .entity("entity")            // Entity 包名
                //.other("other")            // 自定义文件包名
                .pathInfo(Collections.singletonMap(OutputFile.mapperXml, mapperXmlOutputDir))
                .build();

        // 4、策略配置
        log.info("MyBatisPlus Code Generator 策略配置");
        StrategyConfig strategyConfig = new StrategyConfig.Builder()
                .enableCapitalMode()              // 开启大写命名
                .enableSkipView()                 // 跳过视图
                .disableSqlFilter()               // 禁用 sql 过滤
                .likeTable(new LikeTable("USER"))
                .addInclude(tableNameArray)       // 增加表匹配(内存过滤)
                .addTablePrefix(tablePrefixArray) // 增加过滤表前缀
                .addFieldPrefix(fieldPrefixArray) // 增加过滤字段前缀
                .entityBuilder()                        // Entity策略配置
                .enableChainModel()                     // 开启链式模型
                .enableLombok()                         // 开启 lombok 模型
                .enableColumnConstant()                 // 开启生成字段常量
                .idType(IdType.AUTO)                    // 雪花算法  对应的MySQL的表字段为BIGINT和VARCHAR(64)
                .enableTableFieldAnnotation()           // 开启生成实体时生成字段注解
                .enableRemoveIsPrefix()                 // 开启 Boolean 类型字段移除 is 前缀
                .versionColumnName(versionName)                   // 乐观锁字段名(数据库)
                .versionPropertyName(versionName)                 // 乐观锁属性名(实体)
                .logicDeleteColumnName(logicDeleteColumnName)     // 逻辑删除字段名(数据库)
                .logicDeletePropertyName(logicDeletePropertyName) //  逻辑删除属性名(实体)
                .addTableFills(new Column(createTimeColumnName, FieldFill.INSERT))
                .addTableFills(new Column(updateTimeColumnName, FieldFill.INSERT_UPDATE))
                .formatFileName("%sEntity")         // 格式化Entity文件名称
                .mapperBuilder()                    // Mapper策略配置
                .enableMapperAnnotation()           // 开启 @Mapper 注解
                .enableBaseResultMap()              // 启用 BaseResultMap 生成
                .formatMapperFileName("%sMapper")   // 格式化 mapper 文件名称
                .formatXmlFileName("%sMapper")      // 格式化 xml 实现类文件名称
                .serviceBuilder()                           // Service策略配置
                .formatServiceFileName("%sService")         // 格式化 service 接口文件名称
                .formatServiceImplFileName("%sServiceImpl") // 格式化 service 实现类文件名称
                .controllerBuilder()            // Controller策略配置
                .enableHyphenStyle()            // 开启驼峰转连字符
                .enableRestStyle()              // 开启生成@RestController 控制器
                .formatFileName("%sController") // formatFileName(String)
                .build();

        // 5、设置配置 执行代码
        log.info("MyBatisPlus Code Generator 执行....");
        AutoGenerator autoGenerator = new AutoGenerator(dataSourceConfig)
                .global(globalConfig)
                .packageInfo(packageConfig)
                .strategy(strategyConfig);

        // 6、执行
        autoGenerator.execute();
    }
}
