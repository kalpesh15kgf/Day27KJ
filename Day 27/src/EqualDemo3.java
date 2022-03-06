
public class EqualDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String sampleStr1 = new String("KALPESH");
        String sampleStr2 = new String("kalpesh");    
        String sampleStr3 = null;
        String sampleStr4 = "KALPESH";
 
         
        System.out.println("sampleStr1 and sampleStr2 are equal : "+(sampleStr1.equals(sampleStr2)));  
        System.out.println("sampleStr1 and sampleStr4 are equal : "+(sampleStr1.equals(sampleStr4)));
        System.out.println("sampleStr2 and sampleStr4 are equal : "+(sampleStr2.equals(sampleStr4)));
        System.out.println("sampleStr4 and sampleStr3 are equal : "+(sampleStr4.equals(sampleStr3)));
	}

}
