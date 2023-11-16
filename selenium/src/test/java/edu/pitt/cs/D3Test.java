// Generated by Selenium IDE
package edu.pitt.cs;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class D3Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
//    driver = new FirefoxDriver();
    vars = new HashMap<String, Object>();

    ChromeOptions options = new ChromeOptions();
    options.addArguments("--headless");
    driver = new ChromeDriver(options);
    js = (JavascriptExecutor) driver;
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void tEST1LINKS() {
    driver.get("https://cs1632.appspot.com/");
    driver.manage().window().setSize(new Dimension(921, 756));
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    {
      WebElement element = driver.findElement(By.xpath("//li[8]/a"));
      String attribute = element.getAttribute("href");
      vars.put("links", attribute);
    }
    assertEquals(vars.get("links").toString(), "https://cs1632.appspot.com/reset");
  }
  @Test
  public void tEST2RESET() {
    driver.get("https://cs1632.appspot.com/");
    driver.manage().window().setSize(new Dimension(921, 756));
    js.executeScript("document.cookie = \"1=true\";document.cookie = \"2=true\";document.cookie = \"3=true\";");
    driver.findElement(By.xpath("//a[contains(@href, \'/reset\')]")).click();
    assertThat(driver.findElement(By.xpath("//div/ul/li[1]")).getText(), is("ID 1. Jennyanydots"));
    assertThat(driver.findElement(By.xpath("//div/ul/li[2]")).getText(), is("ID 2. Old Deuteronomy"));
    assertThat(driver.findElement(By.xpath("//div/ul/li[3]")).getText(), is("ID 3. Mistoffelees"));
  }
  @Test
  public void tEST3CATALOG() {
    driver.get("https://cs1632.appspot.com/");
    driver.manage().window().setSize(new Dimension(921, 756));
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    driver.findElement(By.xpath("//a[contains(@href, \'/\')]")).click();
    {
      WebElement element = driver.findElement(By.xpath("//li[2]/img"));
      String attribute = element.getAttribute("src");
      vars.put("img_src", attribute);
    }
    assertEquals(vars.get("img_src").toString(), "https://cs1632.appspot.com/images/cat2.jpg");
  }
  @Test
  public void tEST4LISTING() {
    driver.get("https://cs1632.appspot.com/");
    driver.manage().window().setSize(new Dimension(921, 771));
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    driver.findElement(By.xpath("//a[contains(@href, \'/\')]")).click();
    {
      List<WebElement> elements = driver.findElements(By.xpath("//div/ul/li[1]"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//div/ul/li[2]"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//div/ul/li[3]"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//div/ul/li[4]"));
      assert(elements.size() == 0);
    }
    assertThat(driver.findElement(By.xpath("//div/ul/li[3]")).getText(), is("ID 3. Mistoffelees"));
  }
  @Test
  public void tEST5RENTACAT() {
    driver.get("https://cs1632.appspot.com/");
    driver.manage().window().setSize(new Dimension(921, 771));
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    driver.findElement(By.xpath("//a[contains(@href, \'/rent-a-cat\')]")).click();
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button[contains(.,\'Rent\')]"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button[contains(.,\'Return\')]"));
      assert(elements.size() > 0);
    }
  }
  @Test
  public void tEST6RENT() {
    driver.get("https://cs1632.appspot.com/");
    driver.manage().window().setSize(new Dimension(921, 771));
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    driver.findElement(By.xpath("//a[contains(@href, \'/rent-a-cat\')]")).click();
    driver.findElement(By.xpath("//input[@id=\'rentID\']")).click();
    driver.findElement(By.xpath("//input[@id=\'rentID\']")).sendKeys("1");
    driver.findElement(By.xpath("//button[contains(.,\'Rent\')]")).click();
    assertThat(driver.findElement(By.xpath("//div/ul/li[1]")).getText(), is("Rented out"));
    assertThat(driver.findElement(By.xpath("//div/ul/li[2]")).getText(), is("ID 2. Old Deuteronomy"));
    assertThat(driver.findElement(By.xpath("//div/ul/li[3]")).getText(), is("ID 3. Mistoffelees"));
    assertThat(driver.findElement(By.xpath("//div[4]")).getText(), is("Success!"));
  }
  @Test
  public void tEST7RETURN() {
    driver.get("https://cs1632.appspot.com/");
    driver.manage().window().setSize(new Dimension(921, 771));
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=true\";document.cookie = \"3=false\";");
    driver.findElement(By.xpath("//a[contains(@href, \'/rent-a-cat\')]")).click();
    driver.findElement(By.xpath("//input[@id=\'returnID\']")).click();
    driver.findElement(By.xpath("//input[@id=\'returnID\']")).sendKeys("2");
    driver.findElement(By.xpath("//button[contains(.,\'Return\')]")).click();
    assertThat(driver.findElement(By.xpath("//div/ul/li[1]")).getText(), is("ID 1. Jennyanydots"));
    assertThat(driver.findElement(By.xpath("//div/ul/li[2]")).getText(), is("ID 2. Old Deuteronomy"));
    assertThat(driver.findElement(By.xpath("//div/ul/li[3]")).getText(), is("ID 3. Mistoffelees"));
    assertThat(driver.findElement(By.xpath("//div[3]/div[4]")).getText(), is("Success!"));
  }
  @Test
  public void tEST8FEEDACAT() {
    driver.get("https://cs1632.appspot.com/");
    driver.manage().window().setSize(new Dimension(921, 771));
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    driver.findElement(By.xpath("//a[contains(@href, \'/feed-a-cat\')]")).click();
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button[contains(.,\'Feed\')]"));
      assert(elements.size() > 0);
    }
  }
  @Test
  public void tEST9FEED() {
    driver.get("https://cs1632.appspot.com/");
    driver.manage().window().setSize(new Dimension(921, 771));
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    driver.findElement(By.xpath("//a[contains(@href, \'/feed-a-cat\')]")).click();
    driver.findElement(By.xpath("//input[@id=\'catnips\']")).click();
    driver.findElement(By.xpath("//input[@id=\'catnips\']")).sendKeys("6");
    driver.findElement(By.xpath("//button[contains(.,\'Feed\')]")).click();
    assertThat(driver.findElement(By.xpath("//div[4]")).getText(), is("Nom, nom, nom."));
  }
  @Test
  public void tEST10GREETACAT() {
    driver.get("https://cs1632.appspot.com/");
    driver.manage().window().setSize(new Dimension(921, 771));
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    driver.findElement(By.xpath("//a[contains(@href, \'/greet-a-cat\')]")).click();
    {
      List<WebElement> elements = driver.findElements(By.xpath("//h4[contains(.,\'Meow!Meow!Meow!\')]"));
      assert(elements.size() > 0);
    }
  }
  @Test
  public void tEST11GREETACATWITHNAME() {
    driver.get("https://cs1632.appspot.com/");
    driver.manage().window().setSize(new Dimension(921, 771));
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    driver.get("https://cs1632.appspot.com/greet-a-cat/Jennyanydots");
    {
      List<WebElement> elements = driver.findElements(By.xpath("//h4[contains(.,\'Meow! from Jennyanydots.\')]"));
      assert(elements.size() > 0);
    }
  }
}
