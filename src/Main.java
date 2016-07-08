
import processing.core.PApplet;
//TODO

/*
====Make the grid create and instanciate all the cell structures

----Stabilish the neighbours and 


----give random states for test purpuse

About that, each state instanciated will probably have an id and that will be the only state
innstanciated, tjis will be passed around.
figure out how to draw the different states
make grid draw all alone?

----grid will draw all alone and ask for the cell each time what colour should I draw?

----grid will have a function thta will translate x and y position of the mouse and will know what cell is pointing

---Create a factory for STATE, grid will know the id that will state the type of state
will ask the factory to create

----Create State Factory, Create grid factory, create cell factory.


---create one rule and try to apply




*/

public class Main extends PApplet {
    
    SquareGrid  grid;
    
    
      public static void main(String[] args) {
          
        //This code together with the class windoes make the code run 2 applets  
        //PApplet a = new PApplet();      
        //PApplet b = new PApplet();        
        //a.main(new String[]{"SquareGrid"});
        //b.main(new String[]{"Window2"});

         PApplet.main(new String[]{"Main"});
        
                
       
    }
      
      @Override
    public void settings() {
        size(800,800);
    }

    @Override
    public void setup() {
         
         grid = new SquareGrid(this);
         grid.setup(10, 10, 10);

    }
    public void update() {
         
         grid.update();

    }

    @Override
    public void draw() {
         stroke(255);
         grid.draw();
         
   

    }
      
      
}
