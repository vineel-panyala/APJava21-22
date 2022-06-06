import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;

public class FortuneCookie{

  
  private String[] fortunes;

  public FortuneCookie(){
    fortunes=importFile("FortuneCookie.txt");
  }

  public String randomFortuneCookieMessage(){
    return fortunes[(int)(Math.random()*fortunes.length)];
  }
  public int luckyNumber() {
    return (int) (Math.random()*100 + 1);
  }
  


  
  // this is from Dive 
  //DONT TOUCH BELOW
  public static String[] importFile(String fileName){
    ArrayList<String> words = new ArrayList<>();
    try {
      File myObj = new File(fileName);
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        words.add(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    String[] wordArray = toArray(words);
    return wordArray;
  }

  public static String[] toArray(ArrayList<String> s){
    String[] words = new String[s.size()];
    for(int i = 0; i < words.length; i++){
      words[i] = s.get(i);
    }
    return words;
  }
}