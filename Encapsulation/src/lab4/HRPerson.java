package lab4;

import java.util.Date;

public class HRPerson extends Employee {

    public HRPerson(String firstName, String lastName, String ssn) {
        // Validation performed in the emp. const.
        super(firstName, lastName, ssn);

    }


    // Responsibilities
    // check to make sure employee has met with hr
    public void meetWithNewEmp(Employee newGuy, EmployeeReportService reportService) {
            newGuy.setMetWithHr(true);
            reportService.addData(newGuy.getFirstName() + " " + newGuy.getLastName() + " met with Hr on "
                + newGuy.getFormattedDate() + CRLF);

    }

    public Employee hireNewEmp(String firstName, String lastName, String ssn) {
        return new Employee(firstName, lastName, ssn);
    }


    public void giveNewEmpOrientationDate(Employee newGuy, Date orientationDate) {
        newGuy.setOrientationDate(orientationDate);
    }

    public void doFirstTimeOrientationWithNewEmp(Employee newGuy, String cubeId,
                                       Date currentDate,
                                       EmployeeReportService reportServices) {
        Date orientationDate = newGuy.getOrientationDate();
        giveNewEmployeeCube(newGuy, cubeId);
        conductOrientation(newGuy, orientationDate, currentDate);
        newGuy.doFirstTimeOrientation(newGuy.getCubeId());
        newGuy.setMovedIn(true);
    }

    private void giveNewEmployeeCube(Employee newGuy, String cubeId) {
        newGuy.setCubeId(cubeId);
    }


    private void conductOrientation(Employee newGuy, Date orientationDate,
                                   Date currentDate) {
        if(orientationDate.equals(currentDate)) {
            newGuy.doFirstTimeOrientation(newGuy.getCubeId());
        }
    }
}
