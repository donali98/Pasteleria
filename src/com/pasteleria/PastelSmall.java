package com.pasteleria;

public class PastelSmall implements Cake{
    @Override
    public void cocinar() {
        System.out.println("El pastel pequeño se esta cocinando");

    }

    @Override
    public void transportar() {
        System.out.println("El pastel pequeño se esta transportando a la pasteleria");

    }

    @Override
    public void vender() {
        System.out.println("El pastel pequeño se esta vendiendo");

    }
}
