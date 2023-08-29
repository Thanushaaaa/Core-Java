package com.xworkz.laptop.mouse.util;

import java.io.Serializable;

import com.xworkz.clock.titan.AbstractDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString(callSuper=true)
public class HospitalDTO extends AbstractDTO implements Serializable{
	private int age=10;
	

}
