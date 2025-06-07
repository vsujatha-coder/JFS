import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		ArrayList<Integer> numbers_new = new ArrayList<Integer>();
		System.out.println("Enter values for ArrayList : ");
		int num;
		while(true) {
			num=sc.nextInt();
			if(num==0) {
				break;
			}
			else {
				numbers.add(num);
			}
			
			
		}
		System.out.println(numbers);
		
		
		for(int i = 0;i<numbers.size();i++) {
			int data = numbers.get(i);
			boolean found=false;
			
			for(int j =0;j<numbers_new.size();j++) {
				if(data==numbers_new.get(j)) {
					found=true;
				}
			}
			
			if(!found) {
				numbers_new.add(data);
			}
		}
		System.out.println(numbers_new);
		
		
		
		
		
	}

}
