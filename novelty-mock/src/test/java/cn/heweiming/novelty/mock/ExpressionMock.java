package cn.heweiming.novelty.mock;

import org.junit.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import cn.heweiming.novelty.mock.bean.Person;

public class ExpressionMock {

	@Test
	public void test01() {
		ExpressionParser parser = new SpelExpressionParser();

		String line = "'Hello world'.concat('!')";
		line = "name";
		Person person = new Person();
		person.setName("张三");

		Expression exp = parser.parseExpression(line);
		Object value = exp.getValue(person);
		System.out.println(value);
	}

	@Test
	public void test02() {
		ExpressionParser parser = new SpelExpressionParser();
		// evals to "Hello World"
		String helloWorld = (String) parser.parseExpression("'Hello World'").getValue();
		double avogadrosNumber = (Double) parser.parseExpression("6.0221415E+23").getValue();
		// evals to 2147483647
		int maxValue = (Integer) parser.parseExpression("0x7FFFFFFF").getValue();
		boolean trueValue = (Boolean) parser.parseExpression("true").getValue();
		Object nullValue = parser.parseExpression("null").getValue();
	}

}
