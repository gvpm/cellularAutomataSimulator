
import java.util.ArrayList;




public abstract class Cell {
    
    int type;
    //1= Square 8 neighbours
    int id;
    State currentState;
    State nextState;
    ArrayList<State> stateHistory;
    
    boolean hasNewState;
    
    //The cell with the rule type will only have the states of the neighbours
    boolean rule;

    public Cell(int id, boolean rule) {
        this.id = id;
        this.rule=rule;
        hasNewState = false;
    }
    
    //--------Getters and Setters
    
    public void flagNewState(){
        hasNewState = true;
        
    }
    public void unFlagNewState(){
        hasNewState = false;
        
    }
    

    public boolean hasNewState() {
        return hasNewState;
    }
    
    
    public int getType() {
        return type;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public State getNextState() {
        return nextState;
    }

    public void setNextState(State nextState) {
        this.nextState = nextState;
    }
    
    //--------Others
    
    public boolean typeMatch (Cell c){
        return c.getId()==this.getId();
        
    }
    
    public boolean isRuleCell(){
        return rule;
        
    }
    //change this to put history
    
    //will update the cell, unflags the changes, current becomes new, new becomes null
    public void updateCell(){
        if(hasNewState()){
            unFlagNewState();
            currentState = nextState;
            nextState = null;
            
            
        }
        
    }
    
    
    //--------Abstracts
    
    public abstract boolean compare (Cell c);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
