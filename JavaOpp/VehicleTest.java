class VehicleTest{
    public static void main(String[] args){
        // create car and bike object
        Vehicle bike = new Vehicle("blue");
        // Vehicle car = new Vehicle();
        // contruct is being used on this new object
        Vehicle redCar = new Vehicle("red");
        System.out.println(redCar.getColor());

        // set bike color and wheels
        // bike.setColor("Blue");
        bike.setNumberOfWheels(2);

        // get bike color and wheels
        System.out.println(" Bike object - color" + bike.getColor());
        System.out.println(" Bike object - Wheels" + bike.getNumberOfWheels());
        // set car color and wheels
        // car.setColor("Green");
        // car.setNumberOfWheels(4);

        // get car color and wheels
        // System.out.println(" Car object - color" + car.getColor());
        // System.out.println(" Car object - Wheels" + car.getNumberOfWheels());


    }
}