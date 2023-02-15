package com.java.book;

import com.java.inheritance.OnionRagiRoti;
import com.java.inheritance.RagiRoti;
import com.java.inheritance.Roti;
import com.java.inheritance.ButterRoti;
import com.java.inheritance.OnionMasalaRagiRoti;

public class RotiRunner {

	public static void main(String[] args) {
		// Roti roti = new Roti();
		// String shape = roti.getShape();// roti.getShape("Round");this is possible
		// when v declar in methods
		// like (String shape);
		// System.out.println("shape:" + shape);//

		OnionMasalaRagiRoti omrr = new OnionMasalaRagiRoti();
		String shape1 = omrr.getShape();
		System.out.println("shape1:" + shape1);
		String calories1 = omrr.getCalories();
		System.out.println("calories1:" + calories1);
		double weight1 = omrr.getWeight();
		System.out.println("weight1:" + weight1);
		double thickNess1 = omrr.getThickNess();
		System.out.println("thickNess:" + thickNess1);

		OnionRagiRoti orr1 = new OnionMasalaRagiRoti();
		String shape2 = orr1.getShape();
		System.out.println("shape2:" + shape2);
		String calories2 = orr1.getCalories();
		System.out.println("calories2:" + calories2);
		double weight2 = orr1.getWeight();
		System.out.println("weight2:" + weight2);
		if (orr1 instanceof OnionMasalaRagiRoti) {
			OnionMasalaRagiRoti onionMasalaRagiRoti = (OnionMasalaRagiRoti) orr1;
			double thickNess2 = onionMasalaRagiRoti.getThickNess();
			System.out.println("ThickNess:" + thickNess2);
		} else {
			System.err.println("orr1 is not pointing OnionRagiRoti");
		}

		System.out.println("==========");

		RagiRoti rr1 = new OnionMasalaRagiRoti();
		String shape3 = rr1.getShape();
		System.out.println("shape:" + shape3);
		String calories3 = rr1.getCalories();
		System.out.println("calories:" + calories3);
		if (rr1 instanceof OnionMasalaRagiRoti) {
			OnionMasalaRagiRoti onionMasalaRagiRoti2 = (OnionMasalaRagiRoti) rr1;
			double weight3 = onionMasalaRagiRoti2.getWeight();
			double thickNess3 = onionMasalaRagiRoti2.getThickNess();
			System.out.println("weight:" + weight3);
			System.out.println("thickNess:" + thickNess3);
		} else {
			System.err.println("weight and thickNess is not pointing RagiRoti");
		}
		System.out.println("===========");

		Roti r1 = new OnionMasalaRagiRoti();
		String shape4 = r1.getShape();
		System.out.println(shape4);
		if (r1 instanceof OnionMasalaRagiRoti) {
			OnionMasalaRagiRoti onionMasalaRagiRoti3 = (OnionMasalaRagiRoti) r1;
			String calories4 = onionMasalaRagiRoti3.getCalories();
			System.out.println("calories:" + calories4);
			double weight4 = onionMasalaRagiRoti3.getWeight();
			System.out.println("weight:" + weight4);
			double thickNess4 = onionMasalaRagiRoti3.getThickNess();
			System.out.println("thickNess:" + thickNess4);
		} else {
			System.err.println("calories ,weight,thickNess is not pointing Roti");
		}
		
		
		System.out.println("             ");
		
		
		OnionRagiRoti orr2=new OnionRagiRoti();
		String shape0=orr2.getShape();
		System.out.println("shape:"+shape0);
		String calories0=orr2.getCalories();
		System.out.println("calories:"+calories0);
		double weight0=orr2.getWeight();
		System.out.println("weight:"+weight0);
		
		RagiRoti rr2=new OnionRagiRoti();
		String shape11=rr2.getShape();
		System.out.println("shape:"+shape11);
		String calories11=rr2.getCalories();
		System.out.println("calories:"+calories11);
		if(rr2 instanceof OnionRagiRoti) {
			OnionRagiRoti onionRagiRoti=(OnionRagiRoti) rr2;
			double weight22=onionRagiRoti.getWeight();
		}else {
			System.err.println("weight is not pointing to RagoRoti");
		}
         System.out.println("=============");
         
         Roti r2=new OnionRagiRoti();
         String shape33=r2.getShape();
         if(r2 instanceof OnionRagiRoti) {
        	 OnionRagiRoti onionRagiRoti1=(OnionRagiRoti) r2;
        	 String calories33=onionRagiRoti1.getCalories();
        	 System.out.println("calories:"+calories33);
        	 double weight33=onionRagiRoti1.getWeight();
        	 System.out.println("weight:"+weight33);
         }else {
        	 System.err.println("calories,weight is not pointing");
         }
         System.out.println("          ");
         
         RagiRoti rr3=new RagiRoti();
         String shape44=rr3.getShape();
 		System.out.println("shape:"+shape44);
 		String calories44=rr3.getCalories();
 		System.out.println("calories:"+calories44);
         
         
	}
}
