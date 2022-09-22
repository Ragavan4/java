public class Maxmin{  
    public static void main(String[] args)
	{  
  
        int [] arr = new int [] {5,4,7,24,12};    
        int min = arr[0];
        int max = arr[0];		
        for (int i = 0; i < arr.length; i++) 
		{  
           if(arr[i] <min)  
               min = arr[i];
            if(arr[i] > max)  
               max = arr[i];  		   
        }  
        System.out.println("Minimum element present in given array: " + min);
		System.out.println("Maximum element present in given array: " + max);  
}
}		
 