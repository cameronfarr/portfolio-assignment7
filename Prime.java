import java.util.LinkedList;
public class Prime {
    LinkedList<Integer> LinkedList = new LinkedList<Integer>();
    public Prime(int max){
        boolean[] myArray = new boolean[max];
        for(int i = 2; i < myArray.length; i++){
            myArray[i] = true;
        }
        for(int i = 2; i < Math.sqrt(max); i++){
            for(int j = i*2; j < max; j+=i){
                myArray[j] = false;
            }
        }
        // Change the value of each cell to false when you determine it’s not a prime
        // Once you’ve completed the algorithm all cells still true are prime.
        for(int i = 2; i < myArray.length; i++){
            if(myArray[i]){
                LinkedList.add(i);
            }
        }
    }

    public boolean isPrime(int num){
        for(int prime : LinkedList){
            if(prime == num){
                return true;
            }
        }
        return false;
    }

    public int getPrime(int position){
        return LinkedList.get(position);
    }
}
