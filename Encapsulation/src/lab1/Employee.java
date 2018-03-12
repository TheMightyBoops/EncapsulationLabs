package lab1;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Fix the code in this class to do PROPERTY encapsulation correctly. Also
 * consider if any of the properties should be mandatory and use a 
 * constructor to enforce that. Review the tips in the document 
 * "EncapCheckList.pdf" if needed.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.02
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    private Date orientationDate;

    public Employee(String firstName, String lastName, String ssn,
                    boolean metWithHr, boolean metDeptStaff, boolean reviewedDeptPolicies,
                    boolean movedIn, String cubeId, Date orientationDate) {
        if(firstName == null || firstName.length() < 2 ||
                firstName.charAt(0) == getFirstName().toUpperCase().charAt(0)) {
            System.exit(1);
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.metWithHr = metWithHr;
        this.metDeptStaff = metDeptStaff;
        this.reviewedDeptPolicies = reviewedDeptPolicies;
        this.movedIn = movedIn;
        this.cubeId = cubeId;
        this.orientationDate = orientationDate;
    }

    private void validation() {

    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        Pattern pattern = Pattern.compile("^\\d{3}-?\\d{2}-?\\d{4}$|^XXX-XX-XXXX$");
        Matcher m = pattern.matcher(ssn);
        if(!m.matches()){
            throw new IllegalArgumentException("sorry, bad ssn");
        }
        this.ssn = ssn;
    }

    public boolean isMetWithHr() {
        return metWithHr;
    }

    public void setMetWithHr(boolean metWithHr) {
        this.metWithHr = metWithHr;
    }

    public boolean isMetDeptStaff() {
        return metDeptStaff;
    }

    public void setMetDeptStaff(boolean metDeptStaff) {
        this.metDeptStaff = metDeptStaff;
    }

    public boolean isReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }

    public void setReviewedDeptPolicies(boolean reviewedDeptPolicies) {
        this.reviewedDeptPolicies = reviewedDeptPolicies;
    }

    public boolean isMovedIn() {
        return movedIn;
    }

    public void setMovedIn(boolean movedIn) {
        this.movedIn = movedIn;
    }

    public String getCubeId() {
        return cubeId;
    }

    public void setCubeId(String cubeId) {
        this.cubeId = cubeId;
    }

    public Date getOrientationDate() {
        return orientationDate;
    }

    public void setOrientationDate(Date orientationDate) {
        this.orientationDate = orientationDate;
    }
}
