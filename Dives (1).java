import java.util.*;
public class Dives extends Dive{
  ArrayList<Dive> instructions;

  public Dives(){
    instructions= new ArrayList<>();
  }

  public String DisplayDepthHoriz(){
    int depth=0;
    int horiz=0;
    for (Dive s: instructions){
      if (s.getDirection().equals("forward")){
        horiz+=s.getCount();
      }
      else if(s.getDirection().equals("up")){
        depth-=count;
      }
      else if(s.getDirection().equals("up")){
        depth+=count;
      }
    }
    return "Depth: " + depth + " Horizontal Position: "+ horiz;
    }

  public String toString(){
    String ret = "";
    for ( Dive s: instructions){
      ret+="\n"+"Direction: "+ s.getDirection()+" Count: "+s.getCount();
    }
    return ret;
  }
  
}