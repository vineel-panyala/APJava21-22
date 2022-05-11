public class Dive {
  String direction;
  int count;

  public Dive(String d, int c){
    direction=d;
    count=c;
  }
  public Dive(){
    direction = "";
    count = 0;
  }
  public String getDirection(){
    return direction;
  }
  public int getCount(){
    return count;
  }
  
}