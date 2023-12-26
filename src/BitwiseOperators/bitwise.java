package BitwiseOperators;

import java.util.Scanner;

public class bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num");
        int num1 = sc.nextInt();
        long startTime = System.nanoTime();
        if(num1 % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
        long endTime = System.nanoTime();
        System.out.println("time taken by num1= "+(endTime-startTime));

        System.out.println("enter num");
        int num2 = sc.nextInt();
        long startTime1 = System.nanoTime();
        if((num2 & 1) == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
        long endTime1 = System.nanoTime();
        System.out.println("time taken by num1= "+(endTime1-startTime1));
    }
}
