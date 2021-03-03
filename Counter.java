
public class Counter implements Runnable {

	CPSCounter main;
	
	public Counter(CPSCounter main) {
		this.main = main;
	}
	
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			main.update();
		}
	}
}
