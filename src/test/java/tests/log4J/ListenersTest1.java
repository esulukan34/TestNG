package tests.log4J;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//TEST CLASS
//Test class i Utility classa baglamak icin @Listeners annotation u kullanilir
@Listeners(utilities.Listeners.class)
public class ListenersTest1 {
    @Test
    public void test1(){
        System.out.println("Test Case 1 - PASS");
        Assert.assertTrue(true);//pass
    }
    @Test
    public void test2(){
        System.out.println("Test Case 2 - FAILED");
        Assert.assertTrue(false);//fail
    }
    @Test
    public void test3(){
        System.out.println("Test Case 3 - SKIPPED");
        throw new SkipException("Skip Edilecek");//skip
    }
}