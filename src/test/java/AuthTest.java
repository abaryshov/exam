import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class AuthTest {

    private CharSequence a;

    @BeforeEach
    public void setup(){
        open("http://automationpractice.com/index.php");
    }

    @Test
    public void shouldAuthorizeTest() {
        $("[class='ajax_block_product col-xs-12 col-sm-4 col-md-3 first-in-line first-item-of-tablet-line first-item-of-mobile-line']")
                .hover();
        sleep(2000);
        $("[title='Add to cart']")
                .click();
        sleep(2000);
        $("[title='Proceed to checkout']")
                .click();
        sleep(2000);
        $("[class='label label-success']")
                .shouldBe(visible);
        sleep(2000);
        $("[id='cart_title']")
                .shouldBe(visible);
    }

    @Test
    public void shouldAuthorizeTest1(){
        open("http://automationpractice.com/index.php");
        sleep(2000);
        $("[class='inputNew form-control grey newsletter-input']")
                .click();
        sleep(2000);
        $("[class='inputNew form-control grey newsletter-input']")
                .sendKeys("test");
        sleep(2000);
        $("[name='submitNewsletter']")
                .click();
        sleep(2000);
        $("[class='alert alert-danger']")
                .shouldBe(visible);
        sleep(2000);
        

    };
}