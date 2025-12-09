package pagepckg;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurpllePage {
	WebDriver driver;
	
	@FindBy(xpath = "//*[@placeholder=\"What are you looking for?\"]")
	WebElement searchbox;
	@FindBy(xpath = "//*[@id=\"body\"]/app-root/div/div/app-header/div[2]/desktop-search-content/div[1]/div/div[1]/p/input")
	WebElement searchbutton;
	@FindBy(xpath = "//*[@id=\"body\"]/app-root/div/div/app-header/div[2]/desktop-search-content/div[1]/div/div[1]/button")
	WebElement searchclick;
	@FindBy(xpath="//*[@id=\"filterHeader\"]/div/div/ul/li[1]/a/span[1]/i")
	WebElement categories;
	@FindBy(xpath="//*[@id=\"filter_0\"]/ul/li[2]/label/div/span")
	WebElement haircareKit;
	@FindBy(xpath="//*[@id=\"filter_0\"]/div[2]/a/span")
	WebElement applyFilter;
	@FindBy(xpath  = "/html/body/app-root/div/div/div/server-driven-listing/div[2]/div[1]/div[4]/div/app-listing-item[1]/div/div/div/div/div[3]/a[1]")
	WebElement cart;	
	@FindBy(xpath="//*[@id=\"body\"]/app-root/div/div/app-header/header/div[3]/div/div/div[2]")
	List<WebElement> header;
	@FindBy(xpath="//*[@id=\"body\"]/app-root/div/div/app-header/header/div[3]/div/div/div[2]/div[1]/a")
	WebElement shopcategry;
	@FindBy(xpath = "//*[@id=\"body\"]/app-root/div/div/app-header/header/div[3]/div/div/div[2]/div[1]/div/div/div[1]/div/a[5]")
	WebElement item;
	
	public PurpllePage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void title() {
		String expTitle="Purplle.com";
		String actTitle=driver.getTitle();
		if(expTitle.equals(actTitle)) {
			System.out.println("Title matches");
		}
		else
			{
				System.out.println("Title not matches");
			}
	}
	public void linkCount() {
		List<WebElement> lc= driver.findElements(By.tagName("a"));
		int linkcnt=lc.size();
		System.out.println("Link Count = "+linkcnt);
	}
		public void search(String value) {
			searchbox.click();
			searchbutton.sendKeys(value+Keys.ENTER);
		}
		public void categoriesMenu() throws Exception {
			Thread.sleep(2000);
			categories.click();
			Thread.sleep(2000);
			haircareKit.click();
			applyFilter.click();
		}
		public void addToCart() throws Exception {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,250)");
			Thread.sleep(2000);
			cart.click();
		}
		public void Headerelements() {
			List<WebElement> li=header;
			for(WebElement tmp:header) {
				String headerlist=tmp.getText();
				System.out.println(headerlist);
			}
		}
		public void shopCategoryList() throws Exception {
			Thread.sleep(2000);
			Actions act=new Actions(driver);
			act.moveToElement(shopcategry).perform();
			item.click();
		}
}
