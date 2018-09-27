package com.javaone.hol2017.junit5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SuppressWarnings("WeakerAccess")
public class FishermansWharf {

  private List<SeaLion> seaLions;

  public FishermansWharf() {
    seaLions = new ArrayList<>();
  }

  public String getUrl() {
    return "http://www.fishermanswharf.org";
  }

  public void addSeaLion(SeaLion s) {
    seaLions.add(s);
  }

  public Optional<SeaLion> getOldestSeaLion() {
    return seaLions.stream().max((s1, s2) -> s1.getAge() - s2.getAge());
  }
}
