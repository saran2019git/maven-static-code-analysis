package com.mkyong.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMessageBuilder {

    @Test
    public void testNameMkyong() {

       // MessageBuilder obj = new MessageBuilder();
       // assertEquals("Hello mkyong", obj.getMessage("mkyong"));
	    assertEquals("Hello mkyong", "Hello mkyong");
		assertEquals("Hello mkyong", "Hello mkyong1");
		assertEquals("Hello mkyong", "Hello mkyong");
		assertEquals("Hello mkyong", "Hello mkyong");

    }

    /*@Test
    public void testNameEmpty() {

        MessageBuilder obj = new MessageBuilder();
        assertEquals("Please provide a name!", obj.getMessage(" "));

    }

    @Test
    public void testNameNull() {

        MessageBuilder obj = new MessageBuilder();
        assertEquals("Please provide a name!", obj.getMessage(null));

    }*/

}
