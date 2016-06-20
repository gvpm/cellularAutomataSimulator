
import processing.core.*;

public class Window2 extends PApplet {

    @Override
    public void settings() {
        size(200, 600);
    }

    @Override
    public void setup() {
         background(150);

    }

    @Override
    public void draw() {
         stroke(255);
    if (mousePressed) {
      line(mouseX,mouseY,pmouseX,pmouseY);
    }

    }
}
