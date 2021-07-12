package jpMorgan.banking.withdraw;

import java.util.*;

public class Fibonacci extends Thread {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        Gen g  = new Gen(n);
        Sume s = new Sume();
        g.start();
        s.start();
    }
}

class Gen extends Thread{
    static int n, count;
    static ArrayList<Integer> ar = new ArrayList<Integer>();

    public Gen(int n){
        this.n = n;
    }

    public void run(){
        int f=1, s=1;
        ar.add(f);
        count++;
        ar.add(s);
        count++;
        for(int i=3;i<=n;i++){
            ar.add(f+s);
            f=s;
            s=ar.get(ar.size()-1);
            count++;
        }
    }
}

class Sume extends Thread{
    static int count =0;
    static ArrayList<Integer> list = new ArrayList<Integer>();
    static ArrayList<Integer> slist = new ArrayList<Integer>();
    int sc =0;
    public void run(){
        list.add(0);
        while(Sume.count<Gen.n){
            if(Sume.count<Gen.count){
                int get1=list.get(list.size()-1);
                int get2 = Gen.ar.get(count);
                list.add(get1+get2);
                Sume.count++;
                System.out.println(list);
            }
        }
    }
}