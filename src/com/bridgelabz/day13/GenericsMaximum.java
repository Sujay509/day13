package com.bridgelabz.day13;

public class GenericsMaximum {

	
		 public static Integer findMaxInteger(Integer num1, Integer num2, Integer num3){
		        Integer max = num1;
		        if (num2.compareTo(max) >= 0)
		            max = num2;
		        if (num3.compareTo(max) >= 0)
		            max = num3;

		        return  max;
		    }
		    /*
		     * This method used to compare three float values and get the maximum value
		     
		     * */
		    public static Float findMaxFloat(Float num1, Float num2, Float num3){
		        Float max = num1;
		        if (num2.compareTo(max) >= 0)
		            max = num2;
		        if (num3.compareTo(max) >= 0)
		            max = num3;

		        return  max;
		    }
		    public static void main(String[] args) {
		        System.out.println("Find Maximum Problem using Generics");
		       
		        System.out.println("The maximum value between the three integer is : " + findMaxInteger(13, 8, 15));

		        System.out.println("The maximum value between the three float is : " + findMaxFloat(2.5f, 4.5f, 0.5f));
		    }
	}


