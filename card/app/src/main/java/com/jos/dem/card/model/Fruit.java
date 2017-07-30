package com.jos.dem.card.model;

public class Fruit {

  private String name;
  private int thumbnail;

  public Fruit(int thumbnail, String name) {
    this.name = name;
    this.thumbnail = thumbnail;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(int thumbnail) {
    this.thumbnail = thumbnail;
  }

}
