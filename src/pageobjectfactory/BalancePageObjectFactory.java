package pageobjectfactory;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Currency;
import java.util.Locale;

public class BalancePageObjectFactory {
    WebDriver driver;

//    Define the Web Elements at class level
    @FindBy(id="lbl_val_1")
    WebElement lbl_val_1;

    @FindBy(id="txt_val_1")
    WebElement txt_val_1;

    @FindBy(id="txt_val_2")
    WebElement txt_val_2;

    @FindBy(id="lbl_val_2")
    WebElement lbl_val_2;

    @FindBy(id="lbl_val_3")
    WebElement lbl_val_3;

    @FindBy(id="lbl_val_4")
    WebElement lbl_val_4;


    @FindBy(id="txt_val_3")
    WebElement txt_val_3;

    @FindBy(id="txt_val_4")
    WebElement txt_val_4;

    @FindBy(id="lbl_val_5")
    WebElement lbl_val_5;

    @FindBy(id="txt_val_5")
    WebElement txt_val_5;

    @FindBy(id="lbl_ttl_val")
    WebElement lbl_ttl_val;

    @FindBy(id="txt_ttl_val")
    WebElement txt_ttl_val;

//    Define the Steps

    public String getLblVal1() {
        return lbl_val_1.getText();
    }

    public Boolean isTxtVal1Displayed() {
        return txt_val_1.isDisplayed();
    }

    public Boolean isLblVal1Displayed() { return lbl_val_1.isDisplayed(); }

    public Boolean isTxtVal2Displayed() {
        return txt_val_2.isDisplayed();
    }

    public Boolean isLblVal2Displayed() {
        return lbl_val_2.isDisplayed();
    }

    public Boolean isTxtVal3Displayed() {
        return txt_val_3.isDisplayed();
    }

    public Boolean isLblVal3Displayed() {
        return lbl_val_3.isDisplayed();
    }

    public Boolean isTxtVal4Displayed() {
        return txt_val_4.isDisplayed();
    }

    public Boolean isLblVal4Displayed() {
        return lbl_val_4.isDisplayed();
    }

    public Boolean isTxtVal5Displayed() {
        return txt_val_5.isDisplayed();
    }

    public Boolean isLblVal5Displayed() {
        return lbl_val_5.isDisplayed();
    }

    public Boolean isLblTtlValDisplayed() {
        return lbl_ttl_val.isDisplayed();
    }

    public Boolean isTxtTtlValDisplayed() {
        return txt_ttl_val.isDisplayed();
    }


    public String getTxtVal1() { return txt_val_1.getText(); }

    public String getLblVal2() {
        return lbl_val_2.getText();
    }

    public String getTxtVal2() {
        return txt_val_2.getText();
    }

    public String getLblVal3() {
        return lbl_val_3.getText();
    }

    public String getTxtVal3() {
        return txt_val_3.getText();
    }

    public String getLblVal4() {
        return lbl_val_4.getText();
    }

    public String getTxtVal4() {
        return txt_val_4.getText();
    }

    public String getLblVal5() {
        return lbl_val_5.getText();
    }

    public String getTxtVal5() {
        return txt_val_5.getText();
    }

    public String getLblTtlVal() {
        return lbl_ttl_val.getText();
    }

    public String getTxtTtlVal() {
        return txt_ttl_val.getText();
    }

//    Define the Actions

    public void isAllValuesinCurrency() {
        Currency currency = Currency.getInstance(Locale.US);

        String currencySymbol = currency.getSymbol();

        Assert.assertTrue(getTxtVal1().startsWith(currencySymbol) || getTxtVal1().endsWith(currencySymbol) );

        Assert.assertTrue(getTxtVal2().startsWith(currencySymbol) || getTxtVal2().endsWith(currencySymbol) );

        Assert.assertTrue(getTxtVal3().startsWith(currencySymbol) || getTxtVal3().endsWith(currencySymbol) );

        Assert.assertTrue(getTxtVal4().startsWith(currencySymbol) || getTxtVal4().endsWith(currencySymbol) );

        Assert.assertTrue(getTxtVal5().startsWith(currencySymbol) || getTxtVal5().endsWith(currencySymbol) );

        Assert.assertTrue(getTxtTtlVal().startsWith(currencySymbol) || getTxtTtlVal().endsWith(currencySymbol));
    }

    public void isAllValuesGreaterthanZero() {
        Currency currency = Currency.getInstance(Locale.US);

        String currencySymbol = currency.getSymbol();

        Assert.assertTrue(Integer.parseInt(getTxtVal1().replace(currencySymbol, "").replace(",", "")) > 0 );

        Assert.assertTrue(Integer.parseInt(getTxtVal2().replace(currencySymbol, "").replace(",", "")) > 0 );

        Assert.assertTrue(Integer.parseInt(getTxtVal3().replace(currencySymbol, "").replace(",", "")) > 0 );

        Assert.assertTrue(Integer.parseInt(getTxtVal4().replace(currencySymbol, "").replace(",", "")) > 0 );

        Assert.assertTrue(Integer.parseInt(getTxtVal5().replace(currencySymbol, "").replace(",", "")) > 0 );

        Assert.assertTrue(Integer.parseInt(getTxtTtlVal().replace(currencySymbol, "").replace(",", "")) > 0 );
    }

    public void isTotalBalanceValid() {
        Currency currency = Currency.getInstance(Locale.US);

        String currencySymbol = currency.getSymbol();

        Assert.assertTrue(Integer.parseInt(getTxtVal1().replace(currencySymbol, "").replace(",", "")) +

        Integer.parseInt(getTxtVal2().replace(currencySymbol, "").replace(",", "")) +

        Integer.parseInt(getTxtVal3().replace(currencySymbol, "").replace(",", "")) +

        Integer.parseInt(getTxtVal4().replace(currencySymbol, "").replace(",", "")) +

        Integer.parseInt(getTxtVal5().replace(currencySymbol, "").replace(",", "")) ==

        Integer.parseInt(getTxtTtlVal().replace(currencySymbol, "").replace(",", "")) );
    }

    public void isAllValuesDisplayed() {
        Assert.assertTrue(isLblVal1Displayed());

        Assert.assertTrue(isTxtVal1Displayed());

        Assert.assertTrue(isLblVal2Displayed());

        Assert.assertTrue(isTxtVal2Displayed());

        Assert.assertTrue(isLblVal3Displayed());

        Assert.assertTrue(isTxtVal3Displayed());

        Assert.assertTrue(isLblVal4Displayed());

        Assert.assertTrue(isTxtVal4Displayed());

        Assert.assertTrue(isLblVal5Displayed());

        Assert.assertTrue(isTxtVal5Displayed());

        Assert.assertTrue(isLblTtlValDisplayed());

        Assert.assertTrue(isTxtTtlValDisplayed());

    }

    //    Constructor initializes the state of the driver
    public BalancePageObjectFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
