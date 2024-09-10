import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
// Creates a new Asphalt Painter to paint the background
    AsphaltPainter mel = new AsphaltPainter();
    mel.paintBackground("purple");
// Creates a new Mural Painter to paint components of a happy face  
// With parameters (colors)
    MuralPainter alice = new MuralPainter();
    alice.paintOutline("pink");
    alice.paintEyes("violet");
    alice.paintSmile("violet");
    alice.returnToAsphaltPainter();
  }
}