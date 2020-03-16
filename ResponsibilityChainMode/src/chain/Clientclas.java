package chain;

import java.util.Random;

public class Clientclas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFruitSort Bfs,Mfs,Sfs;
		Bfs=new BigFruitSorting(9);
		Mfs=new MidFruitSorting(5);
		Sfs=new SmallFruitSorting(2);

		Bfs.setNextSort(Mfs);
		Mfs.setNextSort(Sfs);
		
		Random rm=new Random();
		for(int i=0;i<1000;i++){
			int weight=rm.nextInt(10);
			Bfs.sendFruit(weight, "Ёхвс");
		}
		Bfs.getFruitBox();
		Mfs.getFruitBox();
		Sfs.getFruitBox();
	}

}
