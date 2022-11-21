package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SeleniumPage;
import pomPages.SkillraryLogin;
import pomPages.Takethiscoursepage;

public class Takethiscourse extends BaseClass {
	WebDriver driver;
	@Test
	public void tc3() throws FileNotFoundException, IOException, InterruptedException
	{
		SkillraryLogin s=new SkillraryLogin(driver);
		//s.searchTextbox(pdata.getData("coursename"));
		s.searchTextbox();
		s.seachbutton();
		
		SeleniumPage sel=new SeleniumPage(driver);
		sel.corejavacourse();
		
		Takethiscoursepage t=new Takethiscoursepage(driver);
		util.switchFrame(driver);
		t.playbutton();
		Thread.sleep(15000);
		t.pausebutton();
		util.switchback(driver);
		Thread.sleep(3000);
		t.takethiscoursebtn();
		Thread.sleep(3000);
		//Assert.assertEquals(driver.getCurrentUrl(),pdata.getData("loginpageurl"));

}
}
