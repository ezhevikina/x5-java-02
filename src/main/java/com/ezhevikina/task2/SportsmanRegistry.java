package com.ezhevikina.task2;

import java.util.Collections;
import java.util.Map;

public class SportsmanRegistry {
  private Map<Integer, Sportsman> sportsmanHashMap;

  public void setSportsmanHashMap(Map<Integer, Sportsman> sportsmanHashMap) {
    this.sportsmanHashMap = sportsmanHashMap;
  }

  public boolean inMap(Integer number) {
    return sportsmanHashMap.containsKey(number);
  }

  public int getCountSameSportsman(Sportsman sportsman) {
    return Collections.frequency(sportsmanHashMap.values(), sportsman);
  }
}
