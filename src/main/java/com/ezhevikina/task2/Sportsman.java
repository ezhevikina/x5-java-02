package com.ezhevikina.task2;

import java.util.Objects;

public class Sportsman {
  private String name;
  private boolean hasRecord;
  private boolean hasTeam;

  public Sportsman(String name, boolean hasRecord, boolean hasTeam) {
    this.name = name;
    this.hasRecord = hasRecord;
    this.hasTeam = hasTeam;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Sportsman sportsman = (Sportsman) o;
    return hasRecord == sportsman.hasRecord &&
        hasTeam == sportsman.hasTeam;
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasRecord, hasTeam);
  }
}
