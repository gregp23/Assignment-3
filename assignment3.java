//Gregory Pierre || EMPLID: 15239799 || CISC 3130- TY2- Fall 2019
import java.util.Stack;
import java.util.Scanner;
import java.util.*;
import java.io.File;
import java.util.StringTokenizer;

class assignment3 {
  public static void main(String[] args)throws Exception {
    File file = new File("gucci.txt");

    Scanner scanner = new Scanner(file);
    //Scanner that reads the lyrics of the song Gucci gang
    String wholetext="";
    while(scanner.hasNextLine()){
      String readme = scanner.nextLine();
      wholetext = wholetext+" "+readme;
    }
  //I created a StringTokenizer object to remove any delimiters
    StringTokenizer str = new StringTokenizer(wholetext, ",// //(//)//!//");

   System.out.println("This song has a total of " + str.countTokens()+ " words");
   System.out.println("The phrase 'Gucci Gang' was repeated "+repeat(wholetext)+" times");}
   //Created a method that counts the number of times the phrase Gucci Gang was repeated in the song
  static int repeat(String string){  
      String[]a = string.split("Gucci gang");
    return a.length-1;
  }
}
