package fun.fody.fodytool.util;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import java.util.Collections;

/**
 * @Author: Zhu.Guodong
 * @Date: 2024/2/14 22:58
 * @Desc:
 */

public class MyGeneratorUtil {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://127.0.0.1:3306/carzone", "root", "12345678")
            //全局配置
            .globalConfig(builder -> {
                builder.author("Zhu Guodong") //设置作者
                    .commentDate("yyyy-MM-dd") //注释日期格式
                    .outputDir(System.getProperty("user.dir") + "/src/main/java") //指定输出目录
                    ; //覆盖文件
            })
            //包配置
            .packageConfig(builder -> {
                builder.parent("fun.fody.fodytool") //包名的前缀
                    .entity("entity") //实体类包名
                    .mapper("mapper") //mapper接口包名
                    .service("service") //service包名
                    .controller("controller") //controller包名
                    .pathInfo(Collections.singletonMap(OutputFile.xml, System.getProperty("user.dir")+ "/src/main/java/mapper"))
                    .xml("mapper"); //映射文件包名
            })
            //策略配置
            .strategyConfig(builder -> {
                builder.addInclude("t_test") //设置需要生成的表名或排除的表名，支持多张表
                    .addTablePrefix("t_") //设置表名前缀
                    .addTableSuffix("") //设置表名后缀
                    .entityBuilder() //开始实体类配置
                    .enableLombok() //开启lombok模型
                    .naming(NamingStrategy.underline_to_camel) //表名下划线转驼峰
                    .columnNaming(NamingStrategy.underline_to_camel); //列名下划线转驼峰
            })
            .execute();
    }
}

