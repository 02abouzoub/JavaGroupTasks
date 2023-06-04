public class Prime_salem {
    public static void main(String[] args) {




            prime(8);

        }

        public static void prime(int num){

            int count = 0;

            for(int i = 1; i <= num; i++)
            {
                if(num % i == 0 )
                {
                    count++;
                }

            }
            if(count == 2)
            {
                System.out.println(num +"  is prime");
            }
            else {
                System.out.println(num+" is not a prime number.");
            }
        }
    }

