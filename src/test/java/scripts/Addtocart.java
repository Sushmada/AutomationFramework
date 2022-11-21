package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddtocartPage;
import pomPages.SkillraryDemoLogin;
import pomPages.SkillraryLogin;

public class Addtocart extends BaseClass 
{
	
	@Test
	public void tc1() throws FileNotFoundException, IOException, InterruptedException 
	{
		SkillraryLogin s = new SkillraryLogin(driver);
		s.gerasButton();
		s.skillrarayApplication();
		
		util.switchTabs(driver);
		
		SkillraryDemoLogin d = new SkillraryDemoLogin(driver);
		util.mouseHover(driver, d.getCoursebtn());
		d.seleniumtrainingbtn();
		
		AddtocartPage a = new AddtocartPage(driver);
		util.doubleClick(driver, a.getAddbtn());
		a.addtocartbutton();
		util.alertpopup(driver);
		
		
		Assert.assertEquals(driver.getTitle(), pdata.getData("addtocarttitle"));
		Reporter.log(driver.getTitle(),true);
		
	}
	
	

}
