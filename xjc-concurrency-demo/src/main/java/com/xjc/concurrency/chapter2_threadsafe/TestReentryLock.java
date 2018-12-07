package com.xjc.concurrency.chapter2_threadsafe;

public class TestReentryLock {
	static class Widget{
		public synchronized void doSomething(){
			System.out.println("Widget doSomething");
		}
	}
	static class LoggingWidget extends Widget{
		public synchronized void doSomething(){
			System.out.println(toString() + ": calling doSomething");
			super.doSomething();
		}
	}
	
	
	public static void main(String[] args) {
		new LoggingWidget().doSomething();
	}
}
