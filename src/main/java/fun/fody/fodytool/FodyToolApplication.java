package fun.fody.fodytool;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("fun.fody.fodytool.mapper")
public class FodyToolApplication {

    public static void main(String[] args) {
        SpringApplication.run(FodyToolApplication.class, args);
    }

}
