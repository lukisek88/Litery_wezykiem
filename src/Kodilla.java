import java.util.*;


class MyArryDeque{


    public void run(){
        String sumA= "a";
        String a = "a";

        ArrayDeque<String> myArry = new ArrayDeque<String>();
        Random rG = new Random();

        int count=0;
        while(myArry.size() < 50 ) {
            int numberA = rG.nextInt(1,50);

            if(numberA != 0) {
                sumA = a;

                for(int i=1; i < numberA; i++){
                    sumA += a;
                }
            }
            myArry.push(sumA);
            count++;

            // System.out.println(" Numer petli: "+count+"; Wynik losowania: "+numberA+"; Wynik: "+myArry.peek());
        }

        OnlyA wordA = new OnlyA();
        wordA.OnlyEvenAndOdd(myArry);

    }



}

class OnlyA
{

    public void OnlyEvenAndOdd(ArrayDeque<String> theQuantity) {
        String word = null;
        ArrayList<String> even = new ArrayList<String>();
        ArrayList<String> odd = new ArrayList<String>();
        while(theQuantity.size() > 0) {
            word = theQuantity.poll();
            if(word.length() % 2 == 0) {
                even.add(word);
                System.out.println("Even: " + word);
            } else {
                odd.add(word);
                System.out.println("Odd: " + word);
            }
        }
    }
}




public class Kodilla{
    public static void main(String[] args) {
        MyArryDeque myarrydeque = new MyArryDeque();
        myarrydeque.run();


    }
}