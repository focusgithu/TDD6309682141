package core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUNITStackTest {

	@Test
		public void testCreateNewEmptyStack() {
			Stack TestStack = new Stack();
			TestStack.push(1);
			
			int size = TestStack.getSize();
			assertEquals(1,size);

			

		}

}
