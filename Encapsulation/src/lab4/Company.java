package lab4;

import lab4.solution.HrPerson;

public class Company {
    private HRPerson hRDept;
    private Employee newGuy;

    public Company() {
        hRDept = new HRPerson("Dan", "Hrman",
                "123548954");
    }

    public void hireNewEmp(String firstName, String lastName, String ssn) {
        newGuy = hRDept.hireNewEmp(firstName, lastName, ssn);
        newGuy.outputReport();


    }

    public HRPerson getHR() {return hRDept;}

    public void setHR(HRPerson hr) {this.hRDept = hr;}
}
