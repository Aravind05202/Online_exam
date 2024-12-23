package com.example.onlineclass.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@Table(name= "class_info")
@NoArgsConstructor
@AllArgsConstructor
public class ClassInfo {
	
	@Id
	@Column(name= "pk_class_id")
	@GeneratedValue
	private String id;
	
	public String getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	
	@Column(name= "class_name")
	private String name;
}