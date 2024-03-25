package org.text_box_html;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseMethod {
	public LoginPage() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type='text']")
	private List<WebElement> all;

	public List<WebElement> getAll() {
		return all;
	}
	@FindBy(id="check2")
	private WebElement check2;
	@FindBy(id="check1")
	private WebElement check1;;
	@FindBy(id="radio1")
	private WebElement readio;

	public WebElement getCheck2() {
		return check2;
	}
	public WebElement getCheck1() {
		return check1;
	}
	public WebElement getReadio() {
		return readio;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
