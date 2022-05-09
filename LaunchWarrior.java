package simplej;

 class Warrior extends Thread {
	String res1="Weapon-1";
	String res2="Weapon-2";
	String res3="Weapon-3";
	public void run(){
		try {
			if(Thread.currentThread().getName().equals("RAMA")) {
				ramaRes();
			}
			else {
				ravanaRes();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void ramaRes() throws InterruptedException  {
		// TODO Auto-generated method stub
		synchronized (res1) {
			System.out.println("Rama has "+res1);
			Thread.sleep(5000);
			synchronized (res2) {
				System.out.println("Rama has "+res2);
				Thread.sleep(5000);
				synchronized (res3) {
					System.out.println("Rama has "+res3);
					Thread.sleep(5000);
				}
			}
		}
	}
	
	
	private void ravanaRes() throws InterruptedException {
		// TODO Auto-generated method stub
		synchronized (res1) {
			System.out.println("Ravana has "+res1);
			Thread.sleep(5000);
			synchronized (res2) {
				System.out.println("Ravana has "+res2);
				Thread.sleep(5000);
				synchronized (res3) {
					System.out.println("Ravana has "+res3);
					Thread.sleep(5000);
				}
			}
		}
	}
}

public class LaunchWarrior {
 public static void main(String[] args) {
	Warrior w1=new Warrior();
	Warrior w2=new Warrior();
	
	w1.setName("RAMA");
    w2.setName("RAVANA");
	
	w1.start();
	w2.start();
}
}
