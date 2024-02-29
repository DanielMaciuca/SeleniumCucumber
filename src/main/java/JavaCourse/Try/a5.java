package JavaCourse.Try;


    public class a5 {




        public static void main(String[] args) {
            int number = 4;


            if (number <= 1) {
                System.out.println(number + " is not prime");


            }

            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    System.out.println(number + " is not prime");
                }
                break;
            }

            System.out.println(number + " is prime");

        }


        }

