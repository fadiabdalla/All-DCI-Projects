package multidimensional_arrays;

public class Main {

	public static void main(String[] args) {

		/*
        String name = "John";
        int age = 34;
        // %s, %d, \t
        System.out.printf("My name is %s and I am %d years old", name, age);
		
		*/
        String[][] colors = {
        					 	{"red", "blue", "black"},
        					 	{"white", "grey", "purple"},
        					 	{"green", "yellow", "pink"}
        					 };       
		
        
        for (int i= 0; i< colors.length; i++ ) {
        	String[] subArray = colors[i];
        	
        	for (int j = 0; j< subArray.length; j++) {
        		
        		System.out.printf("%s\t", subArray[j]);
        		
        	}
        	
        	System.out.println();
        	
        	
        }
        
        int[][] arr = {{1, 2}, {3, 4}};
        
        for(int i = 0;i < 2; i++) {
        	
        	for (int j = 0; j < 2; j++) {
        		
        		System.out.print(arr[i][j] + " ");
        		
        		
        	}
        	
        	System.out.println();
        }
        
        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[1][0] = 30;
        arr[1][1] = 40;
        
        for(int[] row:arr) {
        	
        	for(int num: row) {
        		
        		System.out.print(num + " ");
        		
        		
        	}
        	
        	System.out.println();
        }
        
	}

}
