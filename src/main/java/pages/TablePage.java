package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TablePage extends PageBase{

	public TablePage(WebDriver driver) {
		super(driver);
		
	}
	
	// Elements 
	
	@FindBy(id = "task-table")
	WebElement table;
	
	@FindBy(tagName = "tr")
	List<WebElement> rows;
	

	@FindBy(tagName = "td")
	List<WebElement> cols;
	
	//   //tr[contains(.,'SEO tags')]
	
	@FindBy(xpath = "//tr[contains(.,'SEO tags')]")
	WebElement seo_element;
	
	@FindBy(xpath = "//tr[contains(.,'Wireframes')]")
	WebElement Wireframes;
	
	@FindBy(xpath = "//tr[contains(.,'Landing Page')]")
	WebElement Landing_Page;
	
	@FindBy(xpath = "//tr[contains(.,'Bootstrap 3')]")
	WebElement Bootstrap;
	
	@FindBy(xpath = "//tr[contains(.,'jQuery library')]")
	WebElement jQuery_library;
	
	@FindBy(xpath = "//tr[contains(.,'Browser Issues')]")
	WebElement Browser_Issues;
	
	@FindBy(xpath = "//tr[contains(.,'Bug fixing')]")
	WebElement Bug_fixing;
	
 
	public void getByTaskName(String value) {
		
		
		
		 
		switch (value) {
		case "SEO tags":
			System.out.println(seo_element.getText());
			
			
		case "Wireframes":
			System.out.println(Wireframes.getText());
			break;
			
		case "Landing Page":
			System.out.println(Landing_Page.getText());
			break;
			
			
		case "Bootstrap":
			System.out.println(Bootstrap.getText());
			break;
			
			
		case "jQuery library":
			System.out.println(jQuery_library.getText());
			break;
			
			
		case "Browser Issues":
			System.out.println(Browser_Issues.getText());
			break;
			
			
		case "Bug fixing":
			System.out.println(Bug_fixing.getText());
			break;

		
		}
		
		

		
		
		
	}

}
