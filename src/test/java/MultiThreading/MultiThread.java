package MultiThreading;

import Chrome.chrome;

class MultiThread extends Thread {
	public void run() {

		System.out.println("Thread" + " " + Thread.currentThread().getId() + " " + "Is running");
	}
}

class launchbrowser extends Thread {
	public void run() {
		for (int i = 0; i <= 8; i++) {
			chrome ch = new chrome();
			ch.test("https://www.google.com");
		}
	}

	public class threadloop {

		public void main(String[] args) {
			int n = 8;

			for (int i = 0; i <= n; i++) {
				MultiThread MI = new MultiThread();
				MI.start();
			}

		}

	}

}
