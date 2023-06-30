class Py{
public static void main(String[] args){
	int amount=100050;
	
	int a=Math.floorDiv(amount,2000);
	int x=amount%2000;

	
	System.out.println("2000 note will be"+a);

	int b=Math.floorDiv(x,1000);
	int c=x%1000;
	
	System.out.println("1000 note will be"+b);

	int d=Math.floorDiv(c,500);
	int e=c%500;
	
	System.out.println("500 nte will be"+d);

	int f=Math.floorDiv(e,200);
	int g=e%200;
	
	System.out.println("200 nte will be"+f);

	int h=Math.floorDiv(g,100);
	int i=g%100;

	System.out.println("100 nte will be"+h);

	int j=Math.floorDiv(i,50);
	int k=i%50;

	System.out.println("50 nte will be"+j);

	int l=Math.floorDiv(k,10);
	int m=k%10;

	System.out.println("10 nte will be"+l);

	int n=Math.floorDiv(m,5);
	int o=m%5;

	System.out.println("5 nte will be"+n);
	
	
}
}