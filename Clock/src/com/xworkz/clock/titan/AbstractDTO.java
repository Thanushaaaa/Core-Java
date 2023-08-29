package com.xworkz.clock.titan;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

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
@ToString
@EqualsAndHashCode
public class AbstractDTO implements Serializable{
	private LocalDate whenCreated;
	private String whoCreated;
	private LocalDate whenUpdated;
	private String whoUpdated;
	private LocalDateTime updatedTime;

}
