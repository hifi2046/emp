package hifi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cache.annotation.*;
import org.mybatis.spring.annotation.MapperScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("hifi.mapper")
public class App 
{
    public static void main( String[] args )
    {
	SpringApplication.run (App.class , args );
    }
}
