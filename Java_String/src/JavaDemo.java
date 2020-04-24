
class MyThread implements Runnable{//线程的主体类
	private int tickets =5;
	public void run(){
		for(int i=0;i<100;i++){
			if(this.tickets>0){
			System.out.println("卖票，ticket= "+this.tickets --);
		}
		}
		
	}

}


public class JavaDemo {
	public static void main(String[] args) {
			MyThread mt=new MyThread();
			new Thread(mt).start();
			new Thread(mt).start();
			new Thread(mt).start();
			
		}
	}

