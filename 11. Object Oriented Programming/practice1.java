import java.util.*;
 public class CP {
  String manufacturer;
  double price;
  void CP() {

  }
  class processor {
    int numcores;
    String manufacturer;
    private void getCache() {
      System.out.println("get cache");
    }
    private void setCache() {
      System.out.println("set cache");
    }

  }
  class RAM {
    double memory;
    String manufacturer;
    private void getClockSpeed() {
       System.out.println("clockspeed");
    }
    private void setClockSpeed() {
      System.out.println("setspeed");

    }
  }
}

public class practice1 {
  public static void main(String args[]) {
  CP c=new CP();
  c.CP();
  }
}