/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class SquareCell8 extends Cell {
    
    SquareCell8 northWestNeighbour;
    SquareCell8 northNeighbour;
    SquareCell8 northEastNeighbour;
    SquareCell8 eastNeighbour;
    SquareCell8 southEastNeighbour;
    SquareCell8 southNeighbour;
    SquareCell8 southWestNeighbour;
    SquareCell8 westNeighbour;
    
    State nwSt,nSt,neSt,eSt,seSt,sSt,swSt,wSt;
    
    
    

    public SquareCell8(int id, boolean rule ) {
        super(id, rule);
        this.type=1;
        
    }
    //Constructor for the rule cell
    public SquareCell8(int id, boolean rule, State nw, State n,State ne,State e,State se,State s,State sw,State w ) {
        super(id, rule);
        this.type=1;
        
        this.nwSt=nw;
        this.nSt=n;
        this.neSt=ne;
        this.eSt=e;
        this.seSt=se;
        this.sSt=s;
        this.swSt=sw;
        this.wSt=w;
        
        
        
    }

    public boolean compare(Cell ruleCell) {
        if(ruleCell.getType()==this.getType()){
        SquareCell8 c = (SquareCell8) ruleCell;
        
        if(c.isRuleCell()){
        
        boolean c0= this.currentState.compare(c.currentState);
        boolean c1 = this.getNorthWestNeighbour().getCurrentState().compare(c.getNWSt());
        boolean c2 = this.getNorthNeighbour().getCurrentState().compare(c.getNSt());
        boolean c3 = this.getNorthEastNeighbour().getCurrentState().compare(c.getNESt());
        boolean c4= this.getEastNeighbour().getCurrentState().compare(c.getESt());
        boolean c5 = this.getSouthEastNeighbour().getCurrentState().compare(c.getSESt());
        boolean c6 = this.getSouthNeighbour().getCurrentState().compare(c.getSSt());
        boolean c7 = this.getSouthWestNeighbour().getCurrentState().compare(c.getSWSt());
        boolean c8 = this.getWestNeighbour().getCurrentState().compare(c.getWSt());
        
        return  c0&&c1&&c2&&c3&&c4&&c5&&c6&&c7&&c8;
        
        }else{
            throw new UnsupportedOperationException("Cell to compare is not a Rule ");
            
        }
        }
         throw new UnsupportedOperationException("Cell type wont match rule type ");
        
        
    }
    
    
    
    
    
    //-----------Getters and Setters

    public SquareCell8 getNorthWestNeighbour() {
        return northWestNeighbour;
    }

    public void setNorthWestNeighbour(SquareCell8 northWestNeighbour) {
        this.northWestNeighbour = northWestNeighbour;
    }

    public SquareCell8 getNorthNeighbour() {
        return northNeighbour;
    }

    public void setNorthNeighbour(SquareCell8 northNeighbour) {
        this.northNeighbour = northNeighbour;
    }

    public SquareCell8 getNorthEastNeighbour() {
        return northEastNeighbour;
    }

    public void setNorthEastNeighbour(SquareCell8 northEastNeighbour) {
        this.northEastNeighbour = northEastNeighbour;
    }

    public SquareCell8 getEastNeighbour() {
        return eastNeighbour;
    }

    public void setEastNeighbour(SquareCell8 eastNeighbour) {
        this.eastNeighbour = eastNeighbour;
    }

    public SquareCell8 getSouthEastNeighbour() {
        return southEastNeighbour;
    }

    public void setSouthEastNeighbour(SquareCell8 southEastNeighbour) {
        this.southEastNeighbour = southEastNeighbour;
    }

    public SquareCell8 getSouthNeighbour() {
        return southNeighbour;
    }

    public void setSouthNeighbour(SquareCell8 southNeighbour) {
        this.southNeighbour = southNeighbour;
    }

    public SquareCell8 getSouthWestNeighbour() {
        return southWestNeighbour;
    }

    public void setSouthWestNeighbour(SquareCell8 southWestNeighbour) {
        this.southWestNeighbour = southWestNeighbour;
    }

    public SquareCell8 getWestNeighbour() {
        return westNeighbour;
    }

    public void setWestNeighbour(SquareCell8 westNeighbour) {
        this.westNeighbour = westNeighbour;
    }

    public State getNWSt() {
        return nwSt;
    }

    public void setNWSt(State nwSt) {
        this.nwSt = nwSt;
    }

    public State getNSt() {
        return nSt;
    }

    public void setNSt(State nSt) {
        this.nSt = nSt;
    }

    public State getNESt() {
        return neSt;
    }

    public void setNESt(State neSt) {
        this.neSt = neSt;
    }

    public State getESt() {
        return eSt;
    }

    public void setESt(State eSt) {
        this.eSt = eSt;
    }

    public State getSESt() {
        return seSt;
    }

    public void setSESt(State seSt) {
        this.seSt = seSt;
    }

    public State getSSt() {
        return sSt;
    }

    public void setSSt(State sSt) {
        this.sSt = sSt;
    }

    public State getSWSt() {
        return swSt;
    }

    public void setSWSt(State swSt) {
        this.swSt = swSt;
    }

    public State getWSt() {
        return wSt;
    }

    public void setWSt(State wSt) {
        this.wSt = wSt;
    }

  

 
    
    
}
