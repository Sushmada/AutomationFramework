package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.FaceBookpage;
import pomPages.SkillraryDemoLogin;
import pomPages.SkillraryLogin;
import pomPages.Testingpage;

public class Likethefbpage extends BaseClass{
	WebDriver driver;
	
	@Test
	public void tc2() throws InterruptedException, FileNotFoundException, IOException  {
	SkillraryLogin s=new SkillraryLogin(driver);
	s.gerasButton();
	s.skillrarayApplication();
	
	//util.switchingTabs(driver);
	util.switchTabs(driver);
	
	SkillraryDemoLogin d=new SkillraryDemoLogin(driver);
	//util.dropDown(driver.getTitle(), pdata.getData("coursedd"));
	util.dropDown(d.getTestingdd(), pdata.getData("coursedd"));
	
	Testingpage t=new Testingpage(driver);
	t.facebookicons();
	
	FaceBookpage f=new FaceBookpage(driver);
	f.Likebtn();
	
	Thread.sleep(3000);
	Assert.assertEquals(driver.getTitle(), pdata.getData("Facebooktitle"));

}
	
}
	