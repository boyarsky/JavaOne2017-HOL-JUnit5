package com.javaone.hol2017.junit5;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(Parameterized.class)
public class ThirtyNinthAnniversaryEventsTest {

  @Parameter
  public LocalDate date;

  @Parameter(1)
  public boolean expectedResult;

  @Parameters(name = "{0}")
  public static Collection<Object[]> testCases() throws IOException {
    Path path = Paths.get("src/test/resources", "39-tests.txt");

    List<String> linesFromFile = Files.readAllLines(path, StandardCharsets.UTF_8);

    return linesFromFile.stream()
      // remove blank and commented out lines
      .filter(StringUtils::isNotBlank)
      .filter(l -> !l.startsWith("#"))
      // convert to array
      .map(l -> l.split(","))
      // convert to desired types for parameterized test
      .map(a -> new Object[]{LocalDate.parse(a[0]), Boolean.parseBoolean(a[1])})
      // store in collection
      .collect(Collectors.toList());
  }

  @Test
  public void dateTest() {
    boolean actual = ThirtyNinthAnniversaryEvents.isCelebrationDay(date);

    assertThat(actual).isEqualTo(expectedResult);
  }
}
