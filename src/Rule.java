
public class Rule {
    
    int type;
    //1 for normal 2 for quantitative
    
    State newState;
    
    Cell ruleCell;
    
    //to use in quantitative rules
    
    State currentState;

    public Rule(State newState, State currentState) {
        type = 2;
        
        this.newState = newState;
        this.currentState = currentState;
        
    }
    //similarity case
    public Rule(Cell ruleCell, State newState) {
        type = 1;
        this.newState = newState;
        this.ruleCell = ruleCell;
        if (!ruleCell.isRuleCell()){
             throw new UnsupportedOperationException("Not a rule cell ");
            
        }
    }
    //checks if the rulle is applicable and if it is, changes the next state of the cell
    // and flags the change
    public boolean applyRule(Cell c){
        if(c.compare(ruleCell)){
            State next = newState;
            c.setNextState(next);
            c.flagNewState();
            
            
           return true; 
        }else{
        
        
            return false;
        }
    }
    
    
    
    
    

   
    
    
    
    
}
