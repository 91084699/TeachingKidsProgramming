package org.teachingkidsprogramming.section02methods.Variations;

import org.teachingextensions.logo.Tortoise;

public class Houses2
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    //   drawHouse with height 90 (recipe below) --#12
    drawHouse(90);
    drawHouse(20);
    drawHouse(15);
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
