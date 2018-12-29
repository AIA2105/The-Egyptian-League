public class Accountant extends Employee {
    private boolean doubleShift;

    public Accountant(String name, int salary, String position, boolean doubleShift) {
        super(name, salary, position);
        this.doubleShift = doubleShift;
    }

    public boolean isDoubleShift() {
        return doubleShift;
    }

    @Override
    public String toString() {
       return "Employee{" +
               "name='" + this.getName()+ '\'' +
               ", salary=" + this.getSalary() +
               ", position='" + this.getPosition() + '\'' +
               "  double shift "+this.doubleShift;

    }
}
