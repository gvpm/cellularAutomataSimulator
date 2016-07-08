
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
