package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import static org.example.App.fizzbuzz;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    public void testFizzBuzz()
    {
        assertEquals("Fizz", fizzbuzz(9));
        assertEquals("Buzz", fizzbuzz(10));
        assertEquals("FizzBuzz", fizzbuzz(15));
        assertEquals("31", fizzbuzz(31));
    }
}
