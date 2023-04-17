package main;

public class Man extends Human {

  Man() {
   super("default_name", "m");
  }

  public String overriddenSuperDescription() {
     return getDescription() + "\n- " + getName() + ": \"I'm fucking real man!\"";
  }

}
