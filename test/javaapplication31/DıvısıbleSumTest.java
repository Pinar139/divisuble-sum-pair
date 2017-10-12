package javaapplication31;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class DıvısıbleSumTest {
    
    public DıvısıbleSumTest() {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
        
    }
    
    @AfterClass
    public static void tearDownClass()
    {
        
    }

  /* @Test
    public void testSomeMethod()
    {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
  */
    
    
     
    
    
    @Test
    public void testNumberOfPairs0()
    {
        System.out.println(" ");
        int[] ar = { 1,2 };/* ar dizinin uzunlugunu verir.*/
        int k = 2;         /*Klavyeden girilen bölen sayısıdır.*/
        int expResult = 0; /*Beklenen sonucun doğruluğu kontrol ediliyor.*/
        int result = DıvısıbleSum.numberOfPairs(ar, k); /*Fonksiyonu sonuca gönderiyor.*/
        assertEquals(expResult, result);
       }  
    
    
     @Test
    public void testNumberOfPairs1()
     {
        System.out.println("");
        int[] ar = {8 ,10};/* ar dizinin uzunlugunu verir.*/
        int k = 2;
        int expResult = 1;
        int result = DıvısıbleSum.numberOfPairs(ar, k);/*Fonksiyonu sonuca gönderiyor.*/
        assertEquals(expResult, result);
       }   
   
    
     @Test
    public void testNumberOfPairs2()
    {
        System.out.println(" ");
        int[] ar = {5,9,10,7,4};/* ar dizinin uzunlugunu verir.*/
        int k = 2;
        int expResult = 4;
        int result = DıvısıbleSum.numberOfPairs(ar, k);/*Fonksiyonu sonuca gönderiyor.*/
        assertEquals(expResult, result);
    } 
    
    @Test
    public void testNumberOfPairs3()
       {
        System.out.println(" ");
        int[] ar = {36,46,25,97,57,14,21,50,75,58,54,32,73,11,36,22,95,46,54,61 };/* ar dizinin uzunlugunu verir.*/
        int k = 7;
        int expResult = 16;
        int result = DıvısıbleSum.numberOfPairs(ar, k); /*Fonksiyonu sonuca gönderiyor.*/
        assertEquals(expResult, result);
        }  
   
    
    
    @Test
    public void testNumberOfPairs4()
    {
        System.out.println(" ");
        int[] ar = { 85, 42, 54, 62, 79 ,71 ,29, 61, 1, 92, 93 ,99 ,82, 5 ,45 ,55, 49, 49 ,93, 45, 2 ,53 ,80, 68, 51, 15 ,42, 8, 5, 45, 95 ,90, 4 ,5 ,45 ,56 ,20 ,66 ,32, 65 ,11, 48, 41, 10 ,92, 41, 8 ,23, 88 ,50, 90,2,3 ,88, 29, 34, 54, 83, 91, 37 ,95, 11, 7, 48, 96, 2, 84, 50, 20, 97, 95, 85, 80, 87, 99, 34, 40, 33, 78, 6, 58, 82, 49, 37, 35, 12, 85, 73, 96, 7, 63, 36, 73, 3, 96, 23, 5, 75, 16, 41 }; /* ar dizinin uzunlugunu verir. */
        int k = 77;
        int expResult = 44;
        int result = DıvısıbleSum.numberOfPairs(ar, k);
        assertEquals(expResult, result);
    }   
   
    
    @Test
    public void testNumberOfPairs5()
    {
       System.out.println(" ");
       int[] ar={27 ,89, 4 ,69 ,18 ,56 ,93 ,41 ,51, 11 ,39 ,48 ,99 ,57 ,67 ,32 ,23 ,23 ,39, 70 ,26 ,79, 93 ,75 ,76 ,72 ,36 ,88 ,60 ,67 ,95 ,58 ,29 ,7 ,70 ,60, 6, 72 ,24 ,97 ,19 ,98 ,64 ,38 ,14 ,64 ,88 ,34 ,5 ,98 ,8 ,79 ,57 ,5 ,43 ,27 ,57 ,77 ,89 ,8 ,45 ,66 ,60 ,98 ,20 ,79 ,99 ,98 ,6 ,48 ,42 ,77 ,43 ,83 ,48 ,77 ,83 ,49 ,40 ,32 ,13 ,99 ,23 ,55 ,2 ,94 ,80 ,62 ,20 ,60 ,97 ,80 ,9 ,54, 67, 84 ,60, 62, 97, 64};  /* ar dizinin uzunlugunu verir. */
       int k=95;
       int expResult=36;
       int result=DıvısıbleSum.numberOfPairs(ar, k);
       assertEquals(expResult, result);
    }
    
    
    @Test
    public void testNumberOfPairs6()
    {
       System.out.println(" ");
       int[] ar={20 ,40 ,78 ,58 ,88 ,84 ,49, 10 ,75 ,49, 99 ,30 ,7, 15 ,80 ,29 ,43 ,94 ,99 ,58 ,23 ,57 ,84, 65 ,63 ,86 ,37 ,10 ,44 ,79, 45 ,79 ,17 ,40 ,7 ,27 ,74 ,70 ,92 ,76 ,52 ,73, 18 ,49 ,29 ,19 ,7 ,43 ,11, 41 ,7 ,26 ,49 ,61 ,75 ,37 ,33 ,28, 6, 5 ,70 ,47 ,58 ,74 ,66 ,26 ,22 ,90 ,25 ,15 ,91, 96 ,8 ,17 ,83 ,10 ,67 ,13 ,62 ,63 ,98 ,5 ,94 ,1 ,32 ,46 ,22 ,5 ,16 ,62 ,56 ,57 ,51 ,19 ,15 ,65 ,44 ,72 ,59 ,20};  /* ar dizinin uzunlugunu verir. */
       int k=41;
       int expResult=116;
       int result=DıvısıbleSum.numberOfPairs(ar, k);
       assertEquals(expResult, result);
    }
    
    @Test
    public void testNumberOfPairs7()
    {
        System.out.println(" ");
        int[] ar={34 ,38 ,30 ,27, 1 ,81 ,37 ,19 ,74 ,73 ,32 ,13 ,44 ,99 ,7 ,88 ,50 ,52 ,32 ,82 ,29 ,1 ,55 ,85 ,89 ,58 ,35 ,19 ,76 ,55 ,45 ,37 ,41 ,74 ,80 ,46 ,38 ,74 ,56 ,18 ,86 ,23 ,57 ,27 ,52 ,9 ,69 ,78 ,52 ,8 ,62 ,85 ,65 ,2 ,11 ,70 ,34 ,26 ,72 ,11 ,20 ,32 ,9, 75 ,74 ,85 ,29, 6 ,87, 81 ,40 ,11 ,31 ,49 ,66 ,91 ,99 ,85 ,18 ,54 ,81 ,93 ,52 ,9, 72, 89, 85 ,66 ,24 ,11, 85, 3 ,14, 36 ,72, 3 ,76 ,99 ,88, 8};  /* ar dizinin uzunlugunu verir. */
        int k=96;
        int expResult=65;
        int result=DıvısıbleSum.numberOfPairs(ar,k);
        assertEquals(expResult, result);
    }
    @Test
    public void testNumberOfPairs8()
    {
        System.out.println(" ");
        int[] ar={20,30,45,55};  /* ar dizinin uzunlugunu verir. */
        int k=2;
        int expResult=2;
        int result=DıvısıbleSum.numberOfPairs(ar, k);
        assertEquals(expResult,result);
 }
     @Test
    public void testNumberOfPairs9()
    {
        System.out.println(" ");
        int[] ar={34 ,38 ,30 ,27, 1 ,81 ,37 ,19 ,74 ,73 ,32 ,13 ,44 ,99 ,7 ,88 ,50 ,52 ,32 ,82 ,29 ,1 ,55 ,85 ,89 ,58 ,35 ,19 ,76 ,55 ,45 ,37 ,41 ,74 ,80 ,46 ,38 ,74 ,56 ,18 ,86 ,23 ,57 ,27 ,52 ,9 ,69 ,78 ,52 ,8 ,62 ,85 ,65 ,2 ,11 ,70 ,34 ,26 ,72 ,11 ,20 ,32 ,9, 75 ,74 ,85 ,29, 6 ,87, 81 ,40 ,11 ,31 ,49 ,66 ,91 ,99 ,85 ,18 ,54 ,81 ,93 ,52 ,9, 72, 89, 85 ,66 ,24 ,11, 85, 3 ,14, 36 ,72, 3 ,76 ,99 ,88, 8};  /* ar dizinin uzunlugunu verir. */
        int k=96;
        int expResult=65;
        int result=DıvısıbleSum.numberOfPairs(ar, k);
        assertEquals(expResult, result);
    }
    
}
    

