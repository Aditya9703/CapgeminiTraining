package capg;

public class CustomArraylist {

	public static void main(String[] args) {
		
		MyArrayList list = new MyArrayList();
		
		list.add(1);
		list.add(20);
		list.add(50);
		list.add(60);
		list.add(90);
		list.add(100);
		
		list.print();
		
		list.add(1);
		list.add(20);
		list.add(50);
		list.add(60);
		list.add(90);
		list.add(100);
		
		list.add(1);
		list.add(20);
		list.add(50);
		list.add(60);
		list.add(90);
		list.add(100);
		
		list.print();
		
		System.out.println(list.search(50));
		list.sort();
		list.print();
		

	}
}
	
	class MyArrayList
	{
		private int data[];
		private int size; 
		
		MyArrayList(){
		
		data = new int[4];
		}
		
		public void add(int el)
		{
			if(size == data.length)
				resize();
			
			data[size++] = el;
			
		}
		
		private void resize()
		{
			int newData[] = new int[data.length * 2];
			
			for(int i=0; i<size; i++)
			{
				newData[i] = data[i];
			}
			
			data = newData;
			
		}
		
		 void print()
		{
			for(int i=0; i<size; i++)
				System.out.print(data[i] +" ");
			
			System.out.println();
		}
		 
		int search(int el)
		{
			for(int i=0; i< size; i++)
				if(data[i] == el)
					return i;
			
			return -1;
		}
		
		void sort()
		{
			
			for(int i=0; i<size-1; i++)
			{
				for(int j=i+1; j< size; j++)
				{
					if(data[i] > data[j])
					{
						int temp = data[i];
						data[i] = data[j];
						data[j] = temp;
						
					}
				}
			}
		}
		 
		
	}


