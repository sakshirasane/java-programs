package junittestcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSquare {

	@Test
	void test() {
	Methods obj=new Methods();
	int actualresult = obj.sqaure(2);
	
	assertEquals(4, actualresult);
	
	}

}
