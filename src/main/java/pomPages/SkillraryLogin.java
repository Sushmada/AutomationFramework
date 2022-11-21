package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLogin {
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gerasbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillraryDemoapp;
	
	@FindBy(name="q")
	private WebElement searchtb;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchbtn;
	
	
	public SkillraryLogin(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void gerasButton()
	{
		gerasbtn.click();
	}
	
	public void skillrarayApplication()
	{
		skillraryDemoapp.click();
	}

	public void searchTextbox() {
		searchtb.sendKeys("Selenium");
	
	}

	public void seachbutton() {
		searchbtn.click();
	}
	

}
