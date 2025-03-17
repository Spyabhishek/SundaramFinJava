package com.generics;

import java.util.ArrayList;

class Vaccine{
	private int age;
	private float dosage;


public Vaccine(int age) {
	this.age=age;
	this.dosage=0;
	
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public float getDosage() {
	return dosage;	
}

public void setDosage(float dosage) {
	this.dosage = dosage;
}
}

class VaccinationCamp{
	ArrayList<Vaccine> list = new ArrayList<>();
	public void assignVaccine() {
     
        for (Vaccine l : list) {
            int age = l.getAge();
            if (age >= 45) {
                l.setDosage(250);
            } else if (age >= 20) {
                l.setDosage(200);
            } else {
                l.setDosage(100);
            }
        }
    }
	public float vaccineInjected() {
		float totalDosage = 0;
		for (Vaccine v: list) {
			totalDosage += v.getDosage();
		}
		return totalDosage;
	}
}

public class Vaccinated {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VaccinationCamp vc = new VaccinationCamp();
		vc.list.add(new Vaccine(49));
		vc.list.add(new Vaccine(26));
		vc.list.add(new Vaccine(19));
		
		vc.assignVaccine();
		
		System.out.println(vc.vaccineInjected());

	}

}
