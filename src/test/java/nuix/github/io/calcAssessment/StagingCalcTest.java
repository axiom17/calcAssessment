package nuix.github.io.calcAssessment;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StagingCalcTest extends WebDriverTest {

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://nuix.github.io/senior-sdet/stagingCalc/index.html");

        mainPage = new MainPage(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void addition1() {
        mainPage.one.click();
        mainPage.add.click();
        mainPage.three.click();
        mainPage.equals.click();
        assertEquals(mainPage.answerBox.getText(), "4");
    }

    @Test
    public void addition2() {
        mainPage.five.click();
        mainPage.add.click();
        mainPage.six.click();
        mainPage.equals.click();
        assertEquals(Integer.parseInt(mainPage.answerBox.getText()), 11);
    }

    @Test
    public void addition3() {
        mainPage.three.click();
        mainPage.add.click();
        mainPage.seven.click();
        mainPage.equals.click();
        assertEquals(mainPage.answerBox.getText(), "10");
    }

    @Test
    public void addition4(){
        mainPage.one.click();
        mainPage.add.click();
        mainPage.three.click();
        mainPage.add.click();
        mainPage.five.click();
        mainPage.add.click();
        mainPage.six.click();
        mainPage.add.click();
        mainPage.three.click();
        mainPage.add.click();
        mainPage.seven.click();
        mainPage.equals.click();
        assertEquals(25, Integer.parseInt(mainPage.answerBox.getText()));
    }

    /**
     * 1. 5/1
     * 2. 6/2
     * 3. 100/2
     * 4. 0/2
     * 5. 4/0
     */

    @Test
    public void division1(){
        mainPage.five.click();
        mainPage.divide.click();
        mainPage.one.click();
        mainPage.equals.click();
        assertEquals(5, Integer.parseInt(mainPage.answerBox.getText()));
    }

    @Test
    public void division2(){
        mainPage.six.click();
        mainPage.divide.click();
        mainPage.two.click();
        mainPage.equals.click();
        assertEquals(3, Integer.parseInt(mainPage.answerBox.getText()));
    }

    @Test
    public void division3(){
        mainPage.one.click();
        mainPage.zero.click();
        mainPage.zero.click();
        mainPage.divide.click();
        mainPage.two.click();
        mainPage.equals.click();
        assertEquals(50, Integer.parseInt(mainPage.answerBox.getText()));
    }

    @Test
    public void division4(){
        mainPage.zero.click();
        mainPage.divide.click();
        mainPage.two.click();
        mainPage.equals.click();
        assertEquals(0, Integer.parseInt(mainPage.answerBox.getText()));
    }

    @Test
    public void division5(){
        mainPage.four.click();
        mainPage.divide.click();
        mainPage.zero.click();
        mainPage.equals.click();
        assertEquals(mainPage.answerBox.getText(), "Error");
    }

    /**
     *  1. 0.5+2.65354
     *  2. 1.25-.25/0
     */

    @Test
    public void decimalAdd(){
        mainPage.zero.click();
        mainPage.decimal.click();
        mainPage.five.click();
        mainPage.add.click();
        mainPage.two.click();
        mainPage.decimal.click();
        mainPage.six.click();
        mainPage.five.click();
        mainPage.three.click();
        mainPage.five.click();
        mainPage.four.click();
        mainPage.equals.click();
        assertEquals(3.15354, Float.parseFloat(mainPage.answerBox.getText()));
    }

    @Test
    public void decimalSubtract(){
        mainPage.one.click();
        mainPage.decimal.click();
        mainPage.two.click();
        mainPage.five.click();
        mainPage.subtract.click();
        mainPage.zero.click();
        mainPage.decimal.click();
        mainPage.two.click();
        mainPage.five.click();
        mainPage.divide.click();
        mainPage.zero.click();
        assertEquals("0", mainPage.answerBox.getText());
    }

    @Test
    public void multiply(){
        mainPage.four.click();
        mainPage.multiply.click();
        mainPage.five.click();
        mainPage.equals.click();
        assertEquals(20, Integer.parseInt(mainPage.answerBox.getText()));
    }

}
