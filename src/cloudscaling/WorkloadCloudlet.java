/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cloudscaling;

import org.cloudbus.cloudsim.Cloudlet;
import org.cloudbus.cloudsim.UtilizationModel;

/**
 *
 * @author nhuanhunter
 */
public class WorkloadCloudlet extends Cloudlet {
    private int cpuCore;
    private int memoryRequest;
    private int timeSubmitted;


    public WorkloadCloudlet(int cloudletId, long cloudletLength, int pesNumber, long cloudletFileSize, long cloudletOutputSize, UtilizationModel utilizationModelCpu, UtilizationModel utilizationModelRam, UtilizationModel utilizationModelBw) {
        super(cloudletId, cloudletLength, pesNumber, cloudletFileSize, cloudletOutputSize, utilizationModelCpu, utilizationModelRam, utilizationModelBw);
        
    }
    
        public int getTimeSubmitted() {
        return timeSubmitted;
    }

    public void setTimeSubmitted(int timeSubmitted) {
        this.timeSubmitted = timeSubmitted;
    }

    public int getCpuCore() {
        return cpuCore;
    }

    public void setCpuCore(int cpuCore) {
        this.cpuCore = cpuCore;
    }

    public int getMemoryRequest() {
        return memoryRequest;
    }

    public void setMemoryRequest(int memoryRequest) {
        this.memoryRequest = memoryRequest;
    }


    
}
