
import processing.core.*;
//test gitt

public class Sketch extends PApplet {

    public static void main(String[] args) {

        PApplet.main(new String[]{"Sketch"});
    }

    @Override
    public void settings() {
        size(512, 512);
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
