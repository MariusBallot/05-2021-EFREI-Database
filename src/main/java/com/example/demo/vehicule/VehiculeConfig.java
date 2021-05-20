package com.example.demo.vehicule;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class VehiculeConfig {

    @Bean
    CommandLineRunner commandLineRunner(VehiculeRepository repository){
        return args -> {
           Vehicule v1 = new Vehicule("yaya","yaya","ejiza","fezfez",true,true,30
            );

            Vehicule v2 = new Vehicule(
            );


            repository.saveAll(
                    List.of(v1,v2)
            );
        };
    }

}
