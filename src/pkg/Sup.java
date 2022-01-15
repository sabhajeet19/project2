package pkg;

public class Sup {
	public static void abc(int a,int b,int c,int d,int e) {
		int f = (((a+b)*c)/d)-e;
		System.out.println(f);
	}
	public Integer add (Integer l,Integer m) {
		int x = l+m;
		//System.out.println(x);
		return x;
		
		
    }
	int a = 12;
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
         System.out.println("22222");
         String s = "23";
         int num = Integer.parseInt(s);
         System.out.println(num);
         String s1 = "2333";
         int num1 = Integer.valueOf(s1);
         System.out.println(num1);
         int i = 23;
         String s2 = Integer.toString(i);
         System.out.println(s);
        int s3 = 111;
         System.out.println(i+s3+s2);
         //Sup p = new Sup();
         Sup.abc(11,22, 33, 44, 55);
         int k = (((11+22)*33)/44)-55;
         System.out.println(k);
         System.out.println(Integer.toBinaryString(s3));
         if(s3>i) {
        	 System.out.println("s3 greater than i");
         }
         else {
        	 System.out.println("s3 leass than i");
         }
         for(int j=0;j<=10;j++) {
        	 if(j==5) {
        		 break;
        	 }
        	 System.out.println(j);
         }
         Sup ss = new Sup();
       int x = ss.add(52,25);
       System.out.println(x);
       int y[] = new int[5];
       //int y [] = {1,2,3,4,5,6,7,8,9,10};
          int ArrayLength = y.length;
          System.out.println(ArrayLength);
          int z[][]= new int[5][5];
          int ArrayLengthZ = z.length;
          System.out.println("ArrayLengthZ = "+ArrayLengthZ);
          int [] arrayOfInteger = new int[] {5,6,7,12,25,56};
         int array[] = {1,2,3,4,5,6};
         System.out.println(arrayOfInteger[1]);
         System.out.println(arrayOfInteger[3]);
         System.out.println(arrayOfInteger[5]);
         int a1[][]= {{1,2,3,4},{2,3,4,5,9}};
         System.out.println(a1[0].length);
         System.out.println(a1[1].length);
         System.out.println(a1[1][4]);
       System.out.println(s1.concat(s).concat(s2));
    		String sss = "avbvbvvnvvnvnvnvnvnvnzxssdfghyttttt";
    		String s1s = "ABGNBHJJKKJJKK";
    		sss.substring(3);
    		sss.substring(3);
    		System.out.print(sss.substring(3)+ "***"+sss.substring(3));
        
          System.out.println(sss.equals(s1s));
          System.out.println(sss.compareTo(s1s));	
          System.out.println(sss.length());
          System.out.println(s1s.length());
          System.out.println(sss.toLowerCase());
          System.out.println(sss.toUpperCase());
          System.out.println(s1s.replace("A","Z"));
          System.out.println(sss.length());
          String a2 = sss.substring(1, 34);
          String a = sss.substring(0,1);
          System.out.println(a);
          String al = a.toUpperCase();
          System.out.println(al.concat(a2));
          StringBuffer sb = new StringBuffer("zbxncbcbcbc");
          System.out.println(sb.deleteCharAt(0));
          System.out.println(sb.reverse());
          System.out.println(sb.append("Hello"));
          System.out.println(sb.insert(2, "Goods"));
         
          
          Employee em =new Employee();
          Manager ma = em;
         em.move();
        
         ma.move();
         int[] num5 = {1,2,3,4,5,6,7,8,9};
         for(int i1: num5) {
        	 System.out.println(i1);
         }
        	 int arr [][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        	 for(int i2 = 0; i2 <3; i2++) {
        		 for(int j = 0; j <4 ; j++) {
        			 System.out.print(arr[i2][j]+" ");
        		 }
        		 System.out.println();
        	 }
        	 
         }
	}


