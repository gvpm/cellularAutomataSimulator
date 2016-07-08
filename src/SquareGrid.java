import processing.core.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gvpm
 */
public class SquareGrid {
    
    float width, height;
    int rows,columns;
    float cellSize;
    int nCells;        
    PApplet p ;

    public SquareGrid(PApplet p) {
        this.p = p;
    }

    

    public void setup(int rows, int columns, float cellSize) {
        
        this.rows = rows;
        this.columns = columns;
        this.cellSize = cellSize;
        
        height = rows*cellSize;
        width = columns*cellSize;
        nCells = rows*columns;
    }
    
    public void update(){
        
        
    }
    
    public void draw(){
        p.stroke(0);
        p.fill(150);
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                p.rect(cellSize*i, cellSize*j, cellSize, cellSize);
            }
            
        }
        
        
    }
    
    
    
    
    
}
