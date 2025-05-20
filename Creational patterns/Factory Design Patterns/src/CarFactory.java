//Factory
public class CarFactory {

    public Car createCar(CarType carType){
       return switch (carType){
           case AUDI -> new Audi();
           case GTR -> new Gtr();
           case MUSTANG -> new Mustang();
           case LAMBO -> new Lambo();

        };
    }

}
