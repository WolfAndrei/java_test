package main;

public class Player {
  private String mName;

  Player() {}
  Player(String name) {
    mName = name;
  }

  private static String mPlayerSex = "m";

  public void setPlayerSex(String v) {
    mPlayerSex = v;
  }

  public String getName() {
    return mName;
  }
}
