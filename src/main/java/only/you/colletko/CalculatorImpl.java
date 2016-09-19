package only.you.colletko;

import java.util.Collection;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculatorImpl implements Calculator {

	private static final Logger _logger = LoggerFactory.getLogger(CalculatorImpl.class);
	
	@Override
	public int add(int x, int y){
		return x + y;
	}
	
	@Override
	public int subtract(int x, int y){
		return x - y;
	}	

	@Override
	public int multiply(int x, int y){
		return x * y;
	}
	
	@Override
	public int divide(int x, int y){
		return x / y;
	}
}
