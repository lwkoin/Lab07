package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    public static String fizzbuzz(int i) {
        if(i%3 == 0) return "Fizz";
        else return "Buzz";
    }
}
