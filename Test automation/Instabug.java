package test;

import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Instabug extends MainFuncs implements elements {
	

	WebDriver driver = null ;


@BeforeTest 
	public void setupTest() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver() ;
		 driver.manage().window().maximize();
			 
		}
	

@Test 
//Check check Search bar accepts Arabic letters 
public void checkArabicInputs() throws InterruptedException {
	this.navigatetoHome(driver, URL);
	this.checkValue(arabicletter , this.getElementbyName(sbName,driver));
	
	
};

@Test 
//Check check Search bar accepts special chars 
public void checkSpcCharsInputs() throws InterruptedException {
	this.navigatetoHome(driver, URL);
	this.checkValue(specialchars , this.getElementbyName(sbName,driver));
	
	
};


@Test 
//Check check Search bar accepts spaces  
public void checkSpaceInputs() throws InterruptedException {
	this.navigatetoHome(driver, URL);
	this.checkValue(spaces , this.getElementbyName(sbName,driver));
	
	
};

@Test 
//Check check Search bar accepts numbers  
public void checkNumsInputs() throws InterruptedException {
	this.navigatetoHome(driver, URL);
	this.checkValue(numbers, this.getElementbyName(sbName,driver));
	
	
};

@Test 
//Check check Search bar accepts other language  
public void checkOtherlangInputs() throws InterruptedException {
	this.navigatetoHome(driver, URL);
	this.checkValue(otherLanguage , this.getElementbyName(sbName,driver));
	
	
};

@Test 
//Check check Search bar accepts one char  
public void checkOneCharlangInputs() throws InterruptedException {
	this.navigatetoHome(driver, URL);
	this.checkValue(oneChar , this.getElementbyName(sbName,driver));
	
	
};

@Test 
//Check check Search bar accepts long text  
public void checkLongTxtInputs() throws InterruptedException {
	this.navigatetoHome(driver, URL);
	this.checkValue(longTxt , this.getElementbyName(sbName,driver));
	
	
};




@Test
////check invalid search 
public void invalidInput() throws InterruptedException {
	this.navigatetoHome(driver, URL);
	this.enterValue(invalidValue , this.getElementbyName(sbName,driver));
	this.pressEnter(this.getElementbyName(sbName,driver));
    this.checkText(error, driver);
};


@Test 
//check search by search button
public void searchbySearchButton() throws InterruptedException {
	this.navigatetoHome(driver, URL);
	this.enterValue(searchValue , this.getElementbyName(sbName,driver));
	Thread.sleep(5000);
    this.scrollDown(driver);
    this.clickonElement(this.getElementbyName(srchbtnName,driver));
	//Thread.sleep(5000);
    TimeUnit.SECONDS.sleep(5);
	this.checkNextURL( driver , searchValue );

};

@Test 
//check search by enter
public void searchbyEnter() throws InterruptedException {
	this.navigatetoHome(driver, URL);
	this.enterValue(searchValue , this.getElementbyName(sbName,driver));
	this.pressEnter(this.getElementbyName(sbName,driver));
	Thread.sleep(5000);
	this.checkNextURL( driver , searchValue  ) ;
};



@Test 
//check Auto-suggested list and press on a value in it
public void getSuggestedList() throws InterruptedException {
	this.navigatetoHome(driver, URL);
	this.enterValue(searchValue , this.getElementbyName(sbName,driver));
	//Thread.sleep(5000);
    TimeUnit.SECONDS.sleep(5);
	this.checkAutoSuggestedValues(this.getElementsbyXpath(suggestedListXpath, driver), searchValue);
    this.searchbyValueinlist(this.getElementsbyXpath(suggestedListXpath, driver), searchValue);
		
};




@Test 
//Check relevant Results 
public void checkRelevantresults () throws InterruptedException {
	this.navigatetoHome(driver, URL);
	this.enterValue(searchValue , this.getElementbyName(sbName,driver));
	this.pressEnter(this.getElementbyName(sbName,driver));
     //Thread.sleep(5000);
    // wait(5000);
     TimeUnit.SECONDS.sleep(5);
     checkRelevantresults (this.getElementsbyTagname(resultsTag, driver) , searchValue , this.getElementsbyXpath( hrefsXpath, driver));
     ;
   
	  
		
};

@Test 
//Check search by searchIcon  
public void  SearchbySearchicon() throws InterruptedException {
	this.navigatetoHome(driver, URL);
	this.enterValue(searchValue , this.getElementbyName(sbName,driver));
	this.clickonElement(this.getElementbyXpath(searchiconXpath, driver));
	this.checkNoNavigation( driver , searchValue  ) ;
	this.pressEnter(this.getElementbyName(sbName,driver));

//search by serachIcon  in results page 
	this.clickonElement(this.getElementbyXpath(clrBTnXpath, driver));
	this.clickonElement(this.getElementbyXpath(sb2Xpath, driver));
    this.enterValue(searchValue2, this.getElementbyXpath(sb2Xpath, driver));
	this.clickonElement(this.getElementbyXpath(searchicon2Xpath, driver));
	this.checkNextURL( driver , searchValue2  ) ;
	

	
};


@AfterTest
public void tearDownTest() {
	driver.quit();
	System.out.println("successfully finished");
};


}
