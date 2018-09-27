package com.javaone.hol2017.junit5;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class FishermansWharfTest {

  private FishermansWharf wharf;

  @Before
  public void createWharf() {
    wharf = new FishermansWharf();
  }

  @Test
  public void url() {
    assertEquals("url", "http://www.fishermanswharf.org", wharf.getUrl());
    assertThat(wharf.getUrl()).isEqualTo("http://www.fishermanswharf.org");
  }

  @Test
  public void oldestSeaLionForEmptyList() {
    assertThat(wharf.getOldestSeaLion().isPresent()).isFalse();
  }

  @Test
  public void oldestSeaLionForFirstElement() {
    wharf.addSeaLion(new SeaLion(15, 200, true));
    wharf.addSeaLion(new SeaLion(10, 150, false));
    SeaLion actual = wharf.getOldestSeaLion().get();
    assertThat(actual.getAge()).isEqualTo(15);
  }

  @Test
  public void oldestSeaLionForLastElement() {
    wharf.addSeaLion(new SeaLion(10, 150, false));
    wharf.addSeaLion(new SeaLion(15, 200, true));
    SeaLion actual = wharf.getOldestSeaLion().get();
    assertEquals("oldest", 15, actual.getAge());

    assertThat(actual.getAge()).isEqualTo(15);
  }
}
