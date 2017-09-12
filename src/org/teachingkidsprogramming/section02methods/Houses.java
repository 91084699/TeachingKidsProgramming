package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;

public class Houses
{
  public static void main(String[] args)
  {
    Tortoise.show();
    //   Make the tortoise move as fast as possible --#11
    //   Have the tortoise start at 200 pixels in on the X axis --#14
    int height = 42;
    drawHouse(height);
    //   drawHouse with height 120 (recipe below) --#10
    //   drawHouse with height 90 (recipe below) --#12
    //   drawHouse with height 20 (recipe below) --#13
  }
  private static void drawHouse(int height)
  {
    //       Change the pen color of the line the tortoise draws to lightGray --#15
    Tortoise.move(42);
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(90);
  }
}
