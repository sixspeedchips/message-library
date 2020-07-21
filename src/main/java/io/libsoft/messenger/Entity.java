package io.libsoft.messenger;

import io.libsoft.physix.vector.MutableVector;
import java.util.UUID;

public class Entity {

  private MutableVector velocity;
  private MutableVector position;
  private double theta;
  private UUID uuid;
  private boolean paused;

  public MutableVector getVelocity() {
    return velocity;
  }

  public MutableVector getPosition() {
    return position;
  }


  public double getTheta() {
    return theta;
  }

  public UUID getUuid() {
    return uuid;
  }

  public boolean isPaused() {
    return paused;
  }
}
