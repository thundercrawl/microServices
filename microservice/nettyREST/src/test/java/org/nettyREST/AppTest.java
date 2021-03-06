package org.nettyREST;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

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
       System.out.println("Test regex in java");
       String regex = "/user/([^/]+)";
       String uri = "/user/1000012";
       Pattern pattern = Pattern.compile("^" + regex + "$");
      
       Matcher matcher = pattern.matcher(uri);
       if(matcher.find())
       {
    	   System.out.println(matcher.groupCount());
       }
       
       System.out.println("first param:"+uri.split("/")[0]);
       
    }
    
}
