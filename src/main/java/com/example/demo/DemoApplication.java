package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sun.swing.BakedArrayList;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		int i = 0;
		for (i=0;i<100;i++){
			int a = i/1%10;
			int b = i/10%10;

			if ((i%3==0&&i%5==0)||((a==3||b==3)&&(a==5||b==5))){
				System.out.print("FizzBuzz"+"\n");
			}else if (i%3==0||a==3||b==3 ){
				System.out.print("Fizz"+"\n");
			}else if(i%5==0||a==5||b==5){
				System.out.print("Buzz"+"\n");
			}else {
				System.out.print(i+"\n");
			}
		}

	}




}
