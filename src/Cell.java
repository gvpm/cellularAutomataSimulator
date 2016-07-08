
import java.util.ArrayList;



/**
 *
 * @author gvpm
 */
public abstract class Cell {
    
    int type;
    //1= Square 8 neighbours
    int id;
    State currentState;
    State nextState;
    ArrayList<State> stateHistory;
    
    
    //The cell with the rule type will only have the states of the neighbours
    boolean rule;

    public Cell(int id, boolean rule) {
        this.id = id;
        this.rule=rule;
    }
    
    //--------Getters and Setters
    
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
    
    
    //--------Abstracts
    
    public abstract boolean compare (Cell c);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
