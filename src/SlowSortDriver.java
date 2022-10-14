
public class SlowSortDriver 
{
	public static void main(String[] args) 
	{
		int[] numbers1 = {14, 72, 59, 23, 12, 34, 37, 24, 97, 124, 8, 35, 11, 16, 42};
		int[] numbers2 = {14, 72, 59, 23, 12, 34, 37, 24, 97, 124, 8, 35, 11, 16, 42};
		int[] numbers3 = {14, 72, 59, 23, 12, 34, 37, 24, 97, 124, 8, 35, 11, 16, 42};
		int[] numbers4 = {14, 72, 59, 23, 12, 34, 37, 24, 97, 124, 8, 35, 11, 16, 42};
		
		System.out.println("Bubble Sort");
		BubbleSort(numbers1);
		for(int k = 0; k < numbers1.length; k++)
        {
        	System.out.print(numbers1[k] + ", ");
        }
		System.out.println(" ");
		
		System.out.println(" ");
		System.out.println("Insertion Sort");
		InsertionSort(numbers2);
		for(int i = 0; i < numbers2.length; i++)
		{
			System.out.print(numbers2[i] + ", ");
		}
		System.out.println(" ");
		
		System.out.println(" ");
		System.out.println("Selection Sort");
		SelectionSort(numbers3);
		for(int i = 0; i < numbers3.length; i++)
		{
			System.out.print(numbers3[i] + ", ");
		}
		System.out.println(" ");
		
		
		System.out.println(" ");
		System.out.println("Shell Sort");
		ShellSort(numbers4);
		for(int i = 0; i < numbers4.length; i++)
		{
			System.out.print(numbers4[i] + ", ");
		}
	}
	
	public static int[] BubbleSort(int[] numbers1) 
	{
		int temp;
		int swaps = 0;
		for (int i = 0; i < numbers1.length - 1; i++) 
		{
			for (int j = 0; j < numbers1.length - i - 1; j++) 
			{
		         if (numbers1[j] > numbers1[j+1]) 
		         {
		        	 temp = numbers1[j];
			         numbers1[j] = numbers1[j + 1];
			         numbers1[j + 1] = temp;
			         swaps++;
		         }
		      }
		   }
		System.out.println("Swaps: " + swaps);
		return numbers1;
	}
	
	public static void InsertionSort(int[] array)
	{
		int swaps1 = 0;
		for(int i = 1; i < array.length; i++)
		{
			int currentIndex = i;
			while(currentIndex > 0 && array[currentIndex] < array[currentIndex - 1])
			{
				int temp = array[currentIndex];
				array[currentIndex] = array[currentIndex - 1];
				array[currentIndex - 1] = temp;
				currentIndex--;
				swaps1++;
			}
			
		}
		System.out.println("Swaps: " + swaps1);

	}
	
	public static int[] SelectionSort(int[] array)
	{
		int swaps2 = 0;
		for(int i = 0; i < array.length - 1; i++)
		{
			int smallestIndex = i;
			
			
			for(int j = i + 1; j < array.length; j++)
			{
				if(array[j] < array[i])
				{
					int temp = array[smallestIndex];
					array[smallestIndex] = array[j];
					array[j] = temp;
					swaps2++;
				}
			}
		}
		System.out.println("Swaps: " + swaps2);
		return array;
	}
	
	public static void ShellSort(int arr[])
    {
		int swaps3 = 0;
        int n = arr.length;
        for (int gap = n/2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < n; i += 1)
            {
            	int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
                swaps3++;
            }
        }
        System.out.println("Swaps: " + swaps3);
    }
	
/*
Try to use times of swap to estimate their runtime performance.
*/
	
}
