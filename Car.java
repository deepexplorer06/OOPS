class Car {
    // Attributes of the Car class
    String car_color;
    String car_brand;
    String fuel_type;
    double mileage;
    
    // Constructor
    Car() {
        System.out.println("Welcome to car garage");
    }
    
    // Methods
    void start() {
        System.out.println(car_brand + " is starting.");
    }
    
    void stop() {
        System.out.println(car_brand + " is stopping.");
    }
    
    void service() {
        System.out.println(car_brand + " needs servicing.");
    }
    
    public static void main(String[] args) {
        // Creating objects
        Car car1 = new Car();
        car1.car_color = "Red";
        car1.car_brand = "Toyota";
        car1.fuel_type = "Petrol";
        car1.mileage = 15.5;
        
        Car car2 = new Car();
        car2.car_color = "Blue";
        car2.car_brand = "Honda";
        car2.fuel_type = "Diesel";
        car2.mileage = 18.0;
        
        Car car3 = new Car();
        car3.car_color = "Black";
        car3.car_brand = "Ford";
        car3.fuel_type = "Electric";
        car3.mileage = 20.0;
        
        // Calling methods
        car1.start();
        car2.stop();
        car3.service();
    }
}
