package AutoAdvanceClassTwo;
import java.util.Random;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Parameters {
SoftAssert softassert=new SoftAssert();
static WebDriver driver = new ChromeDriver();
 Random rand =new Random();
///////////////////////////////////////////urls///////////////////////////////////////////
    String mainpage = "https://magento.softwaretestingboard.com/";
	String SignUp = "https://magento.softwaretestingboard.com/customer/account/create/";
	String Logoutt = "https://magento.softwaretestingboard.com/customer/account/logout/";
	String login = "https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/";
////////////////////////////////////************///////////////////////////////////////////
    String [] firstNames= {"rawan","lubna","alaa"};
    String [] lastNames= {"khaled","mohammed","mutaz"};
	int RandomEmail=rand.nextInt(999);
	int RandomNames=rand.nextInt(3);
	String firstName=firstNames[RandomNames];
	String lastName=lastNames[RandomNames];
	String Email=firstName+lastName+RandomEmail+"@outlook.com";
	String Password="abuzir123";


 
}
