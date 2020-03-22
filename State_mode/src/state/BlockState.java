package state;

public class BlockState extends ThreadState {
	public BlockState(){
		state=StateSet.BLOCKED;
		System.out.println("阻塞线程");
	}
	public void resume(ThreadContext tc){
		System.out.println("调用了resume方法");
		if(state==StateSet.BLOCKED){
			tc.setThreadState(new NewState());}
		else
			System.out.println("当前线程不是阻塞状态");
	}
	
}
