package com.sofka.main;

import com.sofka.classes.Calculator;
import java.util.Scanner;
import java.util.logging.Logger;
public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        Scanner scanner = new Scanner(System.in);
        String operation = "Welcome a to calculator \n 1.Sum \n 2.Subtract \n 3.Multiplication \n 4.Split \n 5.Exit";
        do {
                logger.info(operation);
                int action=scanner.nextInt();
                logger.info("Enter the first value");
                int num1 = scanner.nextInt();
                logger.info("Enter the second value");
                int num2 = scanner.nextInt();
                actions(action,num1,num2,logger);
        }while (true);
    }
    public static void actions(int action , int num1 , int num2 , Logger logger){
        Calculator calculator = new Calculator();
        switch (action) {
            case 1 -> calculator.sum(num1, num2);
            case 2 -> calculator.subtract(num1, num2);
            case 3 -> calculator.multiplication(num1, num2);
            case 4 -> calculator.split(num1, num2);
            default -> logger.info("invalid option");
        }
    }
}
