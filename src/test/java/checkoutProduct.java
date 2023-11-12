import base.baseSetup;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;

public class checkoutProduct extends baseSetup {
    homePage home;
    cartPage cart;
    accountPage account;
    guestCheckoutPage guest;
    confirmationPage confirm;

    @BeforeClass
    public void setup() {
        super.setup();
        home = new homePage(driver);
        cart = new cartPage(driver);
        account = new accountPage(driver);
        guest = new guestCheckoutPage(driver);
        confirm = new confirmationPage(driver);
    }

    @Test(description = "checkout single product as guest")
    public void checkoutSingleItem(){
       home.setItem();
       home.clickAddToCartBtn();
       home.clickCartBtn();
       cart.assertItemName("Skinsheen Bronzer Stick");
       cart.clickCartCheckout();
       account.selectConfirmAccountGuest();
       account.clickContinueBtn();
       guest.inputForm();
       guest.selectCountry();
       guest.selectZone();
       guest.clickContinueBtn();
       confirm.assertConfirmItem("Skinsheen Bronzer Stick");
       confirm.clickConfirmOrderBtn();
       confirm.clickContinueBtnConfirm();
    }

    @Test(description = "Checkout multiple product as guest")
    public void checkoutMultipleItem(){
        home.clickAddToCartItem1();
        home.clickAddToCartItem2();
        home.clickAddToCartItem3();
        home.clickCartBtn();
        cart.assertItemName("Skinsheen Bronzer Stick");
        cart.assertItemName2("Absolute Anti-Age Spot Replenishing Unifying TreatmentSPF 15");
        cart.assertItemName3("Absolue Eye Precious Cells");
        cart.clickCartCheckout();
        account.selectConfirmAccountGuest();
        account.clickContinueBtn();
        guest.inputForm();
        guest.selectCountry();
        guest.selectZone();
        guest.clickContinueBtn();
        confirm.assertConfirmItem("Skinsheen Bronzer Stick");
        confirm.assertConfirmItem2("Absolute Anti-Age Spot Replenishing Unifying TreatmentSPF 15");
        confirm.assertConfirmItem3("Absolue Eye Precious Cells");
        confirm.clickConfirmOrderBtn();
        confirm.clickContinueBtnConfirm();
    }

    @Test(description = "checkout single product with account login")
    public void checkoutSingleItemLogin(){
        home.setItem();
        home.clickAddToCartBtn();
        home.clickCartBtn();
        cart.assertItemName("Skinsheen Bronzer Stick");
        cart.clickCartCheckout();
        account.inputLoginName();
        account.inputPassword();
        account.clickLoginBtn();
        confirm.assertConfirmItem("Skinsheen Bronzer Stick");
        confirm.clickConfirmOrderBtn();
        confirm.clickContinueBtnConfirm();
    }

    @Test(description = "checkout multiple product with account login")
    public void checkoutMultipleItemLogin(){
        home.clickAddToCartItem1();
        home.clickAddToCartItem2();
        home.clickAddToCartItem3();
        home.clickCartBtn();
        cart.assertItemName("Skinsheen Bronzer Stick");
        cart.assertItemName2("Absolute Anti-Age Spot Replenishing Unifying TreatmentSPF 15");
        cart.assertItemName3("Absolue Eye Precious Cells");
        cart.clickCartCheckout();
        account.inputLoginName();
        account.inputPassword();
        account.clickLoginBtn();
        confirm.assertConfirmItem("Skinsheen Bronzer Stick");
        confirm.assertConfirmItem2("Absolute Anti-Age Spot Replenishing Unifying TreatmentSPF 15");
        confirm.assertConfirmItem3("Absolue Eye Precious Cells");
        confirm.clickConfirmOrderBtn();
        confirm.clickContinueBtnConfirm();
    }


}
