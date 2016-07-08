/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gvpm
 */
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
