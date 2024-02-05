public class Student extends Person {

  private int schoolYear;

  public void setSchoolYear(int schoolYear) {
    this.schoolYear = schoolYear;
  }

  public int getSchoolYear() {
    return schoolYear;
  }

  public Student(String fullName) {
    setFullName(fullName);
  }

  public Student(
    int schoolYear,
    String firstName,
    String middleName,
    String lastName
  ) {
    super(firstName, middleName, lastName, 0);
    this.schoolYear = schoolYear;
  }
}
