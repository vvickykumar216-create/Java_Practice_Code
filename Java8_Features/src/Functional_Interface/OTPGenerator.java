package Functional_Interface;

// Supplier

import java.util.function.Supplier;

public class OTPGenerator {
    public static void main(String[] args) {
        Supplier<Integer> otp = () -> 100000 + (int) (Math.random() * 900000);

        System.out.println("OTP 1: " + otp.get());
        System.out.println("OTP 2: " + otp.get());
        System.out.println("OTP 3: " + otp.get());
    }
}
