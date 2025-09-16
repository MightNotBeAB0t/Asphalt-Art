import org.code.neighborhood.*;
public class PainterPlus extends Painter{
  //function turns right, is called "turnRight();"
  public void turnRight(){
    turnLeft();
    turnLeft();
    turnLeft();
  }
//function takes all paint, call is "takeAllPaint();"
public void takeAllPaint(){
  while (isOnBucket()){
    takePaint();
  }
}

//function moves painter forward until cant, call is "moveFast();"
public void moveFast(){
  while (canMove()){
    move();
  }
}
//function paints and moves until out of paint, call is "paintToEmpty();"
public void paintToEmpty(String color){
    while (hasPaint()){
      paint(color);
      move();
    }
  }
//function paints a donut (below), call is "paintDonut();"
public void paintDonut(String color){
  while (hasPaint()){
    move();
    turnRight();
    paint(color);
    move();
    paint(color);
  }
}
//... turns around???...
  public void turnAround(){
    turnRight();
    turnRight();
  }
}