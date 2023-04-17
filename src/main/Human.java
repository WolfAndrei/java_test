package main;

public class Human {
  private String mName;
  private String mSex;

  Human(String name, String sex) {
    mName = name;
    mSex = sex;
  }

  public String getDescription() {
    return "Name is " + mName + " and sex is " + mSex;
  }

  public static Human andrei() {
    return new Man();
  }

  public static String TAG = "Human_Tag";

  public String getName() {
    return mName;
  }

  public void setName(String name) {
    this.mName = name;
  }

  public String getSex() {
    return mSex;
  }

  public void setSex(String sex) {
    this.mSex = sex;
  }
}
