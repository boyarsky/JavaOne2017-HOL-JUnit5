package com.javaone.hol2017.junit5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/*
 * Clearly this test doesn't cover all the cases, but good enough o show JUnit 5 ;)
 */
public class SeaLionTest {

  private static SeaLion seaLion1;
  private static SeaLion seaLion2;

  @BeforeClass
  public static void createSeaLions() {
    seaLion1 = new SeaLion(1, 75, true);
    seaLion2 = new SeaLion(2, 125, false);
  }

  @AfterClass
  public static void tearDown() {
    seaLion1 = null;
    seaLion2 = null;
  }

  @Test
  public void testGetters() {
    assertThat(seaLion1.isMale()).isTrue();
    assertThat(seaLion2.isMale()).isFalse();

    assertThat(seaLion1.getWeight()).isEqualTo(75);
    assertThat(seaLion2.getWeight()).isEqualTo(125);
  }

  @Test
  public void hashCodeValues() {
    assertThat(seaLion1.hashCode()).isEqualTo(seaLion1.hashCode());
    assertThat(seaLion1.hashCode()).isNotNull();
    assertThat(seaLion1.hashCode()).isNotEqualTo(seaLion2.hashCode());
  }

  @Test
  public void equalsValues() {
    assertThat(seaLion1).isEqualTo(seaLion1);
    assertThat(seaLion1).isNotNull();
    assertThat(seaLion1).isNotEqualTo(seaLion2);
  }
}
