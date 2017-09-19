package com.scp.singleton;

public class SingleTon {
	    private static  SingleTon myObj;
	      static{
	        myObj = new SingleTon();
	    }
	     private  SingleTon(){
	     }
	     public static  SingleTon getInstance(){
	        return myObj;
	    }
	     public void testMe(){
	        System.out.println("Hey.... it is working!!!");
	    }
	     public static void main(String a[]){
	    	 SingleTon ms = getInstance();
	        ms.testMe();
	    }
	}





	
