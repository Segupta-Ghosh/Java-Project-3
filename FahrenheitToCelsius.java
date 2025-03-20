package com.mycompany.fahrenheitToCelsius;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        
        // Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;
        
        // Display the result
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
        
        scanner.close();
    }
}

