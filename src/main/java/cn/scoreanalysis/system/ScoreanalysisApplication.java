package cn.scoreanalysis.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = {"cn.scoreanalysis.system.mapper"})
public class ScoreanalysisApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScoreanalysisApplication.class, args);
    }

}
