package com.pasteleria;

public class CakeFactory {

    public static Cake getCake(CakeType type){
        switch (type){
            case SMALL:
                return new PastelSmall();
            case MEDIUM:
                return new PastelMediano();
            case LARGE:
                return new PastelGrande();
            default:
                return null;
        }
    }

}
