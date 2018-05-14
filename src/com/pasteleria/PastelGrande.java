package com.pasteleria;

public class PastelGrande implements Cake{


    @Override
    public void cocinar() {
        System.out.println("El pastel grande se esta cocinando");
    }

    @Override
    public void transportar() {
        System.out.println("El pastel grande se esta transportando a la pasteleria");
    }

    @Override
    public void vender() {
        System.out.println("El pastel grande se esta vendiendo");
    }
}
