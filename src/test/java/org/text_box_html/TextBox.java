package org.text_box_html;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TextBox extends BaseMethod {
	
@BeforeClass
private void beforeclass() {
	browserlauch("chrome");
}
	@Test
	private void text() {
		geturl("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
	    implicitywait(10);
        LoginPage l=new LoginPage();
        List<WebElement> all = l.getAll();
        int size = all.size();
        System.out.println(size);
        all.get(2).sendKeys("kumar");
        click(l.getCheck1());
        click(l.getCheck2());
        click(l.getReadio());
	}
}
