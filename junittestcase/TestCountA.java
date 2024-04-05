package junittestcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCountA {

	@Test
	void test() {
		Methods obj=new Methods();	
	int count = obj.countA("Aarvika");
	assertEquals(3, count);
	}

}
