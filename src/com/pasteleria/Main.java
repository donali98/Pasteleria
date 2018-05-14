package com.pasteleria;

public class Main {

    public static void main(String[] args) {
        Cake pastel = null;
        for (int i = 0; i<3; i++){
            System.out.println("------------------------------");
            switch (i){
                case 0:
                     pastel = CakeFactory.getCake(CakeType.SMALL);
                break;
                case 1:
                    pastel = CakeFactory.getCake(CakeType.MEDIUM);
                    break;
                case 2:
                    pastel = CakeFactory.getCake(CakeType.LARGE);
                    break;
            }
            pastel.cocinar();
            pastel.transportar();
            pastel.vender();
        }


    }
}
