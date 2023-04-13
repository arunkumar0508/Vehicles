package org.example;

public class Transmission  {
    String transmissionType;

    public Transmission(String type){
        if(type.equals("manual")){
            this.transmissionType=type;
        }
        else if(type.equals("AMT")){
            this.transmissionType=type;
        }
        else {
            System.out.println("Invalid type");
        }
    }

    public void setTransmissionType(String transmissionType) {

        this.transmissionType = transmissionType;
    }

    public String getTransmissionType() {

        return transmissionType;
    }

    public String showSpecs(){
        return "No specs";
    }
}

