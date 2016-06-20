
import processing.core.*;

public class Window1 extends PApplet {

 
    @Override
    public void settings() {
        size(600, 600);
    }

    @Override
    public void setup() {
         background(0);

    }

    @Override
    public void draw() {
         stroke(255);
    if (mousePressed) {
      line(mouseX,mouseY,pmouseX,pmouseY);
    }

    }
}
