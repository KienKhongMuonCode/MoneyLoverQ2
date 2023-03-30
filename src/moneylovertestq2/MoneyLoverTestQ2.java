/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package moneylovertestq2;

import java.util.Scanner;

/**
 *
 * @author T490
 */
public class MoneyLoverTestQ2 {

    //Topic: Cài đặt chương trình tìm số thứ N trong dãy Fibonacci.
    
    public static void main(String[] args) {
        //Enter the ordinal number of the fibonacci number you want to find
        int ordinalNumber = inputOrdinalNumber();
        
        //Find fibonacci number
        findFibonacciNum(ordinalNumber);
    }
    
    public static int inputOrdinalNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ordinal number of the fibonacci number you want to find: ");
        int ordinalNumber = sc.nextInt();
        return ordinalNumber;
    }
    
    public static void findFibonacciNum(int ordinalNumber){
        int a = 1, b = 1, c = 0;
        if (ordinalNumber == 1) {
            System.out.println("It is: " + a);
        } else if (ordinalNumber == 2) {
            System.out.println("It is: " + b);
        } else {
            for (int i = 3; i <= ordinalNumber; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println("It is: " + c);
        }
    }
}
