package com.vertex.reflection;

import com.sun.org.glassfish.gmbal.Description;

public class Car {
  private int horsepower;
  private final String serialNumber;

  public Car(int horsepower, String serialNumber) {
    this.horsepower = horsepower;
    this.serialNumber = serialNumber;
  }

  @Description("the power of an engine")
  public final int getHorsepower() {
    return horsepower;
  }

  public void setHorsepower(int horsepower) {
    this.horsepower = horsepower;
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  private void startEngine() {
    System.out.println("Wroooommmm");
  }

  public <T> T logAndReturn(@Deprecated T type) throws IllegalAccessException {
    System.out.println(type);
    return type;
  }

  public <T extends RuntimeException> void exceptionExample() throws T {
  }

}
