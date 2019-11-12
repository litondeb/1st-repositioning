package duplication;
  //June 22.2019
public class Array {

	public static void main(String[] args) {
		int[]  array= {4,3,2,1,5,11,9,10,8,5,100};
		
		int temp;
		
	   for(int i=1;i<array.length;i++){
		   //reverse
		   for(int j=i;j>0; j--){
			   if (array[j] <array[j-1]){
				   
				   temp=array[j];
				   array[j]=array[j-1];
				   array[j-1]=temp;

	}
		   }
	   }
	   for(int i=0;i<array.length;i++){
		   
		   System.out.print(" "+array[i]);
	   }
}
}//Accending order sorting 
  //we can deccending just use greater sign from line 13