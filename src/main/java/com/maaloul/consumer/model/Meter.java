package com.maaloul.consumer.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;


@Document(indexName="meters")

public class Meter implements Serializable{ 
	
	@Id
	private Long meterId;
		
    @Field(type = FieldType.Keyword, name = "deviceType")
	private String deviceType;

    @Field(type = FieldType.Keyword, name = "region")
	private String region;
    
    @Field(type = FieldType.Keyword, name = "comType")
	private String comType;

	@Field(type = FieldType.Keyword, name = "amrRouter")
    private String amrRouter;

	@Field(type = FieldType.Keyword, name = "logicalDeviceName")
    private String logicalDeviceName;

	@Field(type = FieldType.Keyword, name = "constructor")
    private String constructor;

   

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }


    public String getConstructor() {
        return constructor;
    }

    public void setConstructor(String constructor) {
        this.constructor = constructor;
    }

    

    public Long getMeterId() {
        return meterId;
    }

    public void setMeterId(Long meterId) {
        this.meterId = meterId;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getComType() {
        return comType;
    }

    public void setComType(String comType) {
        this.comType = comType;
    }

    public String getAmrRouter() {
        return amrRouter;
    }

    public void setAmrRouter(String amrRouter) {
        this.amrRouter = amrRouter;
    }

    public String getLogicalDeviceName() {
        return logicalDeviceName;
    }

    public void setLogicalDeviceName(String logicalDeviceName) {
        this.logicalDeviceName = logicalDeviceName;
    }

	

}