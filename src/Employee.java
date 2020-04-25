public class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void validateCustomer(Coustomer coustomer, Car car, boolean finance) {
        double checkCraditCart = coustomer.getCashOnHand();
        if (finance){
            cardHistory(coustomer,finance,checkCraditCart);
        }else if(coustomer.getCashOnHand() >= car.getPrice()){
            customerValidated(car);
        }else {
            System.out.println("Insafisunt Balance");
        }

    }

    private void customerValidated(Car car) {
        System.out.println("Coustomer Has bought the car" + car.getMake() + car.getModel());
    }

    private void cardHistory(Coustomer coustomer ,boolean finance, double checkCraditCart) {
        System.out.println(" The coustomer  :" + coustomer.getName() + " have been approved ");
    }
}
