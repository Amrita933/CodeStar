import java.util.*;

 class Primee {

    public static void main(String[] args) {
        int i, count=0;
        System.out.println("Enter a number");
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();

        for(i=1; i<=n; i++){

            if(n%i==0){
                count++;
            }

            }

            if(count==2){
                System.out.println("Prime number");
            }
            else{
                System.out.println("Not Prime number");

            }
        }

        
 }

    
 
