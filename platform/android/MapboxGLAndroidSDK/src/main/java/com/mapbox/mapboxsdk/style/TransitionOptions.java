package com.mapbox.mapboxsdk.style;

public class TransitionOptions {

  private long duration;
  private long delay;

  public TransitionOptions(long duration, long delay) {
    this.duration = duration;
    this.delay = delay;
  }

  public long getDuration() {
    return duration;
  }

  public long getDelay() {
    return delay;
  }
}
