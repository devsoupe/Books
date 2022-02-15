package com.perelandrax.example.coffee.maker;

public abstract class UserInterface {

  private HotWaterSource hws;
  private ContainmentVessel cv;

  protected boolean isComplete;

  public UserInterface() {
    this.isComplete = true;
  }

  public void init(HotWaterSource hws, ContainmentVessel cv) {
    this.hws = hws;
    this.cv = cv;
  }

  public void complete() {
    isComplete = true;
    completeCycle();
  }

  protected void startBrewing() {
    if (hws.isReady() && cv.isReady()) {
      hws.start();
      cv.start();
    }
  }

  public abstract void done();

  public abstract void completeCycle();
}
