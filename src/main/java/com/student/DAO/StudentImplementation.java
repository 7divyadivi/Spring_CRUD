package com.student.DAO;
import com.student.RowMapper.StudentRowMapper;
import com.student.api.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
@Repository
public class StudentImplementation implements StudentDAO{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Student> loadStudents()
    {
        List<Student> studentList = new ArrayList<Student>();
        String sql = "SELECT * FROM cei.students WHERE is_active=true";
        List<Student> query = jdbcTemplate.query(sql, new StudentRowMapper());
        return query;
    }
    @Override
    public void  saveStudent(Student student) {
        Object[]  sqlParameters={student.getName(),student.getAge(),student.getGender(),student.getFathersName(),true};
        String sql = "insert into students(name,age,gender,fathers_name,is_active) values(?,?,?,?,?)";
        jdbcTemplate.update(sql, sqlParameters);
    }

    @Override
    public Student getStudent(int id) {
        String sql="SELECT * FROM students WHERE id=?";
        Student student = jdbcTemplate.queryForObject(sql,new StudentRowMapper(),id);
        return student;
    }

    @Override
    public void update(Student student) {
        String sql="UPDATE students SET name =?, age=?, gender=?,fathers_name=? WHERE id=? ";
        jdbcTemplate.update(sql,student.getName(),student.getAge(),student.getGender(),student.getFathersName(),student.getId());
    }

    @Override
    public void deleteStudent(int id) {
        String sql="UPDATE students SET is_active=false WHERE id=? ";
        jdbcTemplate.update(sql,id);
    }
}