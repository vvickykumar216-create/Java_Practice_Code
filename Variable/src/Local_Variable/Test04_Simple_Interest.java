package Local_Variable;

import java.util.Scanner;

public class Test04_Simple_Interest {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double principal,rate,time,simpleInterest;
        System.out.print("Enter principal: ");
        principal = input.nextDouble();

        System.out.print("Enter rate: ");
        rate = input.nextDouble();

        System.out.print("Enter time: ");
        time = input.nextDouble();

        simpleInterest = (principal*rate*time) / 100;
        System.out.println("Simple interest = " + simpleInterest);

        input.close();


    }
}

