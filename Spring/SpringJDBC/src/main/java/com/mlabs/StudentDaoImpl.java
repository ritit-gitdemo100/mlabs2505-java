package com.mlabs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class StudentDaoImpl {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	// Insert a Student Object
	public int saveStudent(Student student) {
		String sql = "INSERT INTO student (id, name, department) VALUES (?, ?, ?)";
		return jdbcTemplate.update(sql, student.getId(), student.getName(), student.getDepartment());
	}

	public List<Student> getAllStudents() {
		String sql = "SELECT * FROM student";
		List<Student> list = jdbcTemplate.query(sql, new StudentMapper());
		return list;
	}

	public int updateStudent(Student student) {
		String sql = "UPDATE student SET name = ?, department = ? WHERE id = ?";
		return jdbcTemplate.update(sql, student.getName(), student.getDepartment(), student.getId());
	}

	public int deleteStudent(int id) {
		String sql = "DELETE FROM student WHERE id = ?";
		return jdbcTemplate.update(sql, id);
	}

	public Student getStudentById(int id) {
		NamedParameterJdbcTemplate namedParam = new NamedParameterJdbcTemplate(jdbcTemplate);
		String sql = "SELECT * FROM student WHERE id = :id";
		Map<String, Object> params = new HashMap<>();
		params.put("id", id);
		Student student = namedParam.queryForObject(sql, params, new StudentMapper());
		return student;
	}

}
