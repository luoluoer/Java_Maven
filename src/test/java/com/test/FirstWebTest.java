package com.test;

import org.openqa.selenium.chrome.ChromeDriver;
public class FirstWebTest {
	public static void main(String[] args) {
		//1.´ò¿ªchromeä¯ÀÀÆ÷
		ChromeDriver chromedriver = new ChromeDriver();
		
		chromedriver.get("https://www.baidu.com");
	}
}
