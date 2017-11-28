package  Nov_23;

public class New_rabbit extends Thread {
	int born_month;
	int now_month;
	int grow_rabbit = 0;

	public New_rabbit(int born_month, int now_month) {
		this.born_month = born_month;
		this.now_month = now_month;
	}

	@Override
	public void run() {
		add_rabbits();
	}

	public synchronized void add_rabbits() {

		int date = now_month - born_month;

		if (date >= 2) {
			for (int i = born_month + 2; i <= now_month; i++) {
				Rabbit.total_rabbits += 1;				
				New_rabbit new_rabbit = new New_rabbit(i, now_month);
				new_rabbit.start();
			}
		}
	}
}
