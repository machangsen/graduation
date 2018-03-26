package cn.lynu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.lynu.mapper.TeacherMapper;
import cn.lynu.model.Teacher;

@Service
public class TeacherService {
	
	@Autowired
	private TeacherMapper teacherMapper;
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public List<Teacher> getSubTeacher(){
		return teacherMapper.getAllTeacher();
	}

}