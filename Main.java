import java.util.Random;

public class Main {
    final static int Constant = 10000;
    public static int findFactor(int target, Prime prime){
        for(int i = 0; i < target; i++){
                int num = prime.getPrime(i);
                if(target % num == 0){
                    return num;
                }
        }
        return -1;
    }
    public static void main(String[] args){
        Prime prime = new Prime(Constant);
        Random random = new Random();
        int target = 0;
        do{
            target = random.nextInt(Constant);
        }while(prime.isPrime(target) || target < 2);

        System.out.println("What primes make up " + target);

        while(findFactor(target, prime) >= 2){
            int returned = findFactor(target, prime);
            System.out.print(returned);
            target/=returned;
            if(target >= 2){
                System.out.print("x");
            }

        }


    }
}
