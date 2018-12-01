package com.example.android.javajokes;

import java.util.HashMap;
import java.util.Map;

public class JokeTeller {
  private static final Integer MAX=5;
  private static final Integer MIN =1;

  public String tellJoke() {
    return jokePool().get((int)(Math.random()*((MAX-MIN)+1))+MIN);

  }

  private static Map<Integer,String> jokePool(){
    Map<Integer,String> jokePoolMap = new HashMap<>();
    //jokes taken from
    // https://thoughtcatalog.com/brandon-gorrell/2015/03/50-short-clean-jokes-and-puns-that-will-get-a-laugh-every-time/
    jokePoolMap.put(1,"What is red and smells like blue paint?\n"
        + "Red paint.");
    jokePoolMap.put(2,"Why aren’t koalas actual bears?\n"
        + "The don’t meet the koalafications.");
    jokePoolMap.put(3,"What do you call bears with no ears?\n"
        + "B");
    jokePoolMap.put(4,"Why dont blind people skydive?\n"
        + "Because it scares the crap out of their dogs.");
    jokePoolMap.put(5,"I went in to a pet shop. I said, “Can I buy a goldfish?” The guy said, “Do you want an aquarium?”\n"
        + "I said, “I don’t care what star sign it is.”");
    return jokePoolMap;
  }

}
