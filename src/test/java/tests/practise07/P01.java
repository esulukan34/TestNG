package tests.practise07;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WebUniversityPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P01 { //EXPLORATORY testing --> Keşif testi
    @Test
    public void test01() {
        // http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
        Driver.getDriver().get("http://webdriveruniversity.com/To-Do-List/index.html");
        // Todos ekle: (Kahvaltıyı hazırla, Bulaşıkları yıka, Bebekle ilgilen, Çocuğunun ödevine yardım et, Selenyum çalış, Uyu)
        WebUniversityPage webUniversityPage = new WebUniversityPage();

        List<String> workList = new ArrayList<>(Arrays.asList("Kahvaltıyı hazırla","Bulaşıkları yıka","Bebekle ilgilen","Çocuğunun ödevine yardım et","Selenyum çalış","Uyu"));
        // Buradaki listeyi yapılacaklar listesine tek tek manuel olarak eklemek yerine toplu olarak bir loop kullanarak gonderebilmek
        // amaci ile biz olusturduk

        Actions actions = new Actions(Driver.getDriver());
        for (String w:workList) {
            actions.click(webUniversityPage.addNewTodo).sendKeys(w,Keys.ENTER).perform();
        }

        //Tüm yapılacakların üzerini çiz.
        List<WebElement> todos = webUniversityPage.todos;
        for (WebElement w:todos) {
            w.click();
        }

        //Tüm yapılacakları sil.
        List<WebElement> delete = webUniversityPage.deleteButtons;
        for (WebElement w:delete) {
            w.click();
        }
        //Tüm yapılacakların silindiğini doğrulayın.
        Assert.assertNotEquals(webUniversityPage.container,delete);

        //2. yol:
        List<WebElement> newtodos = webUniversityPage.newtodosWebelement;
        Assert.assertEquals(0,newtodos.size());




    }

}
