package domain;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyBean implements CommandLineRunner{

    public void run(String...args){
        System.out.println("=================CommandLineRunner==============");
    }
}