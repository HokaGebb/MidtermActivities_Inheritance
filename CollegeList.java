import java.util.*;

public class CollegeList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Press E for Employee, F for Faculty, or S for Students: ");
        String choice = input.nextLine();

        if(choice.equalsIgnoreCase("E")){
            Employee emp = new Employee();
            System.out.println("Please Type Employee's Name, Contact number, salary, and department.");
            System.out.println("Press Enter after every input.");
            String n = input.nextLine();
            emp.setName(n);
            String c = input.nextLine();
            emp.setContactNum(c);
            double s = input.nextDouble();
            emp.setSalary(s);
            String d = input.next();
            emp.setDepartment(d);

            System.out.println("---------------------------");
            System.out.println("Name: "+ emp.getName());
            System.out.println("Contact Number: "+ emp.getContactNum());
            System.out.println("Salary: "+ emp.getSalary());
            System.out.println("Department: "+ emp.getDepartment());
        }
        else if(choice.equalsIgnoreCase("F")) {
            Faculty fac = new Faculty();
            boolean status;
            String regular;
            System.out.println("Please Type Employee's Name, Contact number, salary, and department.");
            System.out.println("Press Enter after every input.");
            String n = input.nextLine();
            fac.setName(n);
            String c = input.nextLine();
            fac.setContactNum(c);
            double s = input.nextDouble();
            fac.setSalary(s);
            String d = input.next();
            fac.setDepartment(d);

            System.out.println("Please Press Y if the User is Regular/Tenured or N if Not");
            String yn = input.next();
            if (yn.equalsIgnoreCase("Y")){
                status = true;
                System.out.println("---------------------------");
                System.out.println("Name: "+ fac.getName());
                System.out.println("Contact Number: "+ fac.getContactNum());
                System.out.println("Salary: "+ fac.getSalary());
                System.out.println("Department: "+ fac.getDepartment());
                System.out.println((regular = "He/She is Regular/Tenured"));

            } else if (yn.equalsIgnoreCase("N")) {
                status = false;
                System.out.println("---------------------------");
                System.out.println("Name: "+ fac.getName());
                System.out.println("Contact Number: "+ fac.getContactNum());
                System.out.println("Salary: "+ fac.getSalary());
                System.out.println("Department: "+ fac.getDepartment());
                System.out.println((regular = "He/She is a Part Time Job"));
            }else {
                System.out.println("Please Input the Choices Properly!!! TRY AGAIN!!!");
                System.exit(0);
            }

        }
        else if(choice.equalsIgnoreCase("S")) {
            Student stud = new Student();
            System.out.println("Please Type Student's Name, Contact number, program, and year level.");
            System.out.println("Press Enter after every input.");
            String n = input.next();
            stud.setName(n);
            String c = input.next();
            stud.setContactNum(c);
            String p = input.next();
            stud.setProgram(p);
            int y = input.nextInt();
            stud.setYearLevel(y);

            if (y == 1 || y == 2 || y == 3 || y == 4) {
                System.out.println("---------------------------");
                System.out.println("Name: " + stud.getName());
                System.out.println("Contact Number: " + stud.getContactNum());
                System.out.println("Program: " + stud.getProgram());
                System.out.println("Department: " + stud.getYearLevel());
            }else{
                System.out.println("Invalid Year Level!!! Please Try Again!!!");
            }
        }else{
            System.out.println("Please Input the Choices Properly!!! TRY AGAIN!!!");
            System.exit(0);
        }
    }
}
