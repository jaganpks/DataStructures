class LinkedListTest
{
	public static void main(String ar[])
	{
		LinkedList newList = new LinkedList();
		
		newList.add(1);
		newList.add(2);
		newList.add(3);
		
		System.out.println("List: "+newList.toString());
		System.out.println("List Size:"+ newList.size);
		
		newList.push(0);
		
		System.out.println("List: "+newList.toString());
		System.out.println("List Size:"+ newList.size);
		
		System.out.println("Element delete: "+newList.delete());
		System.out.println("List Size:"+ newList.size);
		System.out.println("Element delete: "+newList.delete());
		System.out.println("List Size:"+ newList.size);
		System.out.println("Element delete: "+newList.delete());
		System.out.println("List Size:"+ newList.size);
		
		System.out.println("List: "+newList.toString());		
		
		
		System.out.println("Element delete: "+newList.delete());
		System.out.println("List Size:"+ newList.size);
		
		System.out.println("/***** Delete by key *****/");
		newList.add(1);
		newList.add(2);
		newList.add(3);
		newList.add(4);
		newList.add(5);
		newList.add(6);
		
		System.out.println("Delete 1:"+newList.deleteByKey(1));
		System.out.println("Delete 6:"+newList.deleteByKey(6));
		System.out.println("Delete 4:"+newList.deleteByKey(4));
		
		System.out.println("Delete 10:"+newList.deleteByKey(4));
		
		System.out.println("List: "+ newList.toString());
		
		newList.clear();
		
		System.out.println("/***** Delete by position *****/");
		
		newList.add(1);
		newList.add(2);
		newList.add(3);
		newList.add(4);
		newList.add(5);
		newList.add(6);

		System.out.println("List: "+ newList.toString());
		
		System.out.println("Delete 1st:"+newList.deleteByPosition(1));
		System.out.println("Delete last:"+newList.deleteByPosition(newList.size));
		System.out.println("Delete 3rd:"+newList.deleteByPosition(3));
		
		System.out.println("List: "+ newList.toString());
		
		newList.clear();
		
		System.out.println("/***** Reverse *****/");
		
		newList.add(1);
		newList.add(2);
		newList.add(3);
		newList.add(4);
		newList.add(5);
		newList.add(6);
		
		System.out.println("List: "+ newList.toString());
		
		newList.reverse();
		
		System.out.println("Reversed List: "+ newList.toString());
		
	}
}