package com.student.RowMapper;

import com.student.api.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student> {
    public Student mapRow(ResultSet rs,int rowNum) throws SQLException
    {
        Student student = new Student();
        student.setId(rs.getInt("students.Id"));
        student.setName(rs.getString("students.Name"));
        student.setAge(rs.getInt("students.Age"));
        student.setGender(rs.getString("students.Gender"));
        student.setFathersName(rs.getString("students.fathers_name"));
        return student;
    }
}
