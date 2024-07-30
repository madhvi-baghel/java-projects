package com.jspiders.hibernatetask.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class EmployeeDTO {
	@Id
	private int empno;
	private String ename;
	private String email;
	private long contact;
	private String loc;

}
