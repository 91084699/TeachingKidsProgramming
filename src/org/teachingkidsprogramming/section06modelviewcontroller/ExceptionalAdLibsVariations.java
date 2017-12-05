package org.teachingkidsprogramming.section06modelviewcontroller;

import javax.management.MBeanOperationInfo;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ExceptionalAdLibsVariations
{
  public static void main(String[] args)
  {
    String adverb = askAdverb();
    String edverb = askEdverb();
  }//end of main
  private static String askEdverb()
  {
    // TODO Auto-generated method stub
    return null;
  }
  private static String askAdverb()
  {
    String adverb = MessageBox.askForTextInput("Enter an adverb: ");
    if (adverb.isEmpty())
    {
      MessageBox.showMessage("Y dont you want to play? To statr enter an adverb");
      askAdverb();
    }
    else if (adverb.matches("[\\d]*"))
    {
      MessageBox.showMessage("Numbers are not adverbs. Go back to 2nd grade");
      askAdverb();
    }
    return adverb;
  }//end of method
  private static String askEdverb()
    {
      String edVerb = MessageBox.askForTextInput("enter a verb ending in -ed: ");
      if(edVerb.isEmpty())
      {
        MessageBox.showMessage("Dont like verbs? You need one now");
        askEdverb();
      }
      else if(edVerb.matches([\\d]*))
    }
}}//end of class
