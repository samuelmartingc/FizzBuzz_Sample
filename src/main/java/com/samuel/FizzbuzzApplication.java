package com.samuel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FizzbuzzApplication {

	public static void main(String[] args) {
		SpringApplication.run(FizzbuzzApplication.class, args);

        boolean isFizzBuzz = false;
        for (int i=1; i<= 100;i++){
            if (i % 3 == 0) {
                System.out.print("Fizz");
                isFizzBuzz = true;
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
                isFizzBuzz = true;
            }
            if (!isFizzBuzz) {
                System.out.print(i);
            }
            System.out.println();
            isFizzBuzz = false;
        }
	}
}
