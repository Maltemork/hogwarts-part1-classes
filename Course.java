public class Course {
    private Subject subject;
    private Teacher teacher;
    private Student[] students;
    private TeachingMaterial[] materials;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public TeachingMaterial[] getMaterials() {
        return materials;
    }
}
