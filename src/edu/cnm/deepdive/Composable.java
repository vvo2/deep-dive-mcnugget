package edu.cnm.deepdive;

public interface Composable {

  boolean test(int value, int... components); //name value & components dont matter only the type matters

  // boolean test(double value, double... components); type don't match, need to override with another method added
}
