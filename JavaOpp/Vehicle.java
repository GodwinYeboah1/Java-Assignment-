class Vehicle{
    private int numberOfWheels;
    private String color;

    // overload methods
        public Vehicle(){

        }
        // constructor method called when a object is created
        // handle some color
        public Vehicle(String color){
            this.color = color;
        }
        public Vehicle(String color, int numberOfWheels){
            this.color = color;
            this.numberOfWheels = numberOfWheels;
        }

    // getter
    // display
    public int getNumberOfWheels(){
        return numberOfWheels;
    }

    // setter
    // void  return type because it does not return noting
    public void setNumberOfWheels(int number){
        numberOfWheels = number;
    }

    // getter
    // display color
    public String getColor(){
        return color;
    }

    // setter
    // set color 
    // public void setColor(String color){
    //     // ref to the instance variable
    //     this.color = color;
    // }

}