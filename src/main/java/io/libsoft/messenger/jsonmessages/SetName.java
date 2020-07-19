package io.libsoft.messenger.jsonmessages;

import io.libsoft.messenger.service.GsonService;
import java.io.Serializable;

public class SetName implements Serializable {

  private String username;


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  public String toString() {
    return GsonService.getInstance().toJson(this);
  }
}
