package com.perelandrax.example.mark4.coffee.maker;

import com.perelandrax.example.coffee.maker.HotWaterSource;
import com.perelandrax.example.mark4.external.api.CoffeeMakerAPI;

public class M4HotWaterSource extends HotWaterSource implements Pollable {

  private CoffeeMakerAPI api;

  public M4HotWaterSource(CoffeeMakerAPI api) {
    this.api = api;
  }

  @Override
  public boolean isReady() {
    int boilerStatus = api.getBoilerStatus();
    return boilerStatus == api.BOILER_NOT_EMPTY;
  }

  @Override
  public void startBrewing() {
    api.setReliefValveState(api.VALVE_CLOSED);
    api.setBoilerState(api.BOILER_ON);
  }

  @Override
  public void poll() {
    int boilerStatus = api.getBoilerStatus();
    if (isBrewing) {
      if (boilerStatus == api.BOILER_EMPTY) {
        api.setBoilerState(api.BOILER_OFF);
        api.setReliefValveState(api.VALVE_CLOSED);
        declareDone();
      }
    }
  }

  @Override
  public void pause() {
    api.setBoilerState(api.BOILER_OFF);
    api.setReliefValveState(api.VALVE_OPEN);
  }

  @Override
  public void resume() {
    api.setBoilerState(api.BOILER_ON);
    api.setReliefValveState(api.VALVE_CLOSED);
  }
}
