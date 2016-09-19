package only.you.colletko;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class CalculatorTest {

	private Calculator calculator = new CalculatorImpl();
	
	@Test
	public void test1() {
		assertThat(calculator.add(12, 45), is(equalTo(57)));
	}
	
	@Test
	public void test2() {
		assertThat(calculator.subtract(44, 33), is(equalTo(11)));
	}
	
	@Test
	public void test3() {
		assertThat(calculator.multiply(21, 10), is(equalTo(210)));
	}
	
}
