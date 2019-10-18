/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author jhalak
 */
public class TravelAgency {

    private MasterSchedule masterScheduleDirectory;
    private AirlinerDirectory airlinerDirectory;
    private CustomerDirectory customerDirectory;

    public TravelAgency() {
        masterScheduleDirectory = new MasterSchedule();
        airlinerDirectory = new AirlinerDirectory();
        customerDirectory=new CustomerDirectory();

    }

    public MasterSchedule getMasterScheduleDirectory() {
        return masterScheduleDirectory;
    }

    public void setMasterScheduleDirectory(MasterSchedule masterScheduleDirectory) {
        this.masterScheduleDirectory = masterScheduleDirectory;
    }

    public AirlinerDirectory getAirlinerDirectory() {
        return airlinerDirectory;
    }

    public void setAirlinerDirectory(AirlinerDirectory airlinerDirectory) {
        this.airlinerDirectory = airlinerDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

}
