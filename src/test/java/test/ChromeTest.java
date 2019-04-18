package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author shinan.chen
 * @since 2019/4/15
 */
@Test
public class ChromeTest {

    @BeforeClass
    public void setUp() {
    }

    @Test(description = "test")
    public void test() {

        Logger logger = LoggerFactory.getLogger(ChromeTest.class);
        try {
            String path = "driver/chromedriver";
//            String path = this.getClass().getResource("/driver/chromedriver").getPath();
//            String path = ChromeTest.class.getClassLoader().getResource("driver/chromedriver").getPath();
            System.out.println("test:" + path);
            System.setProperty("webdriver.chrome.driver", path);
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.baidu.com/");
            driver.findElement(By.cssSelector("input#kw")).sendKeys("java");
            driver.findElement(By.cssSelector("input#su")).click();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("以下是广告：");
            driver.findElements(By.cssSelector("h3[class ^='t ']")).forEach(x -> {
                String className = x.getAttribute("class");
                if (className.split(" ").length == 3 && className.length() == 15) {
                    System.out.println(x.getText());
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        } catch (Exception e) {
            System.out.println(e);
        }
//        driver.quit();
    }

    @Test(description = "remote", invocationCount = 100)
    public void remote() {
////        System.out.println("test:" + ChromeTest.class.getClassLoader().getResource("driver/chromedriver").getPath());
//        System.setProperty("webdriver.chrome.driver", ChromeTest.class.getClassLoader().getResource("driver/chromedriver").getPath());
//        WebDriver driver = null;
//        try {
//            driver = new RemoteWebDriver(new URL("http://10.211.102.55:4444/wd/hub"), new ChromeOptions());
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
//        driver.get("https://www.baidu.com/");
//        System.out.println("Page Title is " + driver.getTitle());
//        driver.quit();
    }
}
