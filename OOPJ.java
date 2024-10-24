package com.mycompany.oopj;
class MultiThreadingOne extends Thread{
        public void run(){
                try{
                      System.out.println("Thread"+Thread.currentThread().getId()+"is running");
                }
  		    catch(Exception e){
                       System.out.println("exception is caught");
                }
	  }
}
                 
public class OOPJ {
	public static void main(String[] args) {
		for(int i=0;i<8;i++) {
			MultiThreadingOne mt1=new MultiThreadingOne();
                        mt1.start();
                
		}

	}

}
