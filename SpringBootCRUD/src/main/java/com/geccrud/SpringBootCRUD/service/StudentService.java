package com.geccrud.SpringBootCRUD.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.geccrud.SpringBootCRUD.dto.StudentDTO;
import com.geccrud.SpringBootCRUD.models.Student;
import com.geccrud.SpringBootCRUD.repository.StudentRepository;

@Service
public class StudentService {
	
	private final StudentRepository studentRepository;
	
	public StudentService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	
	//to get list of students
	public List<Student> getAllStudents() {
		List<Student> students = studentRepository.findAll();
		return students;
	}

	public void saveStudent(StudentDTO studentDTO) {
		Student student = new Student();
		student.setfName(studentDTO.getfName());
		student.setlName(studentDTO.getlName());
		student.setEmail(studentDTO.getEmail());
		student.setPhone(studentDTO.getPhone());
		student.setAddress(studentDTO.getAddress());
		studentRepository.save(student);
	}
	
	public Student getStudent(Long id) {
		Student student = studentRepository.findById(id)
			    .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));

		return student;
		
	}
	
	public void updateStudent(StudentDTO studentDTO, Long id) {
		Student student = studentRepository.findById(id).get();
		student.setfName(student.getfName());
		student.setlName(student.getlName());
		student.setEmail(student.getEmail());
		student.setPhone(student.getPhone());
		student.setAddress(student.getAddress());
		studentRepository.save(student);
	}
}