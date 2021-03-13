package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
	// write your code
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Mai Huyen\\IdeaProjects\\AK30\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    }
}
