package com.pasteleria;

public class PastelMediano implements Cake{

    @Override
    public void cocinar() {
        System.out.println("El pastel mediano se esta cocinando");
    }

    @Override
    public void transportar() {
        System.out.println("El pastel mediano se esta transportando a la pasteleria");

    }

    @Override
    public void vender() {
        System.out.println("El pastel mediano se esta vendiendo");

    }
}
