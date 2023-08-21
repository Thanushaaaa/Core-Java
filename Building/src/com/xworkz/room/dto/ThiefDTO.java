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
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ThiefDTO implements Serializable {
	private String specialization;
	private int age;
	private int experience;
	private String gangName;
	private int totalCases;

}
