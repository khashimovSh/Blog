package com.shakhzod.blog;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class BlogApplicationTests {

	@Test
	void contextLoads() {
	}
	Calculator calculator = new Calculator();
	@Test
	void itShouldAddNumbers()
	{
		// given
		int firstNumber = 10;
		int secondNumber = 20;

		//when
		int result = calculator.add(firstNumber,secondNumber);

		//then
		assertThat(result).isEqualTo(30);

	}

	class Calculator
	{
		int add(int a, int b)
		{
			return a+b;
		}
	}


}
