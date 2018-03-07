//How I Code by Kamal Hakim - 2018

package com.ovrdos.code;

import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.util.reflection.Whitebox;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class ApplicationTest {

    Application app;

    @Before
    public void setUp() {
        app = new Application();
    }

    @Test
    public void given_App_Verify_App_Started() {
        app.main(null);
        assertTrue("APPLICATION NOT STARTED!", (Boolean) Whitebox.getInternalState(app, "applicationStarted"));
    }

    @Test
    public void given_Config_Verify_Config_Loaded() {
        app.main(null);
        assertTrue("CONFIG NOT LOADED!", (Boolean) Whitebox.getInternalState(app, "configLoaded"));
    }

    @Test
    public void given_Bad_Config_Verify_App_Not_Loaded() {
        String[]  configs = new String[1];
        configs[0] = "CONFIG_ERROR";
        app.main(configs);
        assertFalse("CONFIG LOADED ANYWAY!", (Boolean) Whitebox.getInternalState(app, "configLoaded"));
    }
}