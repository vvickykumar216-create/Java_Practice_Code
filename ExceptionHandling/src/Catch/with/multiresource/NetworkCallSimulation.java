package Catch.with.multiresource;

import java.io.IOException;

public class NetworkCallSimulation {
    static void networkCall(int choice) throws IOException, NumberFormatException, ArithmeticException{

        if ( choice == 1){
            throw new IOException();
        }else if (choice == 2){
            throw new NumberFormatException();
        }else if (choice == 3){
            throw new ArithmeticException();
        }else {
            System.out.println("Network call successful");
        }
    }

    static void main(String[] args) {
        try {
            networkCall(1);
        }catch (IOException | NumberFormatException | ArithmeticException e){
            System.out.println("Network Exception Handled");
        }
    }
}
