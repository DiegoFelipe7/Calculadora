package com.sofka.main;

import com.sofka.classes.Calculator;
import java.util.Scanner;
import java.util.logging.Logger;
public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        Scanner scanner = new Scanner(System.in);
        String operation = "Welcome a to calculator \n 1.Sum \n 2.Subtract \n 3.Multiplication \n 4.Split \n 5.Exit";
        int action;
        do{
                logger.info(operation);
                action=scanner.nextInt();
                if(action != 5){
                    logger.info("Enter the first value");
                    int num1 = scanner.nextInt();
                    logger.info("Enter the second value");
                    int num2 = scanner.nextInt();
                    actions(action,num1,num2,logger);
                }
        }while (action != 5);
    }
    public static void actions(int action , int num1 , int num2 , Logger logger){
        Calculator calculator = new Calculator();
        switch (action) {
            case 1 -> result(calculator.sum(num1, num2));
            case 2 -> result(calculator.subtract(num1, num2));
            case 3 -> result(calculator.multiplication(num1, num2));
            case 4 -> result(calculator.split(num1, num2));
            case 5-> logger.info("Exit.");
            default -> logger.info("error");
        }
    }

    public static void result(double result){
        Logger logger = Logger.getLogger(Main.class.getName());
        logger.info(()->"the result is "+result);
    }
}
