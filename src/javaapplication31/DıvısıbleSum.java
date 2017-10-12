package javaapplication31;
import java.util.HashMap;
import java.util.Scanner;


public class DıvısıbleSum {
    public static void main(String[] args) {
            System.out.println("Sample Input");
            Scanner in = new Scanner(System.in);/*Klavyeden eleman girmek için tanımlıyoruz.*/
            int n = in.nextInt();  /*Klavyeden n elemanı giriliyor.*/   //Covered
            if (n>=1 && n<=100 )   /*n'nin kısıtlamalarını giriyoruz.*/
	    {
            int k = in.nextInt();/*Klavyeden k elemanı giriliyor.*/
            int a[] = new int[n];/*n elemanlı dizi için yer ayrılıyor.*/
            for(int a_i=0; a_i < n; a_i++)
             {   System.out.println(a_i + ". dizi elemanini giriniz: " );  
                  a[a_i] = in.nextInt();/*Klavyeden dizinin indisleri giriliyor.*/
             }
           System.out.println(numberOfPairs(a, k));/*fonksiyonu çağırıyor.*/
             }
            else
                  {
                  System.out.println("Bu sınırlar dışına çıkmayınız  1<= n <=100 " );  }}
    public static int numberOfPairs(int[] ar, int k){
        int pairCount = 0;
        int sum;
        HashMap<Integer, Integer> checked = new HashMap<>();/*Anahtarları değere işler.Her anahtar sadece bir kez kullanılabilir....*/
       try{
           if ( ar.length == 0 )
         { System.out.println("Lütfen en az sıfırdan farklı bir sayı giriniz.!!");}
         else if(ar.length>=1 && ar.length<=100)
         {
         for (int i = 0; i < ar.length; i++){      /*ar.length dizinin uzunlugunu verir....*/
         for (int j = i + 1; j < ar.length; j++){
         sum = ar[i] + ar[j];
         if (checked.containsKey(sum)){ /*Belirtilen anahtar için bir eşleme olup olmadığını kontrol eder....*/
         System.out.println("a(" + i + ") +  a(" + j + ") = \t  " + sum);
         pairCount++;}
         else if((sum % k) == 0){
         pairCount++;
         System.out.println("a(" + i + ") +  a(" + j + ") = \t  " + sum);
         checked.put(sum, 1);/*Kontrol ediliyor.*/}}}}
         else
         {
         System.out.println("Bu sınırlar dışına çıkmayınız 1<= n <=100" ); }}
         catch(ArithmeticException hata1)/*try catch ile sıfıra bölme hatası kontrol ediliyor */
             {
              System.out.println("Bölen sayısını sıfırdan farklı giriniz.!!");
             }System.out.println("Expected output");
              return pairCount;}}
