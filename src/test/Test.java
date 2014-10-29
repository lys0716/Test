/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Eason Lu
 */
public class Test {

    static int n1;
    static int n2;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.print(13 + 2 * 5 / 3+"\n");
        String m = new String("abc");
        String m1 = new String("abc");
        
        char n = '1';
        String mn = m + n;
        System.out.println(m.equals(m1));
        ArrayList t = new ArrayList();
        Random r=new Random();
        int k=r.nextInt(2);
//        Scanner input = new Scanner(System.in);
//        String temp = input.nextLine();
        String[][] temp2={{"I have a dream","You have a dream too TBbye8 (^*&%"},{"haha","yes!"},{"111","22"}};
        System.out.print(temp2[0].length+"this");
        System.out.print(4+'\n'+"\n");
        System.out.print(Test.numWords(temp2)[0]+"\n");
//        System.out.printf("%6.f",597.7231);
        n2 = n1 + n2;
//        double k = 2333;
//        char c = (int) 97.13451;
//        System.out.print(c);
        String a1 = new String("ca ee");
        String a2 = new String("da cc");
        int[] im=new int[3];
        int a3 = 1;
        int a4 = 3;
        int a;
        int b = 0;
        int c;
        a = b += c = 5;
        System.out.print(a1.compareTo(a2)+"\n");
//        System.out.print(a);
//        System.out.print(b);
//        System.out.print(c);
        char u='a';
        System.out.print((char)((int)++u)+"\n");
        System.out.print(-5<=4);
        Test.test(1);
        Scanner input=new Scanner(System.in);
        double w=Double.valueOf(input.nextLine());
//        int Value=Integer.parseInt(w);
        System.out.print(w);
        System.out.print("This is the change!");
        System.out.print("This is GitHub!");
    }

    public static void test(double t)
    {
//        for(int i=0;i<100;i++)
//        {
//            if(i==74)break;
//            if(i%9!=0)continue;
//            System.out.println(i);
//        }
        int i=0;
        while(true)
        {
            i++;
            int j=i*27;
            if(j==1269) break;
            if(i%10!=0) continue;
        }
        int j=(int)Math.random();
        char m=(char)(Math.random()*26+'a');
    }
    
    public static int recursion(int n) {
        if (n != 1) {
            return recursion(n - 1) * n;
        } else {
            return 1;
        }
    }

    public static int[] numWords(String[][] sentence) {
        String temp = "";
        int num = 0;
        for (int i = 0; i < sentence[0][1].length(); i++) {
//            if(sentence.charAt(i)!=' ')
//            {
//                for(int j=0;j<=i;j++)
//                {
//                    temp+=sentence.charAt(j);
//                }
//            }
            if (sentence[0][1].charAt(i) != ' ') {
                for (int j = i; j < sentence[0][1].length(); j++) {
                    if (sentence[0][1].charAt(j) != ' ') {
                        temp += String.valueOf(sentence[0][1].charAt(j));
                        if (j + 1 == sentence[0][1].length()) {
                            num++;
                            i = j;
                        }
                    } else {
                        num++;
                        i = j;
                        break;
                    }
                }
            }
        }
        int[] temp1 = {num};
        temp1[0] = num;
        return temp1;
    }
}
