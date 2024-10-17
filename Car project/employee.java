import java.util.*;;

public class employee extends showroom implements utility {
    String emp_id;
    String emp_name;
    int emp_age;
    String emp_department;



    @Override
    public void get_details(){
        System.out.println("ID : "+ emp_id);
        System.out.println("Name ; "+ emp_name);
        System.out.println("Age : "+ emp_age);
        System.out.println("Departmet : "+ emp_department);
        System.out.println("Showroom Name :  "+ Showroom_name);
    }

    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        emp_id =String.valueOf(uuid);
        System.out.println("------------------------***Enter Detail of Employee***----------------------");
        System.out.println();
        System.out.println("Employee Name : ");
        emp_name = sc.nextLine();
        System.out.println("Employee Age : ");
        emp_age = sc.nextInt();
        System.out.println("Department of Employee : ");
        emp_department = sc.nextLine();
        System.out.println("Showroom Name : ");
        Showroom_name = sc.nextLine();
    }
}
