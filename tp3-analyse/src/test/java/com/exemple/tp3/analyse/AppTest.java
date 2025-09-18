package com.exemple.tp3.analyse;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
    @Test
    public void testHelloSansParam()
    {
        assertEquals("Hello World", App.hello()  );
    }


    @Test
    public void testHelloParametre(){
        String parametre = "Coucou";
        assertEquals(parametre, App.hello(parametre));
    }


}
