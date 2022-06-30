package gnim.top.diarymemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DiaryMemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiaryMemoApplication.class, args);
    }

}
