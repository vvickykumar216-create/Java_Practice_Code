package Try_Catch_Finally;

import java.util.Scanner;

public class Age {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        String age = sc.nextLine();
        try {
            int ageValue = Integer.parseInt(age);
            System.out.println("Your age is: "+ ageValue);
        }catch (NumberFormatException e){
            System.out.println("Exception: Please enter a valid number");
        }
        sc.close();
    }
}
