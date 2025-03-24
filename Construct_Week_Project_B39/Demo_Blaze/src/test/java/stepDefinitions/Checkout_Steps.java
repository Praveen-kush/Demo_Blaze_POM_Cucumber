
package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Checkout_Page;

public class Checkout_Steps {

    Checkout_Page PlaceOrder = new Checkout_Page();
    Checkout_Page userName = new Checkout_Page();
    Checkout_Page userCountry = new Checkout_Page();
    Checkout_Page userCity = new Checkout_Page();
    Checkout_Page userCreditCard = new Checkout_Page();
    Checkout_Page userMonth = new Checkout_Page();
    Checkout_Page userYear = new Checkout_Page();
    Checkout_Page PurchaseButton1 = new Checkout_Page();





        @And("click on place order button if cart total is 1580")
        public void click_On_Place_Order_Button_If_Cart_Total_Is_1580() {
           PurchaseButton1.PurchaseB().click();

        }


        @And("user fill {string} and {string} and {string} and {string} and {string} and {string}")
        public void user_fill(String name, String country, String city, String creditCard, String month, String year) {
            userName.userNameH(name).sendKeys("name");
            userCountry.userCountryH(country).sendKeys("country");
            userCity.userCityH(city).sendKeys("city");
            userCreditCard.userCreditCardH(creditCard).sendKeys("5010406985745");
            userMonth.userMonthH(month).sendKeys("October");
            userYear.userYearH(year).sendKeys("2025");
        }

        @And("click on purchase")
        public void click_on_purchase() {
            PlaceOrder.PurchaseButton().click();
        }

        @Then("A success message should be displayed Thank you for your purchase")
        public void A_success_message_should_be_displayed_Thank_you_for_your_purchase() {
            PurchaseButton1.PurchaseButton().click();

        }
    }
