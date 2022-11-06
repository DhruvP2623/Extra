package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;

public class HomePage {


    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }


    public String getTextFromElement(By by){
        return driver.findElement(by).getText();
    }

    public void typeText(By by, String text) {
        driver.findElement(by).sendKeys(text);

    }

    @BeforeMethod
    public void openBrowser() {
        //.setProperty command is used for sets the property of the system which is indicated by a key
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
        // To communicate test scripts with Google Chrome
        driver = new ChromeDriver();
        // To maximize the browser
        driver.manage().window().maximize();
        //.get() method is used to open URL and it will wait till the whole page gets loaded
        driver.get("https://demo.nopcommerce.com/");
    }

    @AfterMethod
    public void CloseBrowser() {
        driver.close();
    }

    protected static WebDriver driver;

    @Test
    public void register() {
        //set the path of the driver for the chrome Browser
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
        //Printing Output for timeStamp
        System.out.println(timeStamp);
        clickOnElement(By.className("ico-register"));
        //By.id for(FirstName) locate a particular web element using the value of its id attribute.
        clickOnElement(By.id("gender-male"));
        //By.id for(FirstName) locate a particular web element using the value of its id attribute.
        typeText(By.id("FirstName"), "Rajesh");
        //By.id for(LastName) locate a particular web element using the value of its id attribute.
        typeText(By.id("LastName"), "Patel");
        typeText(By.xpath("//div[@class=\"date-picker-wrapper\"]/select[1]"), "8");
        typeText(By.xpath("//div[@class=\"date-picker-wrapper\"]/select[2]") , "June");
        typeText(By.xpath("//div[@class=\"date-picker-wrapper\"]/select[3]") , "1985");
        //By.id for(Email) locate a particular web element using the value of its id attribute.
        typeText(By.id("Email"), "Rajesh" + timeStamp + "@gmail.com");
        //By.id for(Company) locate a particular web element using the value of its id attribute.
        typeText(By.id("Company") , "Dp Company");
        clickOnElement(By.id("Newsletter"));
        //By.id for(Password) locate a particular web element using the value of its id attribute.
        typeText(By.id("Password"), "rajesh");
        //By.id for(ConfirmPassword) locate a particular web element using the value of its id attribute.
        typeText(By.id("ConfirmPassword"), "rajesh");
        //By.id for(register-button) locate a particular web element using the value of its id attribute.

        clickOnElement(By.id("register-button"));

        //By.className for(result) Initializes a new instance of the By class.
        //.getText() command is used for helps retrieve the text for a specific web element
        //regMsg is local variable to store the find element through .getText command
        String regMsg = getTextFromElement(By.className("result"));
        //Printing output for regMsg
        System.out.println(regMsg);


    }

    @Test
    public void Emailtofriend (){
        /*.xpath function for(apple-macbook-pro-13-inch) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        //.click() command works to simulate user click
        clickOnElement(By.xpath("//h2[@class=\"product-title\"]//a[@href=\"/apple-macbook-pro-13-inch\"]"));
        /*.xpath function for(email-a-friend) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        //.click() command works to simulate user click
        clickOnElement(By.xpath("//div[@class=\"email-a-friend\"]"));
        //By.id for(FriendEmail) locate a particular web element using the value of its id attribute.
        /*.sendKeys for(Ansh123@gmail.com) is a method in a selenium that allows QAs to type content automatically
        into an editable field while executing any tests for form */
        typeText(By.id("FriendEmail") , "Ansh123@gmail.com");
        //By.id for(YourEmailAddress) locate a particular web element using the value of its id attribute.
        /*.sendKeys for(dhruvpatel12345@gmail.com) is a method in a selenium that allows QAs to type content automatically
        into an editable field while executing any tests for form */
        typeText(By.id("YourEmailAddress") ,"dhruvpatel12345@gmail.com");
        //By.id for(PersonalMessage) locate a particular web element using the value of its id attribute.
        /*.sendKeys for(Bro it's a good product) is a method in a selenium that allows QAs to type content automatically
        into an editable field while executing any tests for form */
        typeText(By.id("PersonalMessage") , "Bro it's a good product");
        //By.className for(buttons) Initializes a new instance of the By class.
        //.click() command works to simulate user click
        clickOnElement(By.className("buttons"));
        /*.xpath function for(message-error validation-summary-errors) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        //.getText() command is used for helps retrieve the text for a specific web element
        //regMsg is local variable to store the find element through .getText command
        String regMsg = getTextFromElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]/ul/li"));
        //Printing output space
        System.out.println();
        //Printing output for regMsg
        System.out.println(regMsg);

    }

    @Test
    public void HomepageCategories(){
        /*.xpath function for(computers) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        String regMsg = getTextFromElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/computers\"]"));
        /*.xpath function for(electronics) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        String regMsg1 = getTextFromElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/electronics\"]"));
        /*.xpath function for(apparel) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        String regMsg2 = getTextFromElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/apparel\"]"));
        /*.xpath function for(digital-downloads) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        String regMsg3 = getTextFromElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/digital-downloads\"]"));
        /*.xpath function for(books) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        String regMsg4 = getTextFromElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/books\"]"));
        /*.xpath function for(jewelry) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        String resMsg5 = getTextFromElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/jewelry\"]"));
        /*.xpath function for(gift-cards) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        String resMsg6 = getTextFromElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/gift-cards\"]"));
        //Printing output space
        System.out.println();
        //Printing output for regMsg
        System.out.println(regMsg);
        //Printing output for regMsg1
        System.out.println(regMsg1);
        //Printing output for regMsg2
        System.out.println(regMsg2);
        //Printing output for regMsg3
        System.out.println(regMsg3);
        //Printing output for regMsg4
        System.out.println(regMsg4);
        //Printing output for regMsg5
        System.out.println(resMsg5);
        //Printing output for regMsg6
        System.out.println(resMsg6);
    }

    @Test
    public void NewComments(){
        //clickOnElement It helps simulate the click action users perform in the real world.
        //By.className for(read-more) Initializes a new instance of the By class.
        clickOnElement(By.className("read-more"));
        //By.id for(AddNewComment_CommentTitle) locate a particular web element using the value of its id attribute.
        typeText(By.id("AddNewComment_CommentTitle") ,"Books");
        //By.id for(AddNewComment_CommentText) locate a particular web element using the value of its id attribute.
        typeText(By.id("AddNewComment_CommentText") ,"good news it was");
        //clickOnElement It helps simulate the click action users perform in the real world.
        //By.className for(buttons) Initializes a new instance of the By class.
        clickOnElement(By.className("buttons"));
        //By.className for(result) Initializes a new instance of the By class.
        String regMsg = getTextFromElement(By.className("result"));
        //Printing output space
        System.out.println();
        //Printing output for regMsg
        System.out.println(regMsg);

    }

    @Test
    public void Products(){
        //clickOnElement It helps simulate the click action users perform in the real world.
         /*.xpath function for(computers) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        clickOnElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/computers\"]"));
        //clickOnElement It helps simulate the click action users perform in the real world.
         /*.xpath function for(Show products in category Desktops) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        clickOnElement(By.xpath("//h2[@class=\"title\"]//a[@title=\"Show products in category Desktops\"]"));
         /*.xpath function for(build-your-own-computer) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        String regMsg = getTextFromElement(By.xpath("//h2[@class=\"product-title\"]//a[@href=\"/build-your-own-computer\"]"));
          /*.xpath function for(digital-storm-vanquish-3-custom-performance-pc) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        String regMs1 = getTextFromElement(By.xpath("//h2[@class=\"product-title\"]//a[@href=\"/digital-storm-vanquish-3-custom-performance-pc\"]"));
          /*.xpath function for(lenovo-ideacentre-600-all-in-one-pc) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        String regMsg2 = getTextFromElement(By.xpath("//h2[@class=\"product-title\"]//a[@href=\"/lenovo-ideacentre-600-all-in-one-pc\"]"));
        //Printing output space
        System.out.println();
        //Printing output for regMsg
        System.out.println(regMsg);
        //Printing output for regMsg1
        System.out.println(regMs1);
        //Printing output for regMsg2
        System.out.println(regMsg2);

    }



}
