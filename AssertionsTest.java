package com.arnab.junit.Script;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class AssertionsTest {

    @Rule
    public ErrorCollector ec = new ErrorCollector();

    @Test
    public void testTitle() {

        String actual_title = "arnab.com";           // xTract selemium script
        String expected_title = "arnab.com";        // compare title extracted with this

        /*
        if(actual_title.equals(expected_title)) {
            System.out.println("Passed ");
        } else {
            System.out.println("Failed");
        }*/

        try {
            Assert.assertEquals("failed......", expected_title, actual_title);
         } catch (Throwable th) {
            System.out.println("Caught an error");
            ec.addError(th);
        }
        System.out.println("Testing completed");
    }
}
