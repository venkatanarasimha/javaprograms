class Addition10{
double add(double a,double b){
double c = a+b;
return c;
}
public static void main(String[]args){
Addition10 ad = new Addition10();
double res = ad.add(2.3,4.5);
System.out.println(res);
}
}