
public class EqualDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String K1 = new String("HELLO");
        String K2 = new String("HELLO");        
         
        System.out.println("K1 and K2 are equal : "+(K1==K2));     // result is returning false because the == operator is comparing references of objects k1 and k2 
        															//i.e. comparing addresses of objects
        System.out.println("K1 and K2 are equal : "+(K1.equals(K2)));  
 
        K1 = K2;
        System.out.println("K1 and K2 are equal : "+(K1==K2));  
	}

}
