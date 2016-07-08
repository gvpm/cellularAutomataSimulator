/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gvpm
 */
public abstract class State {
    
    int type;
    //1= binary

    public State() {
        
    }
    
   

    public int getType() {
        return type;
    }
    
    
    
    public abstract boolean compare (State s);
    
    public abstract void copy (State s);
    
    
    
    
}
