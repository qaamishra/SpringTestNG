package com.example;

import com.example.application.CodeOne;
import com.example.commons.ConfigLoader;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringtestngApplication.class)
public class SpringtestngApplicationTests {

	@Autowired
	ConfigLoader configLoader;

	@Autowired
	CodeOne codeOne;

	@Test
	public void mytest() {

		int result=codeOne.myapplication();
		Assert.assertEquals(10,result);
	}

	//You can autowire everthing here ,conceptually this is n ot a unit test ayou are autowiring multiples classes
	//But this is to make you E2E test
	// Now do mvn clean install to get the report in the target
	//.\springtestng\target\surefire-reports\testng-junit-results\index.html
}
