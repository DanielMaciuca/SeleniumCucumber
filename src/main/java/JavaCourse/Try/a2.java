package JavaCourse.Try;


    public class a2 {

            public static void main(String args[]){
                int temp, size;
                int array[] = {10, 5, 12};
                size = array.length;

                for(int i = 0; i<size; i++ ){
                    for(int j = i+1; j<size; j++){
                        if(array[i]>array[j]){
                            temp = array[i];
                            array[i] = array[j];
                            array[j] = temp;
                        }
                    }
                }
                System.out.println("Third largest element is:: "+array[size-1]);
            }
        }

