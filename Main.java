import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;



class Main {
  public static void main(String[] args) {
    String[] lines = importFile("dive.txt");
    //System.out.println(lines.length);
    // think about how you might separate each of the lines
    // https://www.youtube.com/watch?v=sBApUWZ80GQ
    String num = "100";
    int n = Integer.parseInt(num);
    System.out.println(multiplyDepthHoriz(lines));
    
  }

public static int multiplyDepthHoriz(String [] instructions){
  int depth = 0;
  int horiz = 0;
  int aim=0;
  int x=0;
  for ( String s:instructions){
    if (s.indexOf("forward")>=0){
      x= Integer.valueOf((""+s.charAt(s.length()-1)));
      horiz+=x;
      depth+=(aim*x);
    }
    else if (s.indexOf("up")>=0){
     x= Integer.valueOf(""+s.charAt(s.length()-1));
     
      aim-=x;
    }
    else if (s.indexOf("down")>=0){
      x= Integer.valueOf(""+s.charAt(s.length()-1));
     
      aim+=x;
    }
  }
  return depth*horiz;
}













  
// don't touch below this line...
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
}// end class
