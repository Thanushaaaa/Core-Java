package com.Xworkz.Task;

public class Movie {
	String name;
	int duration;
	String heroName;
	String musicDirectorName;
	Director director=new Director("Thomas",34,5,45);
	Movie()
	{
		System.out.println("movie");
	}
	Movie(String name,int duration,String heroName,String musicDirectorName)
	{
		this.name=name;
		this.duration=duration;
		this.heroName=heroName;
		this.musicDirectorName=musicDirectorName;
	}
	void movieInfo()
	{
		System.out.println(name);
		System.out.println(duration);
		System.out.println(heroName);
		System.out.println(musicDirectorName);
		this.director.direct();
	}

}
