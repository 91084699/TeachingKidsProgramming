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
    drawHouseFlatRoof(height);
    drawHousePointyRoof(30);
    drawHouseFlatRoof(120);
    drawHousePointyRoof(150);
    drawHouseFlatRoof(30);
    //drawHousesSlantedRoof(50)
  }
  private static void drawHouseFlatRoof(int height)
  {
    // TODO Auto-generated method stub
  }
  private static void drawHousePointyRoof(int i)
  {
    // TODO Auto-generated method stub
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
