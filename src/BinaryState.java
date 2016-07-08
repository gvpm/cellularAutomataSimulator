/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class BinaryState extends State {
    
    int stateValue;

    public BinaryState() {
        type = 1;
        //default state;
        stateValue = 0;
        
    }
    
    
    
    

    @Override
    public boolean compare(State s) {
        boolean r = false;
        if(this.getType()==s.getType()){
            BinaryState bs = (BinaryState) s;           
            
            if(this.getStateValue() == bs.getStateValue()){
                r=true;
            }          
            
        
       return r; 
    }
        throw new UnsupportedOperationException("State types dont match ");
         
    }

    public int getStateValue() {
        return stateValue;
    }

    public void setState(int state) {
        this.stateValue = state;
    }
    
    
    
}
