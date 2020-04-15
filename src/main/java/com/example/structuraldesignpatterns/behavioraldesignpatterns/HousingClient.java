package com.example.structuraldesignpatterns.behavioraldesignpatterns;

public class HousingClient {
    public static void main(String[] args) {
        HouseTemplate houseType = new WoodenHouse();
        houseType.buildHouse();
        System.out.println("-0--------0-");
        houseType = new GlassHouse();
        houseType.buildHouse();

    }
}
