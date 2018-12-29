public class Player extends Employee {

    private int power;
    private String nationality;

    public Player(String name, int power, int salary,String position, String nationality) {
       super(name,salary,position);
       this.nationality=nationality;
        this.power = power;

    }


    public int getPower() {
        return power;
    }
    public String getNationality(){return nationality;}

    @Override
    public String toString() {
        String str = this.getName()+": - Salary = "+this.getSalary()+" Power = "+this.getPower()+" Nationality : "+this.getNationality()+" position: "+this.getPosition();
        return str;
    }
}
