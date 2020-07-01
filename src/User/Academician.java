package User;


public class Academician extends User {
   private String workingUni;
   private int graduationYear;

    public Academician(String workingUni, int graduationYear, String name, String surname, int age, String gender,String password) {
        super(name, surname, age, gender,password);
        this.workingUni = workingUni;
        this.graduationYear = graduationYear;
    }

    @Override
    public String toString() {
          return "***Academician***" +"\n\nName: " + getName() + "\nSurname: " + getSurname() + "\nAge: " + getAge() + "\nGender: " + getGender() + "\nWorking Univercity: " + workingUni + "\nGraduation Year: " + graduationYear;
    }

   
    /**
     * @return the workingUni
     */
    public String getWorkingUni() {
        return workingUni;
    }

    /**
     * @return the graduationYear
     */
    public int getGraduationYear() {
        return graduationYear;
    }

    

   

    
   
}
