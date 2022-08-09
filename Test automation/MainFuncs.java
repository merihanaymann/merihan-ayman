package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class MainFuncs   {




public void enterValue (String value , WebElement elem ) { 
	 elem.sendKeys(value);
	 
};

public void pressEnter (WebElement elem ) { 
	 elem.sendKeys(Keys.ENTER);
};

public void checkValue (String value , WebElement elem ) { 
	 enterValue(value , elem);
	 pressEnter (elem);
	 
};

public void clickonElement (WebElement button ) { 
	button.click();
};

public void checkText (String txt , WebDriver driver ) { 
	driver.getPageSource().contains(txt);
};

public String getURL ( WebDriver driver ) { 
	String nexturl= driver.getCurrentUrl();
	return nexturl;
};

public void scrollDown (WebDriver driver ) { 
  ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	};

	
public void checkAutoSuggestedValues (List<WebElement> options ,String searchValue  ) { 
	System.out.println(options.size());
	for( int i=0 ; i<options.size() ; i++)
	   {
		String itemName = options.get(i).getText();
		Assert.assertTrue( itemName.contains(searchValue));
		System.out.println(itemName); 
		};
	};
	
public void navigatetoHome(WebDriver driver , String url ) { 
	    driver.navigate().to(url);
		
		};	
	
public void checkNextURL (WebDriver driver ,String searchValue  ) { 
		Assert.assertTrue(this.getURL(driver).contains(searchValue));
		
		};
		
public void checkNoNavigation (WebDriver driver ,String searchValue  ) { 
			Assert.assertFalse(this.getURL(driver).contains(searchValue));
			
			};
	
public void searchbyValueinlist (List<WebElement> options ,String searchValue  ) { 
		System.out.println(options.size());
		for( int i=0 ; i<options.size() ; i++)
		   {
			String itemName = options.get(i).getText();
			if (itemName.contains("testing"))
			{ options.get(i).click();
			
			};
}; }
	
	
	
public WebElement getElementbyName (String elementName , WebDriver driver) { 
	 WebElement elem = driver.findElement(By.name(elementName));
	return elem ; 
	 
};

public WebElement getElementbyID (String elementName , WebDriver driver) { 
	 WebElement elem = driver.findElement(By.id(elementName));
	return elem ; 
	 
};

public WebElement getElementbyXpath (String elementName , WebDriver driver) { 
	 WebElement elem= driver.findElement(By.xpath(elementName));
	return elem ; 
	 
};

public List<WebElement> getElementsbyXpath (String elementName , WebDriver driver) { 
	List<WebElement> options = driver.findElements(By.xpath(elementName));
	return options ; 
	 
};


public List<WebElement> getElementsbyTagname (String elementName , WebDriver driver) { 
	List<WebElement> options = driver.findElements(By.tagName(elementName));
	return options ; 
	 
};



public void checkRelevantresults (List<WebElement> matchedTextRes , String value , List<WebElement> hrefs) {
	
	if (value.length() > 3 );
		   {
			 value = getSubstr (value);
		   }
	value = ignoreCase(value);
	for( int i=0 ; i<matchedTextRes.size() ; i++)
	   {
		String itemName = ignoreCase(matchedTextRes.get(i).getText());
		Assert.assertTrue( itemName.contains(value));
	   }  
		
     //googletransaltionLink extractor and prints links in console 
	int count = 1;
	for( int i=0 ; i<hrefs.size() ; i++)
	{
		  String href =  hrefs.get(i).getAttribute("href");
		   if (!href.contains("google" ))
		   {
			   System.out.println("Result " + count + " : Href > "  + href+ " " );
		              count ++;
		   } 
		   }

};

//deleting last 2 chars from search value 
public String getSubstr (String value ) { 
	value = value.substring(0, value.length()- 2);
	return value ; 
	 
};

//ignoringCasesensitive

public String ignoreCase (String value ) { 
	value = value.toLowerCase();
		return value ; 
}




////Results extractor and prints in console 
//List<WebElement> resultEntries = driver.findElements(By.xpath("//div[@class='yuRUbf']//a"));
//int count = 1;
//for( int i=0 ; i<resultEntries.size() ; i++)
//{
//	  String href =  resultEntries.get(i).getAttribute("href");
//	  
//	   if (!href.contains("google" ))
//	   {
//		   System.out.println("Result " + count + " : Href > "  + href+ " " );
//	              count ++;
//	   }
//}


}
