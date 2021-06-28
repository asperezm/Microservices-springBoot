package com.example.customerservice.repository.entity;

import java.io.Serializable;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tbl_regions")
public class Region implements Serializable{
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
}
