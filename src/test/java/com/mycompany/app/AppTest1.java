package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest1 {

  private App app;

  @Test
  public void testIsPalindrome() throws Exception {
    assertEquals(true, App.isPalindrome("AsasdsasA"));
  }

  @Test
  public void testIsEmptyPalindrome() throws Exception {
    assertEquals(true, App.isPalindrome(""));
  }

  @Test
  public void testIsNotPalindrome() throws Exception {
    assertEquals(false, App.isPalindrome("asdf"));
  }
}