package com.fca.uconnect.test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import javax.microedition.xlet.XletStateChangeException;

import org.junit.Test;

public class HelloWorldXletTest1 {

	@Test
	public void testInitXlet() {
		fail("Not yet implemented");
	}

	@Test
	public void testPauseXlet() {
		fail("Not yet implemented");
	}

	@Test
	public void testStartXlet() throws XletStateChangeException 
	{
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        HelloWorldXlet xlet = new HelloWorldXlet();
        xlet.startXlet();
        //assertEquals("Hello, World" + System.getProperty("line.separator"), outContent.toString());
        assertEquals(true, outContent.toString().contains("Hello World"));
        System.setOut(null);
		//fail("Not yet implemented");
	}

	@Test
	public void testDestroyXlet() {
		fail("Not yet implemented");
	}

	@Test
	public void testObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetClass() {
		fail("Not yet implemented");
	}

	@Test
	public void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	public void testClone() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testWait() {
		fail("Not yet implemented");
	}

	@Test
	public void testFinalize() {
		fail("Not yet implemented");
	}

}
