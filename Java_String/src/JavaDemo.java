
class MyThread implements Runnable{//�̵߳�������
	private int tickets =5;
	public void run(){
		for(int i=0;i<100;i++){
			if(this.tickets>0){
			System.out.println("��Ʊ��ticket= "+this.tickets --);
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

