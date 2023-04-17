package main;

import java.awt.*;
import java.io.File;
import java.util.Scanner;

import javax.swing.*;

public class Frame extends JFrame {

  public Frame() {

    try {
      Scanner scanner = new Scanner(new File("Hankes.txt"));

      for (int i = 0; i < 9; i++) {
        if (scanner.hasNextLine()) {
          add(new JLabel(scanner.nextLine()));
        }
        if (scanner.hasNextDouble()) {
          add(new JLabel(String.valueOf(scanner.nextDouble())));
        }
        if (scanner.hasNextLine()) {
          scanner.nextLine();
        }
      }
      GridLayout grid = new GridLayout(8, 2);
      setLayout(grid);
      setVisible(true);

      System.out.println(grid.getColumns());
    } catch (Exception ex) {}
  }

}
