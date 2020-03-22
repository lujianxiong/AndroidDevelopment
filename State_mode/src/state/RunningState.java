package state;

public class RunningState extends ThreadState {
	public RunningState(){
		state=StateSet.RUNNING;
		System.out.println("运行状态");
	}
	
	public void suspend(ThreadContext tc){  //一种情况是阻塞
		System.out.println(" 调用suspend方法");
		if(state==StateSet.RUNNING)
			tc.setThreadState(new BlockState());
		else
			System.out.println("当前状态不是运行状态");
	}
	
	public void stop(ThreadContext tc){
		System.out.println("调用stop方法");
		if(state==StateSet.RUNNING)
			tc.setThreadState(new DeadState());
		else
			System.out.println("当前状态不是运行状态");
	}
}
