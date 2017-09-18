package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Reds;

public class HousesB
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    int height = 40;
    drawHouse(height);
    drawHouse(30);
    drawHouse(120);
    drawHouse(150);
    drawHouse(90);
    drawHouse(70);
    drawHouse(20);
    drawHouse(100);
    drawHouse(200);
    //drawHousesSlantedRoof
  }
  //define a method called drawHouse SlantedRoof
  //define a method called DrawSlantedRoof
  private static void drawHouse(int height)
  {
    Tortoise.setPenColor(Reds.Red);
    Tortoise.move(height);
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawFlatRoof()
  {
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
  }
}
