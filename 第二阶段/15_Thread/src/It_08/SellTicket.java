package It_08;

public class SellTicket implements Runnable {
	private int ticketc = 100;
	private Object obj = new Object();
	
	@Override
	public void run() {
		while (true) {
			//tickets = 100;
			//t1,t2,t3
			//假设t1抢到了CPU的执行权
			//假设t2抢到了CPU的执行权
			synchronized (obj) {
				//t1进来后，就会把这段代码给锁起来
				if (ticketc > 0) {
					try {
						Thread.sleep(100);
						//t1休息100毫秒
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//窗口1正在出售第100张票
					System.out.println(Thread.currentThread().getName() + "正在出售第" + ticketc + "票");
					ticketc--;    //tickets=99
				}
			}
			//t1出来了，这段代码锁就被释放了
		}
	}
}
