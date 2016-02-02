package com.example.jmateu.junittesting;

import org.junit.Test;
import org.junit.runner.RunWith;

import android.support.test.filters.RequiresDevice;
import android.support.test.runner.AndroidJUnit4;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */

@RunWith(AndroidJUnit4.class)
public class ExampleUnitTest {


    @RequiresDevice
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
}