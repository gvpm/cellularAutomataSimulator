import java.util.ArrayList;
import processing.core.*;

//Specific type of grid
public class SquareGrid {
    
    float totalWidth, totalHeight;
    int rows,columns;
    float cellSize;
    int nCells;        
    PApplet p ;
    ArrayList<SquareCell8> Cells;

    public SquareGrid(PApplet p) {
        this.p = p;
    }

    

    public void setup(int rows, int columns, float cellSize) {
        
        this.rows = rows;
        this.columns = columns;
        this.cellSize = cellSize;
        
        totalHeight = rows*cellSize;
        totalWidth = columns*cellSize;
        nCells = rows*columns;
        
        Cells = new ArrayList<SquareCell8>();
        
        System.out.println(totalWidth +" " + totalHeight +" " +nCells);
    }
    
    public void init(){
        
        for (int i = 0; i < nCells; i++) {
            Cells.add(new SquareCell8(i,false));
            
        }
    }
    
    public void update(){
        
        
    }
     
    public void draw(){
        p.stroke(0);
        p.fill(150);
        //p.size((int)totalWidth,(int)totalHeight);
     
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                p.rect(cellSize*i, cellSize*j, cellSize, cellSize);
            }
            
        }
        
        
    }
    
    
    
    
    
}
