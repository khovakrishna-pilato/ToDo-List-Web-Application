package net.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "list")
public class List {	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String content;
}
