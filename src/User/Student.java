package User;


public class Student extends User {
    private String university;
    private String department;

    public Student(String university, String department, String name, String surname, int age, String gender,String password) {
        super(name, surname, age, gender,password);
        this.university = university;
        this.department = department;
    }

    @Override
    public String toString() {
        return "***Student*** \n\nName: " + getName() + "\nSurname: " + getSurname() + "\nAge: " + getAge() + "\nGender: " + getGender()+  "\nUnivercity: " + university + "\nDepartment: " + department ;
    }
            
    /**
     * @return the univercity
     */
    public String getUniversity() {
        return university;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }
    
}
