package com.perelandrax.example.coffee.maker;

public abstract class ContainmentVessel {

  private UserInterface ui;
  private HotWaterSource hws;

  protected boolean isBrewing;
  protected boolean isComplete;

  public ContainmentVessel() {
    this.isBrewing = false;
    this.isComplete = true;
  }

  public void init(UserInterface ui, HotWaterSource hws) {
    this.ui = ui;
    this.hws = hws;
  }

  public void start() {
    isBrewing = true;
    isComplete = false;
  }

  public void done() {
    isBrewing = false;
  }

  protected void declareComplete() {
    isComplete = true;
    ui.complete();
  }

  protected void containerAvailable() {
    hws.resume();
  }

  protected void containerUnavailable() {
    hws.pause();
  }

  public abstract boolean isReady();
}
