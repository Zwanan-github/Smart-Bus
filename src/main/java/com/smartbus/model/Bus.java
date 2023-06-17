package com.smartbus.model;


/**
 * @author hu'hao
 * 车辆实体
 */
public class Bus {

    /**
     * 车辆的主键
     */
    private Integer busId;

    /**
     * 车牌号
     */
    private String buslicense;

    /**
     * 车型
     */
    private String busType;

    /**
     * 车辆状态
     */
    private String busStatus;

    /**
     * 起运时间
     */
    private String startTime;

    public Integer getBusId() {
        return busId;
    }

    public void setBusId(Integer busId) {
        this.busId = busId;
    }

    public String getBuslicense() {
        return buslicense;
    }

    public void setBuslicense(String buslicense) {
        this.buslicense = buslicense;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public String getBusStatus() {
        return busStatus;
    }

    public void setBusStatus(String busStatus) {
        this.busStatus = busStatus;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
}
