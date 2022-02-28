package com.test;

import org.openqa.selenium.chrome.ChromeDriver;

public class Elementlocate {
	public static void main(String[] args) {
		
	}
	
	public void openChrome() {
		ChromeDriver chromedriver = new ChromeDriver();
		
		chromedriver.get("https://www.baidu.com");
	}
}
