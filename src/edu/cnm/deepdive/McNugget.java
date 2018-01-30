package edu.cnm.deepdive;

public class McNugget implements Composable { //for interface
  @Override //static can not be Override, non-static so test must be non-static
  public boolean test(int testVal, int... packSizes){ //... ans [] is same "bar args" expect an array of int
    if (testVal == 0){
      return true;
    }
    boolean lessThanAllPacks = true;
    for (int currentPack : packSizes){
      if (testVal >= currentPack){
        lessThanAllPacks = false;
        break;
      }
    }
    if (lessThanAllPacks){
      return false;
    }
    for (int currentPack : packSizes) {
      if (test(testVal - currentPack, packSizes)){
        return true; //test takes 2
      }
    }
    return false;
  }
}
