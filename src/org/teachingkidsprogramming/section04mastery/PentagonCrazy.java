package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class PentagonCrazy
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    createColorPalette();
    drawPentagon();
  }
  private static void drawPentagon()
  {
    for (int i = 0; i < 200; i++)
    {
      //
      adjustPen();
      int length = i;
      Tortoise.move(length);
      Tortoise.turn(360 / 5);
      Tortoise.turn(1);
    }
  }
  private static void adjustPen()
  {
    Tortoise.setPenColor(ColorWheel.getNextColor());
    Tortoise.setPenColor(ColorWheel.getNextColor());
    Tortoise.setPenWidth(Tortoise.getPenWidth() + 1);
    //        If the tortoise's pen width is greater than 4, then --#17
    if (Tortoise.getPenWidth() > 4)
    {
      Tortoise.setPenWidth(1);
    }
    //            Reset the pen width to 1 --#16
    //        ------------- End of adjustPen recipe --#9.3 
    //
  }
  private static void createColorPalette()
  {
    ColorWheel.addColor(PenColors.Blues.SteelBlue);
    ColorWheel.addColor(PenColors.Purples.DarkOrchid);
    ColorWheel.addColor(PenColors.Blues.DarkSlateBlue);
    ColorWheel.addColor(PenColors.Blues.Teal);
    //    Add indigo to the color wheel --#14
    ColorWheel.addColor(PenColors.Purples.Indigo);
    //    ------------- End of createColorPalette recipe --#8.3
  }
}
