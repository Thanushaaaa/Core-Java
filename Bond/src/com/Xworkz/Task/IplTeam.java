package com.Xworkz.Task;

public class IplTeam {
	String teamName;
	String captain;
	int captainAge;
	int captainHeight;
	Franchise franchise=new Franchise("India cements","chennai",8765567,2001);
	IplTeam()
	{
	System.out.println("Ipl2023");
	}
	IplTeam(String teamName,String captain,int captainAge,int captainHeight)
	{
		this.teamName=teamName;
		this.captain=captain;
		this.captainAge=captainAge;
		this.captainHeight=captainHeight;
		
	}
	void iplInfo()
	{
		System.out.println(teamName);
		System.out.println(captain);
		System.out.println(captainAge);
		System.out.println(captainHeight);
		this.franchise.play();
	}
}
