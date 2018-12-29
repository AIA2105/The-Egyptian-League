import java.util.Scanner;

public class Main {
    static Scanner  in;


    public static void main(String[] args) {
        Club Zamalek = new Club("Zamalek");
        Club Ahly = new Club("Ahly");
        System.out.println("Welcome to the egyptian league");
        while (true){
            System.out.println("-------------------");
            System.out.println("choose your team");
            System.out.println("1-Zamalek\n2-Ahly");
            System.out.println("-------------------");
             in = new Scanner(System.in);
             Byte option =in.nextByte();
             if(option==1){
                 System.out.println("choose your operation");
                 System.out.println("1-add player\n2-add accountant\n3-add security\n4-add building\n5-add stadium\n6-About club\n7-Exit");
                 System.out.println("-------------------");
                 byte operation = in.nextByte();
                 switch (operation){
                     case 1:
                         System.out.print("Insert player name : ");
                         String pname = in.next();
                         System.out.print("Insert player nationality : ");
                         String pNationality = in.next();
                         System.out.print("Insert player power :");
                         int ppower = in.nextInt();
                         System.out.print("Insert player salary :");
                         int psalary = in.nextInt();
                         System.out.print("Insert player position :");
                         String pposition = in.next();
                         Zamalek.addPlayer(new Player(pname , ppower ,psalary,pposition,pNationality));
                         Zamalek.showPlayers();
                        break;

                     case 2 :
                         System.out.print("Insert accountant name : ");
                         String aname = in.next();
                         System.out.print("Insert accountant salary :");
                         int asalary = in.nextInt();
                         System.out.print("Insert accountant position :");
                         String aposition = in.next();
                         System.out.print("Double-Shift :");
                         boolean adoubleShift = in.nextBoolean();
                         Zamalek.addEmployee(new Accountant(aname,asalary,aposition,adoubleShift));
                         Zamalek.showEmployees();
                         break;
                     case 3 :
                         System.out.print("Insert Security name : ");
                         String sname = in.next();
                         System.out.print("Insert Security salary :");
                         int ssalary = in.nextInt();
                         Zamalek.addEmployee(new Security(sname,ssalary));
                         Zamalek.showEmployees();
                         break;
                     case 4 :
                         System.out.print("Insert Building name : ");
                         String bname = in.next();
                         System.out.print("Insert Building capasity : ");
                         int bcapacity = in.nextInt();
                         System.out.print("Insert Building number of floors : ");
                         int bfloors = in.nextInt();
                         Zamalek.addBuilding(new Building(bname,bcapacity,bfloors));
                         break;
                     case 5 :
                         System.out.print("Insert Stadium name : ");
                         String stname = in.next();
                         System.out.print("Insert stadium capasity : ");
                         int stcapacity = in.nextInt();
                         Zamalek.addStadium(new Stadium(stname,stcapacity));
                         break;
                     case 6:
                         System.out.println(Zamalek.toString()); break;
                     case 7 : System.exit(0); break;
                     default:
                         System.out.println("wrong choice");

                 }

            }
             else if (option==2){
                 System.out.println("choose your operation");
                 System.out.println("1-add player\n2-add accountant\n3-add security\n4-add building\n5-add stadium\n6-About club\n7-Exit");
                 System.out.println("-------------------");
                 byte operation = in.nextByte();
                 switch (operation){
                     case 1:
                         System.out.print("Insert player name : ");
                         String pname = in.next();
                         System.out.print("Insert player nationality : ");
                         String pNationality = in.next();
                         System.out.print("Insert player power :");
                         int ppower = in.nextInt();
                         System.out.print("Insert player salary :");
                         int psalary = in.nextInt();
                         System.out.print("Insert player position :");
                         String pposition = in.next();
                         Ahly.addPlayer(new Player(pname , ppower ,psalary,pposition,pNationality));
                         Ahly.showPlayers();
                         break;

                     case 2 :
                         System.out.print("Insert accountant name : ");
                         String aname = in.next();
                         System.out.print("Insert accountant salary :");
                         int asalary = in.nextInt();
                         System.out.print("Insert accountant position :");
                         String aposition = in.next();
                         System.out.print("Double-Shift :");
                         boolean adoubleShift = in.nextBoolean();
                         Ahly.addEmployee(new Accountant(aname,asalary,aposition,adoubleShift));
                         Ahly.showEmployees();
                         break;
                     case 3 :
                         System.out.print("Insert Security name : ");
                         String sname = in.next();
                         System.out.print("Insert Security salary :");
                         int ssalary = in.nextInt();
                         Ahly.addEmployee(new Security(sname,ssalary));
                         Ahly.showEmployees();
                         break;
                     case 4 :
                         System.out.print("Insert Building name : ");
                         String bname = in.next();
                         System.out.print("Insert Building capasity : ");
                         int bcapacity = in.nextInt();
                         System.out.print("Insert Building number of floors : ");
                         int bfloors = in.nextInt();
                         Ahly.addBuilding(new Building(bname,bcapacity,bfloors));
                         break;
                     case 5 :
                         System.out.print("Insert Stadium name : ");
                         String stname = in.next();
                         System.out.print("Insert stadium capasity : ");
                         int stcapacity = in.nextInt();
                         Ahly.addStadium(new Stadium(stname,stcapacity));
                         break;
                     case 6:
                         System.out.println(Ahly.toString()); break;
                     case 7 : System.exit(0); break;

                     default:
                         System.out.println("wrong choice");



                }
             }
             else{
                 System.out.println("wrong option");
             }

        }
    }
}
