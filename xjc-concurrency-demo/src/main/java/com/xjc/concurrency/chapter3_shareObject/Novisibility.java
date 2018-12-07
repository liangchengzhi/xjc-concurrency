package com.xjc.concurrency.chapter3_shareObject;
/**
 * 线程可见性
 * @author liangcz
 *
 */
public class Novisibility {
	private static boolean ready;
	private static int number;
	public static class ReaderThread extends Thread{
		public void run(){
			while(!ready){
				Thread.yield();
			}
			System.out.println(ready);
			System.out.println(number);
		}
	}
	
	public static void main(String[] args) {
		new ReaderThread().start();
		number = 42;
		ready = true;
	
	}
}
