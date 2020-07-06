package com.github.mathan26.concepts.innerclassexample.interfaceinsideclass;

public class VehcileTypes {

    interface vehcile{
        public void getNoofWheels();
    }

    class Bus implements vehcile{

        @Override
        public void getNoofWheels() {
            System.out.println("Four wheels");
        }
    }
    class Bike implements vehcile{

        @Override
        public void getNoofWheels() {
            System.out.println("Two wheels");
        }
    }

    public static void main(String[] args) {
        VehcileTypes.vehcile  obj= new VehcileTypes().new Bike();
        obj.getNoofWheels();
    }
}
