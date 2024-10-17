import java.util.*;


public class showroom implements utility {
    String Showroom_name;
    String Showroom_Address;
    int Total_Employees;
    int Total_Cars_in_Stock;
    String Manager_name;

    @Override
    public void get_details(){
        System.out.println("Showroom Name " + Showroom_name);
        System.out.println("Showroom Address "+ Showroom_Address);
        System.out.println("Manager name "+ Manager_name);
        System.out.println("Total Employee "+ Total_Employees);
        System.out.println("Total cars in stock "+ Total_Cars_in_Stock);
    
    
    }
    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------***Enter Showroom Details***----------------------");
        System.out.println();
        System.out.println("Showroom Name : ");
        Showroom_name = sc.nextLine();
        System.out.println("Showroom Address : ");
        Showroom_Address = sc.nextLine();
        System.out.println("Manager name : ");
        Manager_name = sc.nextLine();
        System.out.println("Total no of Employees : ");
        Total_Employees = sc.nextInt();
        System.out.println("Total Cars in Stock : ");
        Total_Cars_in_Stock = sc.nextInt();



    }

}
