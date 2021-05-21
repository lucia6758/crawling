package com.sbs.selenium.exam;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
		
		Path path= Paths.get(System.getProperty("user.dir"),"src/main/resources/chromedriver.exe");
		
		//WebDriver 경로 설정
		System.setProperty("webdriver.chrome.driver", path.toString());
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized"); //전체화면으로실행
		options.addArguments("--disable-popup-blocking"); //팝업무시
		options.addArguments("--disable-default-apps"); //기본앱사용안함
		
		//WebDriver 객체생성
		ChromeDriver driver = new ChromeDriver(options);
		
		//빈탭생성
		driver.executeScript("window.open('about:blank','_blank')");
		
		List<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		
		//첫번째탭으로 전환
		driver.switchTo().window(tabs.get(0));
		driver.get("http://www.naver.com");
	}

}
