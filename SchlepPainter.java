import org.code.neighborhood.*;

public class SchlepPainter extends PainterPlus{
//Because his eyes and mouth is disporportionate, It will be difficult to make it all 1 loop.
//Code is repeated multiple times because of that.
public void paintSchlep(String color) {
// paints the eyes
  turnRight();
  move();
  move();
  turnLeft();
  
  move();
  move();
  paintEye(color);
  //first eye

  move();
  move();
  move();
  move();
  move();
  move();
  move();
  paintEye(color);
  //Second Eye

  turnRight();
  move();
  move();
  move();
  turnRight();
  move();
  paintEye(color);
  //Third Eye

  move();
  move();
  move();
  move();
  move();
  move();
  turnRight();
  move();
  paintEye(color);
  //Fourth Eye

  turnAround();
  move();
  move();
  turnRight();
  move();
  turnLeft();
  move();
  paintSmile(color);
  //Paints the smile.
  }
  //btw just realized I could've used for loops for the upper portion, but too lazy...
  //doesn't need to be looped because its just once.
  public void paintEye(String color){
    paint(color);
  }
  //I took notes last year, so I used a for loop to make the smile. 
  //Makes the smile going down
  public void paintSmile(String color){
   for (var i = 0; i < 2; i++) {
    paint(color);
    move();
    paint(color);
    turnLeft();
    move();
    turnRight();
    }
    turnLeft();
    //Makes the flat portion of the smile
    for (var i = 0; i < 6; i++) {
      paint(color);
      move();
    }
    //Makes the part of the smile up.
    for (var i = 0; i < 2; i++) {
      paint(color);
      turnLeft();
      move();
      paint(color);
      turnRight();
      move();
    }
  }
}

