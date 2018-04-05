package com.example.timber;

import org.jetbrains.annotations.NotNull;
import timber.log.Event;

/**
 * Created by blexa, 05.04.2018.
 */
public class DummyEvent implements Event {

  private String message;

  public DummyEvent(String message){
    this.message = message;
  }

  @NotNull
  @Override
  public String getEventName() {
    return "DummyEvent";
  }

  @Override
  public String toString() {
    return (getEventName() + " " + message);
  }
}
