package It_02;

public class MyTread extends Thread {
	public MyTread(){}
	
	public MyTread(String name){
		super(name);
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			//String getName()：返回此线程的名称
			System.out.println(getName()+":"+i);
		}
	}
}

/*
源码分析
private String name;

public Thread() {
	this(null, null, "Thread-" + nextThreadNum(), 0);
}

public Thread(String name) {
	this(null, null, name, 0);
}

public Thread(ThreadGroup group, Runnable target, String name,
              long stackSize) {
	this(group, target, name, stackSize, null, true);
}

private Thread(ThreadGroup g, Runnable target, String name,
               long stackSize, AccessControlContext acc,
               boolean inheritThreadLocals) {
	this.name = name;
}

public final synchronized void setName(String name) {
	this.name = name;
}

public final String getName() {
	return name;
}

private static int threadInitNumber; //0,1,2
private static synchronized int nextThreadNum() {
	return threadInitNumber++;//0,1,...
}
 */
