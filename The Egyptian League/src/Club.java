public class Club {
    //creating a club's fields
    private String name;
    private Player[] players;
    private Building[] buildings;
    private Employee[] employees;
    private Stadium[] stadiums;
    private int playersNo;
    private int buildingsNo;
    private int employeesNo;
    private int stadiumsNo;
    // creating a club constructor having only The club name as a parameter
    public Club(String name) {
        this.name = name;
        playersNo = 0;
        buildingsNo = 0;
        employeesNo = 0;
        stadiumsNo = 0;
        //initialize the arrays
        players = new Player[30];
        buildings = new Building[10];
        employees = new Employee[500];
        stadiums = new Stadium[10];
    }
    // a method to add player to the club
    public void addPlayer(Player player){
        players[playersNo] = player;
        playersNo++;
    }
    // method to add employee to the club
    public void addEmployee(Employee employee){
        employees[employeesNo] = employee;
        employeesNo++;
    }
    //method to add building to the club's array of buildings
    public void addBuilding(Building building){
        buildings[buildingsNo] = building;
        buildingsNo++;
    }
    // method to add stadium to the club
    public void addStadium(Stadium stadium){
        stadiums[stadiumsNo] = stadium;
        stadiumsNo++;
    }


    public String getName() {
        return name;
    }

    public int getPlayersNo() {
        return playersNo;
    }

    public int getBuildingsNo() {
        return buildingsNo;
    }

    public int getEmployeesNo() {
        return employeesNo;
    }

    public int getStadiumsNo() {
        return stadiumsNo;
    }

    public void showPlayers(){
        try {
            System.out.println("-------------------");
            for (int i = 0; i < this.players.length; i++) {
                System.out.println(this.players[i].toString());
            }
        }
        catch (Exception e){

        }
    }
    public void showEmployees(){
        try {
            System.out.println("-------------------");
            for (int i = 0; i < this.employees.length; i++) {
                System.out.println(this.employees[i].toString());
            }
        }
        catch (Exception e){

        }
    }
    public void showbulidings(){
        try {
            System.out.println("-------------------");
            for (int i = 0; i < this.buildings.length; i++) {
                System.out.println(this.buildings[i].toString());
            }
        }
        catch (Exception e){

        }
    }
    public void showStadiums(){
        try {
            System.out.println("-------------------");
            for (int i = 0; i < this.stadiums.length; i++) {
                System.out.println(this.stadiums[i].toString());
            }
        }
        catch (Exception e){

        }
    }
    @Override
    public String toString() {

        String str = "Welcome to "+this.name+" Club!\n this club has : "+playersNo+
                " Players \n"+employeesNo+" employees\n"
                +buildingsNo+" Building\n"
                +stadiumsNo+" Stadium";
        return str;
    }

}
