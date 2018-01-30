package edu.cnm.deepdive;

public class test {

  public static void main(String... args) { //string, string, string... or array or string
    int upperlimit = (args.length > 0) ? Integer.parseInt((args[0])):100;
    int[] sizes = {6, 9, 20};
    Composable tester = new McNugget(); //tester to refer to print, Composable implemented McNugget
    for (int i = 1;i <= 100; 1++){
      System.out.printf("%d\t%b%s%n", i, tester.test(i, sizes)); //what int... bar args expecting
    }
  }

}
