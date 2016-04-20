package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import views.*;

public class Floor {
    //

    protected ArrayList<Unit> unitList = new ArrayList<Unit>();

    public void addUnit(Unit u) {
        this.unitList.add(u);
    }
    
    public void removeUnit(Unit u){
        this.unitList.remove(u);
    } 

    public ArrayList<Unit> getUnitList() {
        return this.unitList;
    }

    public void setUnitList(ArrayList<Unit> unitList) {
        this.unitList = unitList;
    }


}
