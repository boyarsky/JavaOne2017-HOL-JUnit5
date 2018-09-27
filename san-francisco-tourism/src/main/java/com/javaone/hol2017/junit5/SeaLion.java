package com.javaone.hol2017.junit5;

@SuppressWarnings("WeakerAccess")
public class SeaLion {

  private int age;
  private int weight;
  private boolean male;

  public SeaLion(int age, int weight, boolean male) {
    super();
    this.age = age;
    this.weight = weight;
    this.male = male;
  }

  public int getAge() {
    return age;
  }

  public int getWeight() {
    return weight;
  }

  public boolean isMale() {
    return male;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + age;
    result = prime * result + (male ? 1231 : 1237);
    result = prime * result + weight;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null || getClass() != obj.getClass())
      return false;
    SeaLion other = (SeaLion) obj;
    return age == other.age && male == other.male && weight == other.weight;
  }
}
