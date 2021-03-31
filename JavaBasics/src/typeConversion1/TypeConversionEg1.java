package typeConversion1;

public class TypeConversionEg1 {
    
	public static void main(String[] args) {
	
	System.out.println("Boolean to String Conversion");	
	boolean b1 = true;
	boolean b2 = false;
	String s1 = String.valueOf(b1);       //valueOf
	String s2 = String.valueOf(b2);
	String s3 = Boolean.toString(b1);     //toString
	String s4 = Boolean.toString(b2);
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s4);
	
System.out.println();

	System.out.println("Double to int Conversion");
	double d = 15.5;
	int i = (int)d;
	System.out.println(i);
	
	Double d1 = new Double(20.5);   //Double Obj into Int
	int i1 = d1.intValue();
	System.out.println(i1);
	
System.out.println();

 	System.out.println("Int to Double Conversion");
 	int i2 = 600;
 	double d2 = i2;
 	System.out.println(d2);
 	
 	Double d3 = new Double(i2);   // Int to double Obj 
 	Double d4 = Double.valueOf(i2); 
 	System.out.println(d3);
 	System.out.println(d4);
 	
 System.out.println();
 
    System.out.println("Long to int Conversion");
    long l = 1200;
    int i3 = (int)l;
    System.out.println(i3);
    
    Long l1 = new Long(800);    //Long obj to int
    int i4 = l1.intValue();
    System.out.println(i4);
	
 System.out.println();
    
    System.out.println("Count the Occurance of Char in a String");
 	String str1 = "MUMMY";
 	String str2 = "Happy";
 	int count = 0;
 	int count1 = 0;
 	for (int s11 = 0; s11<=str1.length()-1; s11++) {
 		
 		if(str1.charAt(s11) == 'M') {
  			count++; }
 	}
 	System.out.println("The Occurance of M is : "+count);
 	
	
 	for (int s12 = 0; s12<=str2.length()-1; s12++) {
		
 		if(str2.charAt(s12) == 'p') {
			count1++; }
 	}
    System.out.println("The Occurance of p is : "+count1);	
			
}
}
 	
   
 

