public interface IStudentDao {

    public student findAll();
    public int addStudent(student stu);
    public int updateStudent(student stu);
    public int delStudent(int id);
}
