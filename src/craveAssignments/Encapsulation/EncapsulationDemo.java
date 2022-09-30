package craveAssignments.Encapsulation;

public class EncapsulationDemo {

    public static void main(String [] args)
    {

        Emp e1 = new Emp();
        //e1.empId = 5;
        e1.setEmpId(5);
        //e1.empName = "Vasant";
        e1.setEmpName("Vasant");

        Emp e2 = new Emp();
        //e2.empId = 10;
        e2.setEmpId(10);
        //e2.empName = "Mohnish";
        e2.setEmpName("Mohnish");

        System.out.println(e1.getEmpId());
        System.out.println(e1.getEmpName());

        System.out.println(e2.getEmpId());
        System.out.println(e2.getEmpName());
    }
}

class Emp
{
    private int empId;
    private String empName;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}