class Separate{
public static void main(String args[]){
	int odd=0,even=0;
	int sum=0;
	for(int i=0; i<10; i++){
		int a = Integer.parseInt(args[i]);
		sum+=a;
		if(a%2==1){odd++;}
		else{even++;}
		}
	System.out.println("odd : "+odd+" even : "+even);
	System.out.println("and their total sum is : "+sum);
	}
}
