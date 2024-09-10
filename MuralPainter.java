import org.code.neighborhood.*;
public class MuralPainter extends AsphaltPainter {
 // Paints the outline
 // of the happy face
 // with your choice of color
  public void paintOutline(String color) {
    move();
    move();
    paintLine(color, 4);
    turnRight();
    move();
    paintLine(color,1);
    turnLeft();
    move();
    turnRight();
    paintLine(color,4);
    turnRight();
    move();
    paintLine(color,1);
    turnLeft();
    move();
    turnRight();
    paintLine(color,4);
    turnRight();
    move();
    paintLine(color,1);
    turnLeft();
    move();
    turnRight();
    paintLine(color,4);
    turnRight();
    move();
    paintLine(color,1);
  }
// Paints the eyes
// Of the happy face
// with your choice of color
  public void paintEyes(String color){
    turnRight();
    move();
    paintLine(color,2);
    turnLeft();
    move();
    move();
    move();
    turnLeft();
    move();
    paintLine(color,2);
  }
  // Paints the smile 
  // Of the happy face
  // With your choice of color
  public void paintSmile(String color){
    turnRight();
    move();
    turnRight();
    move();
    move();
    move();
    move();
    turnRight();
    move();
    paintLine(color,1);
    turnLeft();
    move();
    turnRight();
    paintLine(color,2);
    turnRight();
    move();
    paintLine(color,1);
  }
  // Moves the painter
  // to the Asphalt Painter
  public void returnToAsphaltPainter(){
    turnLeft();
    move();
    move();
    turnLeft();
    move();
    move();
    move();
  }
}