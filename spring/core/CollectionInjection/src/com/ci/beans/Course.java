package com.ci.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Course {
	private List<String> subjects;
	private Set<String> faculties;
	private Map<String, String> subjectFaculty;
	private Properties yearToppers;

	public Course(Set<String> faculties) {
		this.faculties = faculties;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public Set<String> getFaculties() {
		return faculties;
	}

	public Map<String, String> getSubjectFaculty() {
		return subjectFaculty;
	}

	public Properties getYearToppers() {
		return yearToppers;
	}

	public void setSubjectFaculty(Map<String, String> subjectFaculty) {
		this.subjectFaculty = subjectFaculty;
	}

	public void setYearToppers(Properties yearToppers) {
		this.yearToppers = yearToppers;
	}

	@Override
	public String toString() {
		return "Course [subjects=" + subjects + ", faculties=" + faculties + ", subjectFaculty=" + subjectFaculty
				+ ", yearToppers=" + yearToppers + "]";
	}

}
