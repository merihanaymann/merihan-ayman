package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public interface elements {
	
    //valuesAndmsgs
final static  	String   arabicletter="منتاليسشطذدزرو";
final static 	String   specialchars = "!@%±))^&*_+P?><[]{}";
final static 	String   numbers = "0123456789";
final static 	String   otherLanguage = "Merhabā/İyi günler" ;
final static 	String   spaces = "como     estas     miss  " ;
final static 	String   searchValue = "automation" ;
final static 	String   oneChar="g";
final static 	String   longTxt="Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";

final static 	String   searchValue2 = "instabug" ;
final static 	String   invalidValue = "!@%%±9))^&*_+*Pfewff22rfdgيبيصبثبثبw" ;
final static 	String   error = "لم ينجح بحثك عن " +invalidValue+ " في إظهار أي نتائج";

	
	//elements in home screen
final static 	String    URL = "https://www.google.com/";
final static 	String   sbName = "q";
final static 	String   srchbtnName ="btnK";
final static 	String suggestedListXpath = "//ul[@role='listbox']//li/descendant::div[@class= 'pcTkSc']" ;
final static 	String searchiconXpath = "//div[@class='iblpc']";

	//elements in results screen
final static 	String resultsTag = "em";
final static 	String  hrefsXpath = "//div[@class='yuRUbf']//a" ;
final static 	String   clrBTnXpath = "//div[@class='BKRPef']";
final static 	String   sb2Xpath = "//input[@class='gLFyf gsfi']";
final static 	String searchicon2Xpath ="//button[@class='Tg7LZd']";
	
}
	






	

