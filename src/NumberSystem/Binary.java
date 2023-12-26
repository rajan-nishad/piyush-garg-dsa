package NumberSystem;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = sc.nextInt();
        String result = "";
        while(number > 0){
            int rem = number % 2;
            number = number / 2;
            result = rem + result;
        }
        System.out.println(result);
    }
}
