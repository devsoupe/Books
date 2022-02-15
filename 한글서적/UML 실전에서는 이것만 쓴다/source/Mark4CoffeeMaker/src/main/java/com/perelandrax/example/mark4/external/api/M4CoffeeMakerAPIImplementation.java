package com.perelandrax.example.mark4.external.api;

public class M4CoffeeMakerAPIImplementation implements CoffeeMakerAPI {

  @Override
  public int getWarmerPlateStatus() {
    return 0;
  }

  @Override
  public int getBoilerStatus() {
    return 0;
  }

  @Override
  public int getBrewButtonStatus() {
    return 0;
  }

  @Override
  public void setBoilerState(int boilerStatus) {

  }

  @Override
  public void setWarmerState(int warmerState) {

  }

  @Override
  public int setIndicatorState(int indicatorState) {
    return 0;
  }

  @Override
  public int setReliefValveState(int reliefValveState) {
    return 0;
  }
}
