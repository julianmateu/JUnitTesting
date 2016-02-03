package com.example.jmateu.junittesting;

import android.app.Application;
import android.support.test.filters.RequiresDevice;
import android.support.test.runner.AndroidJUnit4;
import android.test.ApplicationTestCase;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
@RunWith(AndroidJUnit4.class)
public class ApplicationTest extends ApplicationTestCase<Application> {


    public ApplicationTest() {
        super(Application.class);
    }

    @RequiresDevice
    @Test
    public void TrivialTest() {
        // Call the CalculatorActivity add() method and pass in some operand values, then
        // check that the expected value is returned.
        assertTrue(true);
    }

}