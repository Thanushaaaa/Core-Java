package com.xworkz.room.dto;

import java.io.Serializable;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class CeoDTO implements Serializable{
	private String name;
	private String companyName;
	long salary;
	int experience;

}
