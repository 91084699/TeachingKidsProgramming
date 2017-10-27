package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;
import org.teachingkidsprogramming.recipes.quizzes.graders.HiLowQuizGrader;

public class HiLowQuiz extends org.teachingkidsprogramming.recipes.quizzes.graders.HiLowQuiz
{
  private static final int Y = 0;
  private static final int x = 0;
  @Override
  public void question1()
  {
    //  If the Y position of the tortoise is 115
    if (Y = 115)
      //  Turn the tortoise to the right 63 degrees 
      Tortoise.turn(63);
  }
  @Override
  public void question2()
  {
    //  If the X position of tortoise is less than Y position of tortoise
    if (x < Y)
      //  Turn the tortoise 54 degrees to the left
      Tortoise.turn(-54);
    //  Otherwise turn the tortoise 22 degrees to the right
    Tortoise.turn(22);
  }
  @Override
  public void question3()
  {
    //  Display the message "elcomeway omehay!"
    MessageBox.showMessage("elcomeway omehay");
  }
  @Override
  public void question4()
  {
    //  If the Y position of tortoise is greater than 50
    if (Y > 50)
      //  Turn the tortoise 177 degrees to the left
      Tortoise.turn(-177);
  }
  public static void main(String[] args)
  {
    new HiLowQuizGrader().grade(new HiLowQuiz());
  }
}
