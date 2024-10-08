package com.example.rk_personal;

import com.example.rk_personal.LLD.designPatterns.structuralDesignPattern.bridgePattern.LandBreathe;
import com.example.rk_personal.LLD.designPatterns.structuralDesignPattern.bridgePattern.Tiger;
import com.example.rk_personal.LLD.designPatterns.structuralDesignPattern.decoratorPattern.BasePizza;
import com.example.rk_personal.LLD.designPatterns.structuralDesignPattern.decoratorPattern.ExtraCheese;
import com.example.rk_personal.LLD.designPatterns.structuralDesignPattern.decoratorPattern.ExtraMushrooms;
import com.example.rk_personal.LLD.designPatterns.structuralDesignPattern.decoratorPattern.FarmHousePizza;
import com.example.rk_personal.LLD.designPatterns.structuralDesignPattern.facadePattern.FacadeACOperation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RkPersonalApplication {

	public static void main(String[] args) {


		SpringApplication.run(RkPersonalApplication.class, args);

		BasePizza pizza = new ExtraMushrooms(new ExtraCheese(new FarmHousePizza()));
		System.out.println("Total cost: " + pizza.getCost());
		Tiger tiger = new Tiger(new LandBreathe());
		tiger.breathProcess();

	}
}