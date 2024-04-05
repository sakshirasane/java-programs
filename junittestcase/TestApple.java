package junittestcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestApple {

	@Test//+ve tset case
	void testCorrectcolor() {
		Apple apple= new Apple();
		apple.setColor("green");
		assertTrue(apple.checkcolor());
				
	}
	
	@Test//-ve tset case
	void testwrrongcolor() {
		Apple apple= new Apple();
		apple.setColor("Blue");
		assertFalse(apple.checkcolor());
				
	}

}
