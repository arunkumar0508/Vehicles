package org.example;

public class AMT extends Transmission {
    String AMTP4;
    String AMTD5;

    public AMT(String type,String modelNum) {
        super(type);
        if (modelNum.equals("AMTP4")) {
            this.AMTP4 = modelNum;
        } else if (modelNum.equals("AMTD5")) {
            this.AMTD5 = modelNum;
        } else {
            System.out.println("Invalid number");
        }
    }

    public String showSpecs() {
        if (this.AMTP4!=null){
            return "Transmission type: AMT\nTransmission Model Number: AMTP4\nKey Specifications\nForward Gears: 4\n1st gear ratio: 2.540\n2nd gear ratio: 1.920\n3rd gear ratio: 1.510\n4th gear ratio: 1.000";
        } else if (this.AMTD5!=null) {
            return "Transmission type: AMT\nTransmission Model Number: AMTP4\nKey Specifications\nForward Gears: 4\n1st gear ratio: 2.950\n2nd gear ratio: 1.940\n3rd gear ratio: 1.340\n4th gear ratio: 1.000\n5th gear ration0.630" ;
        } else{
            return "Invalid Number";
        }

    }
}

