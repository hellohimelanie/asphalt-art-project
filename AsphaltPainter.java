import org.code.neighborhood.*;
public class AsphaltPainter extends PainterPlus {
  // Paints the background
  // With your choice of color
  public void paintBackground(String color){
    while(canMove("south")){ 
      paintLine(color, 8);
      turnWest();
      paintLine(color,8);
      turnEast();
    }
  }
  // Paints a line given the color and the distance of the line
    public void paintLine(String color, int distance) {
    setPaint(distance);

    while (hasPaint()) {
      paint(color);

      if (canMove()) {
        move();
      }
    }
  }
  // Makes a turn West if it's facing
  // East and it can move
  public void turnWest(){
    if (isFacingEast()){
      turnRight();
      if (canMove()) {
        move();
        turnRight();
      }
    }
  }
// Makes a turn East if it's facing
// West and it can move
  public void turnEast(){
    if (isFacingWest()){
      turnLeft();
      if (canMove()) {
      move();
      turnLeft();
      }
    }
  }
}