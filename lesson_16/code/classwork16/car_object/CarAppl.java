package classwork16.car_object;

import classwork16.car_object.model.Car;

public class CarAppl {

    public static void main(String[] args) {

        Car myCar = new Car("VW", 2014, 15000, "silver", false);//create object with real date

        //можно распечатать двумя способами или 1, или 2
        System.out.println(myCar.display());//1
        System.out.println(myCar);//2

        myCar.move();
        myCar.stop();

    }
}
