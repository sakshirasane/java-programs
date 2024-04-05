package junittestcase;import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.Test;

public class AssertionMethods {

	
	@Test
	public void testAssertions() {
		int a=10;
		int b=20;
		
		String s1="welcome";
		String s2="welcome";
		String s3=null;
		
		assertSame(a, b);
		
		assertNotSame(a, b);
		
		assertTrue(a==b);
		
		assertTrue(a<b);
	
		assertSame(s1, s2);
		
		assertNull(s1);
		
		assertNotNull(s1);
		
		assertNull(s3);
		
	}
}
