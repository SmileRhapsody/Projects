/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Information;

/**
 *
 * @author Administrator
 */
public class Data {
    AddData adddata;
    SavData savdata;
    DemData demdata;
    DrivData drivdata;
    MediData medidata;    
    
    public Data(){
        adddata = new AddData();
        savdata = new SavData();
        demdata = new DemData();
        drivdata = new DrivData();
        medidata = new MediData();
    }

    public AddData getAdddata() {

        return adddata;
    }

    public void setAdddata(AddData adddata) {
        this.adddata = adddata;
    }

    public SavData getSavdata() {
        return savdata;
    }

    public void setSavdata(SavData savdata) {
        this.savdata = savdata;
    }

    public DemData getDemdata() {
        return demdata;
    }

    public void setDemdata(DemData demdata) {
        this.demdata = demdata;
    }

    public DrivData getDrivata() {
        return drivdata;
    }

    public void setDrivata(DrivData drivata) {
        this.drivdata = drivdata;
    }

    public MediData getMedidata() {
        return medidata;
    }

    public void setMedidata(MediData medidata) {
        this.medidata = medidata;
    }
    
    
}
