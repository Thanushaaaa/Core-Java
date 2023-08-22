package com.xworkz.laptop.mouse.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class HospitalDTO implements Serializable {
	private String name;
	private int noOfPatients;
	private String ownerName;
	private String location;

}
