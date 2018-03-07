//How I Code by Kamal Hakim - 2018

package com.ovrdos.code;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.internal.util.reflection.Whitebox;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class ApplicationTest {

    Application app;

    @Before
    public void setUp() {
        app = new Application();
        app.main(null);
    }

    @Test
    public void given_App_Verify_App_Started() {
        assertTrue("APPLICATION NOT STARTED!", (Boolean) Whitebox.getInternalState(app, "applicationStarted"));
    }

    @Test
    public void given_Config_Verify_Config_Loaded() {
        assertTrue("CONFIG NOT LOADED!", (Boolean) Whitebox.getInternalState(app, "configLoaded"));
    }
}