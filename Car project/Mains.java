import java.util.*;


interface utility{
    public void get_details();
    public void set_details();
}



public class Mains{
    static void main_menu(){
        System.out.println();
        System.out.println("------------------------***Welcome to Car Management System***----------------------");
        System.out.println();
        System.out.println();
        System.out.println("------------------------***Enter your Preferance***----------------------");
        System.out.println();
        System.out.println("1]Add Showroom \t\t\t 2]Add Employees \t\t\t 3]Add Cars");
        System.out.println();
        System.out.println("4]Get Showroom \t\t\t 5]Get Employee \t\t\t 6]Get Cars");
        System.out.println();
        System.out.println("------------------------***Enter 0 to Exit***----------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        showroom Showroom[] = new showroom[5];
        employee Employees[] = new employee[5];
        cars Car[] = new cars[5];
        int Showroom_counter = 0;
        int Employee_counter = 0;
        int car_counter = 0;
        int choice = 100;
        while(choice != 0){
            main_menu();
            choice = sc.nextInt();


            while (choice != 9 && choice !=0) {
                switch(choice){
                    case 1:
                    Showroom[Showroom_counter] = new showroom();
                    Showroom[Showroom_counter].set_details();
                    Showroom_counter++;
                    System.out.println("1]Add Showroom");
                    System.out.println("9]Go Back to Main Menu");
                    choice = sc.nextInt();
                    break;
                
                    case 2:
                    Employees[Employee_counter] = new employee();
                    Employees[Employee_counter].set_details();
                    Employee_counter++;
                    System.out.println("2]Add Employee");
                    System.out.println("9]Go Back to Main Menu");
                    choice = sc.nextInt();
                    break;

                    case 3:
                    Car[car_counter] = new cars();
                    Car[car_counter].set_details();
                    car_counter++;
                    System.out.println("3]Add Cars");
                    System.out.println("9]Go Back to Main Menu");
                    choice = sc.nextInt();
                    break;
                    
                    case 4:
                        for(int i = 0; i < Showroom_counter;i++){
                            Showroom[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9]Go Back to Main Menu");
                        System.out.println("0]Exit");
                        choice = sc.nextInt();
                        break;
                        
                        case 5:
                        for(int i = 0; i < Employee_counter;i++){
                            Employees[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9]Go Back to Main Menu");
                        System.out.println("0]Exit");
                        choice = sc.nextInt();
                        break;

                        case 6:
                        for(int i = 0; i < car_counter;i++){
                            Car[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9]Go Back to Main Menu");
                        System.out.println("0]Exit");
                        choice = sc.nextInt();
                        break;

                        default:
                            System.out.println("Enter Valid Choice");
                            break;
                }
                

            }
        }
    }
}