//represents the binary state, might change

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

    @Override
    public void copy(State s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
