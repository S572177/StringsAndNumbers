/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.nwmissouri.spring24.cs44542.sec03.objects;

/**
 *
 * @author S572177
 */
import java.util.Random;
import java.util.*;

public class StringsAndNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //point1
        String stringExample = "Working with String Methods in Java!";
        System.out.println(stringExample);
        System.out.println("The length of stringExample is " + stringExample.length());
        System.out.println("The fifth index in stringExample is " + stringExample.charAt(5));

        //point2
        System.out.println("The substring is " + stringExample.substring(11, 17));
        if (stringExample.contains("Methods")) {
            System.out.println("The substring methods is present within the stringExample: " + "Present");
        } else {
            System.out.println("The substring methods is present within the stringExample: " + "Not Present");
        }

        //point3
        String firstName = "Swetha";
        String lastName = "Kamineni";
        String fullName = firstName + "_" + lastName;
        System.out.println("The concatenated  string is:" + fullName);
        System.out.println("The concatenated string in lowercase is:" + fullName.toLowerCase());
        System.out.println("The concatenated string in uppercase is:" + fullName.toUpperCase());

        //point4
        String sampleText = "There are many string methods in Java!";
        System.out.println("The result after replacement is:" + sampleText.replace("many", "various"));

        //point5
        String searchText = "Java is an Object-Oriented Programming Language. Java is a high level,robust and secure programming language.";
        System.out.println("The index of second occurence of Java is" + (searchText.lastIndexOf("Java") + 1));
        System.out.println("The searchText after trimming the spaces at the beginning and end is:" + searchText.trim());

        //point6
        String messageA = "hello";
        String messageB = "HELLO";
        //ignoring Case Sensitivity

        if (messageA.equalsIgnoreCase(messageB)) {
            System.out.println("The result of comparing messageA and messageB ignoring case sensitivity is:false");
        } else {
            System.out.println("The result of comparing messageA and messageB ignoring case sensitivity is:true");
        }

        //Considering Case Sensitivity
        if (messageA.equals(messageB)) {
            System.out.println("The result of comparing messageA and messageB considering case sensitivity is:false");
        } else {
            System.out.println("The result of comparing messageA and messageB considering case sensitivity is:true");
        }

        //point7
        System.out.println("The result after joining fristName and lastName with a hyphen is:" + firstName + "_" + lastName);

        //Random class
        System.out.println("!!!!!!RANDOM CLASS!!!!!");
        Random Team2 = new Random();
        int player1 = Team2.nextInt(30 - 21) + 21;
        int player2 = Team2.nextInt(30 - 21) + 21;

        System.out.println("The Total Score for Team 2 is:" + (player1 + player2));
        System.out.println("Random values between 0.0 and 1.0 withseed value of 20");
        Random ran1 = new Random(20);
        for (int i = 0; i < 5; i++) {
            System.out.println("Random Value" + (i + 1) + "" + ran1.nextFloat());
        }

        System.out.println("Random values between 0.0 and 0.1 with no seed value");
        Random ran2 = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println("Random Value" + (i + 1) + "" + ran2.nextFloat());
        }
        System.out.println("!!!!!!!MathClass!!!!!!");
        int num1 = -20;
        int num2 = 15;
        int absolutedifference = Math.abs(num1 - num2);
        System.out.println("The absolute difference between -20 and 15 is:" + absolutedifference);

        float a = (float) 14.6;
        float b = (float) 3.8;
        float integer = (float) a * b;
        float round = (float) Math.round(integer);
        System.out.println("The result of (14.6 * 3.8) rounded to the nearest integer is:" + round);

        float c = (float) 29.7;
        float d = (float) 4.2;
        float floor = (float) Math.floor(c / d);
        System.out.println("The floor value of (29.7/4.2) is:" + floor);

        int i = 10;
        double I = Math.pow(i, 2);
        int j = 20;
        double J = Math.pow(j, 2);
        double sum = I + J;
        System.out.println("The square root of the sum of squares of 10 and 20 is:" + Math.sqrt(sum));

        int log = (int) (Math.log(256) / Math.log(2));
        System.out.println("The value of logarithm bae 2 of 256 is:" + log);
        int minValue = Math.min(Math.min(Math.min(Math.min(-5,-10),0),15),8);
        System.out.println("The minimum value is: "+ minValue);
        
        int product = 7 *9;
        int quotient = 40 / 5;
        int maxValue = Math.max(product, quotient);
        System.out.println("The Maximum Value is: " + maxValue);
        
        double ThrityDegrees  = Math.toRadians(30);
        double sixtyDegrees = Math.toRadians(60);
        double sin30 = Math.sin(ThrityDegrees);
        double cos60 = Math.cos(sixtyDegrees);
        double result = sin30 * cos60;
        System.out.println("The result of sine of 30 degrees and cosine of 60 degrees is: " + result);
        
        
        
        double FortyFiveDegrees = Math.toRadians(45);
        
        double tagent = Math.tan(FortyFiveDegrees - ThrityDegrees);
        System.out.println("The result of the tangent of the difference between 45 and 30 degress is:"+ tagent);
        double expression = Math.abs(3 - 5) + Math.sqrt(25) - 7 * 2 / 2;
        System.out.println("The result of expression is "+expression );
        
        System.out.println("The equalsIgnoreCase ignores the case where as equals those don't ignore case");
        
        System.out.println("Setting a specific seed value initializes the internal state of the random number generator, leading to a deterministic sequence of random numbers. Reproducibility is important in scenario like scientific simulations or testing, where consistent results are needed for analysis or verification.");
        System.out.println("We can access Math method with Math class followed by dot");
    }
}
