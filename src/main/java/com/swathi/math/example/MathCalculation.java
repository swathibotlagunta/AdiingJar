package com.swathi.math.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.swathi.Arithoper.function.Operation;

@SpringBootApplication
public class MathCalculation {

	public static void main(String[] args) {
		SpringApplication.run(MathCalculation.class, args);
	
          System.out.println("hi");
          System.out.println("10 + 10 : " +(Operation.add(10,10)));
          System.out.println("10 - 10 : " +(Operation.substract(10,10)));
          System.out.println("10 * 10 : " +(Operation.multiply(10,10)));
          System.out.println("10 / 10 : " +(Operation.divide(10,10)));
          
}
	
}

