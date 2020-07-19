package io.libsoft.messenger;

import java.io.Serializable;

public class PEntity implements Serializable{

    private final double x;
    private final double y;

    public PEntity(double x, double y) {
      this.x = x;
      this.y = y;
    }


    public double getX() {
      return x;
    }

    public double getY() {
      return y;
    }
}
