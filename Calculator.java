/*
	implements class Calculator
*/

public class Calculator {

	private int result;
	
	// @param params Аргументы суммирования
	public void add (int ... params) {
		for (Integer param : params) {
			this.result += param;
		}
	}
	
	// @return результат вычисления	
	public int getResult() {
		return this.result;
	}
	
	// clear result
	public void cleanResult(){
		this.result = 0;
	}

	
}