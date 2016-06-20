
import processing.core.*;

public class Sketch1 extends PApplet {

    @Override
    public void settings() {
        size(512, 512);
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
