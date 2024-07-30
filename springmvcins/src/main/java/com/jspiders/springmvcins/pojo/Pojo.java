package com.jspiders.springmvcins.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.jspiders.springmvcins.pojo.Pojo;

import lombok.Data;

@Entity
@Data
@Table(name = "per_name")
public class Pojo {
	
	
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "per_id")
	private int id;
	@Id
	@Column(name = "per_name")
	private String name;
	

}
