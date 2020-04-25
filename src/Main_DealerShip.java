public class Main_DealerShip {
    public static void main(String args []){

        Coustomer customer = new Coustomer("Nitsuh","sumit",11500);

        Employee emp = new Employee("Nati",7889);

        Car car = new Car("Toyota","dolphin",10500);

        customer.purchaseCar(emp,car,false);

    }
}
