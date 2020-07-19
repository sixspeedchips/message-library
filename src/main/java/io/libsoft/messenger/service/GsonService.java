package io.libsoft.messenger.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.lang.reflect.Modifier;

public class GsonService {


  public static Gson getInstance() {
    return InstanceHolder.INSTANCE;
  }

  public static Gson getPprinter() {
    return InstanceHolder.P_PRINTER;
  }

  public static Gson getAnnotater() {
    return InstanceHolder.ANNOTATION;
  }


  private static class InstanceHolder {

    private static final Gson INSTANCE;
    private static final Gson P_PRINTER;
    private static final Gson ANNOTATION;

    static {
      P_PRINTER = new GsonBuilder().setPrettyPrinting().create();
      INSTANCE = new GsonBuilder().create();
      ANNOTATION = new GsonBuilder().excludeFieldsWithModifiers(Modifier.TRANSIENT).create();
    }

  }


}
