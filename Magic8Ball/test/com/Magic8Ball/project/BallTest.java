package com.Magic8Ball.project;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;



public class BallTest {
	public static Ball ball;


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Ball ball = new Ball();
		
	}

	@Test
	public void testgetAnswer() {
		//fail("Not yet implemented");
		Ball ball = new Ball();
		int result = ball.getAnswer(0);
		assertEquals(result, 0);
		//assertNotEquals(result, 1);
	
	}

}
