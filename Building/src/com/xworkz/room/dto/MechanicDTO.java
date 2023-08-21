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
public class MechanicDTO implements Serializable{
	private String garageName;
	private String specialization;
	private int bikeServiceCharge;
	private String gstNo;

}
