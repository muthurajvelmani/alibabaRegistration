package org.test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.pagereg.Page;
import org.testng.annotations.Test;
public class Alibabatesting extends Baseclass {
@Test
public void test1() throws InterruptedException, IOException {
	launchbrowser("chrome");
	Thread.sleep(5000);
	launchurl("https://passport.alibaba.com/member/us/reg/fast/union_reg.htm?_regfrom=ICBU_UNION_REG&_lang=en_US");
//	List<WebElement> framees = driver.findElements(By.tagName("iframe"));
	//System.out.println(framees.size());
	//driver.switchTo().frame(0);
	Page alib=new Page();
	Thread.sleep(5000);
	btnclick(alib.clicktrade());
	filltext(alib.mailidfilling(), "muthurj@gmail.in");
    filltext(alib.psw(), "M@74185");
    filltext(alib.repsw(), "M@74185");
    filltext(alib.entercompanyname(), "muthurajsteprivatelimitedinfomianoc");
 
    filltext(alib.fillfirstname(), "asasdfghjkloiuytrcxjytrdfghjnbgtredfghgftgfgffewq");
    filltext(alib.filllastname(), "gkjhgdsxcvhjuytrdcvhuytrdcvhytfghuytfhuytfhytghuyghytfgtd");
    btnclick(alib.clikregister());
  Thread.sleep(5000);
     screenshot("lasttnamebug");
}
}
