package com.udacity.gradle.builditbigger;


import android.content.Context;
import android.support.v4.util.Pair;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by srijith on 5/28/18.
 */

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 23)
public class EndpointsAsyncTaskTest {
    EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void testOnResponseMethodSuccess() throws Exception {
        String result = null;

        endpointsAsyncTask.execute(RuntimeEnvironment.application);

        try {
            result = endpointsAsyncTask.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(result);
    }

}
