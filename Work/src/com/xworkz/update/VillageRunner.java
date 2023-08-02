package com.xworkz.update;
import com.xworkz.Token.OldVillage;
import com.xworkz.Manager.NewVillage;
public class VillageRunner {

	public static void main(String[] args) {
		
			OldVillage old=new OldVillage();
			old.enter();
			
			NewVillage newvillage=new NewVillage();
			newvillage.enter();
			newvillage.exit();
			
		}

	}


