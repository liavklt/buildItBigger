package com.udacity.gradle.builditbigger;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainActivityAndroidTest {

  @Rule
  public ActivityTestRule<MainActivity> mActivityRule =
      new ActivityTestRule(MainActivity.class);

  @Test
  public void testVerifyATaskLoadingNonEmptyString() {
    MainActivity activity = mActivityRule.getActivity();
    MainActivity.EndpointsAsyncTask endpointsAsyncTask = activity.new EndpointsAsyncTask();
    endpointsAsyncTask.execute(activity.getApplicationContext());
    try {
      String result = endpointsAsyncTask.get(10, TimeUnit.SECONDS);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.length() > 0);
    } catch (ExecutionException | InterruptedException | TimeoutException e) {
      e.printStackTrace();
    }

  }

}