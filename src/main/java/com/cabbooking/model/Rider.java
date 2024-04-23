package com.cabbooking.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

public class Rider {
  String id;

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Rider(String id, String name) {
    this.id = id;
    this.name = name;
  }

  String name;
}
