package JavaCourse.Try;


    public class a3 {


       public static void main(String[] args) {
            int r,sum=0;
            int temp;
            int n=232;//It is the number variable to be checked for palindrome

            temp=n;
            while(n>0){
                r=n%10;  //getting remainder
                sum=(sum*10)+r;
                n=n/10;
            }
            if(temp==sum)
                System.out.println("palindrome number ");
            else
                System.out.println("not palindrome");
        }  }

