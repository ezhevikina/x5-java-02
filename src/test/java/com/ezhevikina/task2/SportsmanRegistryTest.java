package com.ezhevikina.task2;

import org.junit.Test;
import junitparams.Parameters;
import junitparams.JUnitParamsRunner;
import org.junit.runner.RunWith;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class SportsmanRegistryTest {

  private SportsmanRegistry initializeSportsmanRegistry() {
    SportsmanRegistry sportsmanRegistry = new SportsmanRegistry();
    Map<Integer, Sportsman> sportsmanHashMap = new HashMap<>();
    sportsmanHashMap.put(1, new Sportsman("Ivan", true, true));
    sportsmanHashMap.put(2, new Sportsman("Ivan", true, false));
    sportsmanHashMap.put(3, new Sportsman("Ivan", false, true));
    sportsmanHashMap.put(4, new Sportsman("Ivan", false, false));
    sportsmanRegistry.setSportsmanHashMap(sportsmanHashMap);
    return sportsmanRegistry;
  }

  @Test
  public void sportsmanNumberInMap_ReturnTrue() {
    SportsmanRegistry sportsmanRegistry = initializeSportsmanRegistry();
    assertTrue(sportsmanRegistry.inMap(1));
  }

  @Test
  public void sportsmanNumberNotInMap_ReturnFalse() {
    SportsmanRegistry sportsmanRegistry = initializeSportsmanRegistry();
    assertFalse(sportsmanRegistry.inMap(0));
  }

  @Test
  @Parameters({
      "Ivan, true, true",
      "Petr, true, true",
      "Petr, true, false",
      "Petr, false, true",
      "Petr, false, false",
  })
  public void sportsmanHasOneEqualInRegistry(
      String name,
      boolean hasRecord,
      boolean hasTeam) {
    SportsmanRegistry sportsmanRegistry = initializeSportsmanRegistry();
    assertEquals(1, sportsmanRegistry.getCountSameSportsman(
        new Sportsman(name, hasRecord, hasTeam)));
  }
}
