package org.example;

public class Manual extends Transmission {
    String MP4;
    String MP5;
    String MP6;

    public Manual(String type, String modelNum) {
        super(type);
        if (type.equals("manual")) {
            if (modelNum.equals("MP4")) {
                this.MP4 = modelNum;
            } else if (modelNum.equals("MP5")) {
                this.MP5 = modelNum;
            } else if (modelNum.equals("MP6")) {
                this.MP6 = modelNum;
            } else {
                System.out.println("Invalid number");
            }
        } else {
            System.out.println("Invalid transmission type");
        }
    }


    public String showSpecs() {
        if (this.MP4 !=null) {
            return "Transmission type: " +this.getTransmissionType()+"\nTransmission Model Number: MP4\nKey Specifications\nForward Gears: 4\n1st gear ratio: 2.540\n2nd gear ratio: 1.920\n3rd gear ratio: 1.510\n4th gear ratio: 1.000";
        } else if (this.MP5 !=null) {
            return "Transmission type: " +this.getTransmissionType()+"\nTransmission Model Number: MP5\nKey Specifications\nForward Gears: 5\n1st gear ratio: 3.545\n2nd gear ratio: 1.904\n3rd gear ratio: 1.280\n4th gear ratio: 0.914\n5th gear ratio: 0.757";
        } else if (this.MP6 !=null) {
            return "Transmission type: " +this.getTransmissionType()+"\nTransmission Model Number: MP6\nKey Specifications\nForward Gears: 6\n1st gear ratio: 3.010\n2nd gear ratio: 2.070\n3rd gear ratio: 1.430\n4th gear ratio: 1.000\n5th gear ratio: 0.710\n6th gear ratio: 0.570";
        } else {
            return "Transmission Model Number Invalid";
        }
    }
}

