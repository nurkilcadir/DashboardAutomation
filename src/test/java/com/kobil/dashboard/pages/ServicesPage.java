package com.kobil.dashboard.pages;

import java.io.IOException;
import org.openqa.selenium.By;
import com.kobil.dashboard.base.TestBase;

public class ServicesPage extends TestBase {
    
	private By btnNewServices = By.xpath("//button[normalize-space()='New Service']");
	private By btnAddMiniApp = By.xpath("//span[normalize-space()='MiniApp']");
    private By txtNameOfMiniApp = By.xpath("//input[@id='title']");
	private By txtSubTitleOfMiniApp = By.xpath("//input[@id='description']");
    private By imgMiniApp =  By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[3]/div[7]/input[1]");
	private By btnCropMiniAppImg = By.xpath("//div[contains(@class,'MuiModal-root MuiDialog-root css-126xj0f')]//button[contains(@type,'button')][normalize-space()='Crop']");
	private By txtUrlOfMiniApp = By.xpath("//input[@id='url']");
	private By txtKeyword = By.xpath("//input[@id='mui-5']");
	private By imgSpotlightImg = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[3]/div[15]/input[1]");
	private By btnCropSpotlight = By.xpath("//button[normalize-space()='Crop']");
	private By btnSelectCategory = By.xpath("//div[normalize-space()='Select a category']");
	private By menuItemEntertainment = By.xpath("//li[normalize-space()='Entertainment']");
	private By btnCreateMiniApp = By.xpath("//button[normalize-space()='Create MiniApp']");
	private By btnDone = By.xpath("//button[normalize-space()='Done']");

	
	public ServicesPage() throws IOException {
		super();
	}
	

	public void addMiniApp() {
		
		driver.findElement(btnNewServices).click();
		driver.findElement(btnAddMiniApp).click();
		driver.findElement(txtNameOfMiniApp).sendKeys(prop.getProperty("mApp_name"));
		driver.findElement(txtSubTitleOfMiniApp).sendKeys(prop.getProperty("mApp_subtitle"));
		driver.findElement(imgMiniApp).sendKeys("/Users/nur/Documents/test_image.png");
		driver.findElement(btnCropMiniAppImg).click();
		driver.findElement(txtUrlOfMiniApp).sendKeys("mApp_url");
		driver.findElement(txtKeyword).sendKeys("mApp_keyword");
		driver.findElement(imgSpotlightImg).sendKeys("/Users/nur/Documents/test_image_2.png");
		driver.findElement(btnCropSpotlight).click();
		driver.findElement(btnSelectCategory).click();
		driver.findElement(menuItemEntertainment).click();
		driver.findElement(btnCreateMiniApp).click();
		driver.findElement(btnDone).click();
		
	}
}
