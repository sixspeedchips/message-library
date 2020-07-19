package io.libsoft.messenger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class GameState implements Serializable {


  private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

  private final List<PEntity> pEntities = new LinkedList<>();


  public List<PEntity> getPEntities() {
    return pEntities;
  }


  @Override
  public String toString() {
    return gson.toJson(this);
  }


}
