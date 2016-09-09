package test;


import java.util.*;




public class Arzoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 ArrayList<Integer> store= new ArrayList<Integer>();
		
	 for(int i=0; i<30;i++){
		 
		 store.add(i);
	 }

		store.add(15);
		store.add(20);

	Collections.sort(store);
		
		for(int i=1; i<store.size()-1; i++){
			if(store.get(i)==store.get(i-1)){
			
			//	System.out.println("Duplicate item: " + store.get(i));
				store.remove(i);
				
			}
			else{
				
				System.out.println(" item: " + store.get(i));
			}
			
			
			HashSet<Integer> gh= new HashSet<Integer>(store);
			
			
			Iterator iterator = (Iterator) gh.iterator();
			
		for(Integer j: gh){
			
			System.out.println("Value of set "+j);
			
		}
		
		while(iterator.hasNext()){
			   System.out.println("value : "+iterator.next());
			  }
			
	}
	
		
		int numbers[] = new int[10];
		numbers[0] = 1;
		numbers[1]= 2;
		numbers[2] = 3;
		
		int size =3, total =0, j=0 , k; 
		
		while(j<size){
			k=j;
					while( k<size){
						total = total +numbers[k];
						k++;
					
					}
					j++;
		}
		
		
		System.out.print(total);
		
	}
		
		
}
	


