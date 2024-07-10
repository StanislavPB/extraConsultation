package org.extraconsultation.cons_01.oop.interfaces;

public class TransportDemo {
    public static void main(String[] args) {

        NormalCar normalCar = new NormalCar();
        BmwMoto bmwMoto = new BmwMoto();
        Bycicle bycicle = new Bycicle();

        TransportVehicle[] transportVehicles = {normalCar,bycicle,bmwMoto};

        for (int i = 0; i < transportVehicles.length; i++) {
            transportVehicles[i].speedUp();
        }

        Pedestrian pedestrian = new Pedestrian();

        Moving[] movingObjects = {normalCar,bmwMoto, bycicle,pedestrian};

        for (int i = 0; i < movingObjects.length; i++) {
            movingObjects[i].movement();
        }

    }
}
