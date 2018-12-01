package com.example.android.javajokes;

import org.junit.Assert;
import org.junit.Test;

public class JokeTellerTest {

  @Test
  public void tellJokeGetsNotNullString(){
    JokeTeller jokeTeller = new JokeTeller();
    Assert.assertNotNull(jokeTeller.tellJoke());
  }
}