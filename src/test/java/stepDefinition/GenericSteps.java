/*
 * package stepDefinition;
 * 
 * import static org.testng.Assert.assertEquals;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.support.PageFactory;
 * 
 * import configuration.ConfigWeb; import cucumber.api.Scenario; import
 * cucumber.api.java.Before; import cucumber.api.java.en.Given; import
 * cucumber.api.java.en.Then; import cucumber.api.java.en.When; import
 * library.ApplicationLibraryWeb; import pageFactory.HomePage; import
 * pageFactory.LandingPage; import pageFactory.LoginPage;
 * 
 * public class GenericSteps { ApplicationLibraryWeb lib;
 * 
 * public GenericSteps(ApplicationLibraryWeb lib) { this.lib = lib; }
 * 
 * WebDriver dr; static String getUser;
 * 
 * @Given("^I am on Landing Page of AUT$") public void launchApp() throws
 * Exception {
 * 
 * // lib= new ApplicationLibraryWeb();
 * 
 * ConfigWeb.dr = lib.launchBrowser();
 * 
 * this.dr = ConfigWeb.dr; PageFactory.initElements(dr, HomePage.class);
 * PageFactory.initElements(dr, LoginPage.class); PageFactory.initElements(dr,
 * HomePage.class); PageFactory.initElements(dr, LandingPage.class);
 * Thread.sleep(1000);
 * System.out.println(dr.findElement(By.xpath("//span [text()='Hello, Sign in']"
 * )).getText());
 * 
 * }
 * 
 * @When("^I Login with valid \"(.*?)\" and \"(.*?)\"$") public void
 * login(String UserName, String Password) { //
 * System.out.println(dr.findElement(By.xpath()).getText()); try {
 * lib.infoLog("Logging in "); HomePage.signInButton.click();
 * LoginPage.emailTextBox.sendKeys(UserName);
 * LoginPage.passwordTextBox.sendKeys(Password); LoginPage.signInSubmit.click();
 * } catch (Exception e) {
 * 
 * lib.reportFailure("Login failed"); }
 * 
 * }
 * 
 * @Then("^I am logged into my Account successfully as \\\"(.*?)\\\"$") public
 * void verifyLogin(String User) { getUser =
 * LandingPage.signInAccount.getText(); try { assertEquals(getUser, "Hello, " +
 * User); lib.infoLog("User logged in"); } catch (Exception e) {
 * lib.reportFailure("User not logged in "); }
 * 
 * }
 * 
 * 
 * @After public void after() { System.out.println("Report flushing"); //
 * lib.quit(); System.out.println("Report flushed: ");
 * 
 * }
 * 
 * 
 * @Before public void before(Scenario s) throws Exception {
 * System.out.println("In before: " + s.getName());
 * lib.initReports(s.getName()); }
 * 
 * }
 */