package main;

import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.System.getLogger;
import static java.lang.System.out;

public class Main {

  public static void main(String[] args) {

    // some changes from devel


    Player player = new Player("Anton");
//    player.setName(Human.andrei().getName());
    player.setPlayerSex(Human.andrei().getSex());

    Scanner sc = new Scanner(System.in);
//    String name = sc.nextLine();

    Man man1 = new Man();
//    man1.setName(name);

//    [2,7,11,15], target = 9
//Solution

    int[] array = {2,7,11,15};
    int target = 9;
    int[] result = new Solution().twoSum(array, target);
    for (int i = 0; i < result.length; i++) {
      out.println(result[i]);
    }

    getLogger(Main.class.getName()).log(System.Logger.Level.DEBUG, "hello");
    out.println(man1.getDescription());
    out.println(man1.overriddenSuperDescription());
    out.println(Human.TAG);
    out.println("Man class: " + man1.getName());
  }

}












//    Scanner scanner = new Scanner(System.in);
//    player.setName(scanner.nextLine());
//    player.setPlayerSex(player.getName());
//    System.out.println("Hello, " + player.getName());
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("Enter first number:");
//    var x = scanner.nextDouble();
//    System.out.println("Enter second number:");
//    var y = scanner.nextDouble();
//    scanner.nextLine();

//    @Nullable Double res = null;
//    while (res == null) {
//      System.out.println("Enter operator:");
//      var z = scanner.nextLine();
//      res = switch (z) {
//        case "-" -> x - y;
//        case "+" -> x + y;
//        case "*" -> x * y;
//        case "/" -> x / y;
//        default -> null;
//      };
//      if (res == null) {
//        System.out.println("enter valid operator");
//      }
//    }
//    System.out.println("result is " + res);

//  }
//}
