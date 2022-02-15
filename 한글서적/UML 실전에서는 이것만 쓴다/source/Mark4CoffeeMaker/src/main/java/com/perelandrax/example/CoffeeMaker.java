package com.perelandrax.example;

import com.perelandrax.example.mark4.coffee.maker.M4ContainmentVessel;
import com.perelandrax.example.mark4.coffee.maker.M4HotWaterSource;
import com.perelandrax.example.mark4.coffee.maker.M4UserInterface;
import com.perelandrax.example.mark4.external.api.CoffeeMakerAPI;
import com.perelandrax.example.mark4.external.api.M4CoffeeMakerAPIImplementation;

public class CoffeeMaker {

  public static void main(String[] args) {
    CoffeeMakerAPI api = new M4CoffeeMakerAPIImplementation();

    M4UserInterface ui = new M4UserInterface(api);
    M4HotWaterSource hws = new M4HotWaterSource(api);
    M4ContainmentVessel cv = new M4ContainmentVessel(api);

    ui.init(hws, cv);
    hws.init(ui, cv);
    cv.init(ui, hws);

    while (true) {
      ui.poll();
      hws.poll();
      cv.poll();
    }
  }
}
