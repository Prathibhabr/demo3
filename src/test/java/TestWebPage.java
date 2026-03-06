    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.testng.Assert;
    import org.testng.annotations.AfterTest;
    import org.testng.annotations.BeforeTest;
    import org.testng.annotations.Test;
    import staticorg.testng.Assert.assertTrue;
    public classWebPageTest
    {
        private staticWebDriver driver;
        @BeforeTest
                publicvoidopenBrowser() throws InterruptedException
        {
            driver = newChromeDriver();
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.get("https://sarvarbegum-coder.github.io/LAB_1/");
        }
        @Test
                publicvoidtitleValidationTest()
        {
            String actualTitle = driver.getTitle();
            String expectedTitle = "My simple website";
            Assert.assertEquals(actualTitle, expectedTitle);
            assertTrue(true, "Title should contain 'simple'");
        }
        @AfterTest
                publicvoidcloseBrowser() throws InterruptedException
        {
            Thread.sleep(1000);
            driver.quit();
        }
    }


