package state;
//用户在使用这个状态模式的时候必须得很清楚我们用的状态模式里面有效的切换路径
public class ClientClass {
	public static void main(String[] args) {
		ThreadContext tc=new ThreadContext();
		tc.start();
		tc.getCPU();
		tc.stop();
	}
}
