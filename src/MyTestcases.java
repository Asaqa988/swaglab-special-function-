import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestcases extends Parameters {

	@BeforeTest
	public void mySetup() throws InterruptedException {

		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void addTwoItems() throws InterruptedException {

		login();

		// بدي يضيف عنصرين

		add("Backpack", "Bolt");

		logout();

	}

	@Test(priority = 2)
	public void addthreeItems() throws InterruptedException {
		driver.get(myWebsite);

		login();

		// بدي يضيف 3 عناصر

		add("Backpack", "Light", "Onesie");

		Thread.sleep(2000);
		logout();

	}

	@Test(priority = 3)

	public void addFourItems() throws InterruptedException {
		driver.get(myWebsite);

		login();

		// بدي اياه يضيف اربع عناصر

		add("Backpack", "Fleece", "Onesie", "allTheThings");

		Thread.sleep(4000);
		logout();

	}
}
