/**
 * Java. HomeWork2
 *
 * @author Alexey Ivanov
 * @version dated Nov 28, 2017
 */
class HW2Lesson {
    
    public static void main(String[] args) {
        // Task №7 
        // Setting of the dim. of the array 
        int param_size=4;                    
        // Setting of the shift;
        int n_shift=2;                      
        // call for task №7
       shift_array(param_size, n_shift);
       
       // Task №6
       // Setting of the dim. of the array 
       int k=14;                           
       // call for task №6
       System.out.println("The balance of the parts of the array :   "+ check_balance(k));
       System.out.println();

       // call for task №5
       min_max();                          

       // call for task №4
       diagonal_num();                     
    }

      // Task 7 Start of the executing;
    static public void shift_array(int param_size, int n_shift) {  
        int n_tmp = 0;
        int n_prev = 0;
        int n_next = 0;
        int[] shift_arr = new int[param_size];

        for (int i = 0; i < shift_arr.length; i++)
            shift_arr[i] = (int) Math.round(Math.random() * 10); // Filling of the started array;

        System.out.println("The task 7");
        System.out.println("The started array :");

        for (int i = 0; i < (int) shift_arr.length; i++)
            System.out.print(" " + shift_arr[i] + ";");
            System.out.println();

        if (n_shift != 0 && shift_arr.length >= Math.abs(n_shift)) { // Checking of the shift: >0, !=0

            for (int i = 0; i < shift_arr.length; ) {

                if (i + n_shift >= shift_arr.length){    // if out of the array;

                n_tmp =(i + n_shift)- shift_arr.length; //calculating of the shift;

                } else {

                    n_tmp = (i + n_shift);    // still staying in the range;
                }
            n_prev = n_next;

            n_next = shift_arr[n_tmp]; // saving of the value;

            if (i == 0) {              // special condition - the first item of the set;

            shift_arr[n_tmp] = shift_arr[i];

            } else {

            shift_arr[n_tmp] = n_prev;
            }
                i=i+n_shift;          // out from the ordinary sorting (n+1);
            }

            if(n_shift!=1) {          // the start of more the complicated sorting (n+2);
                                      // the same stages as at previous case;
                n_prev = 0;
                n_next = 0;

                for (int i = 1; i < shift_arr.length; ) {

                    if (i + n_shift >= shift_arr.length) {

                        n_tmp = (i + n_shift) - shift_arr.length;

                    } else {

                        n_tmp = (i + n_shift);
                    }
                    n_prev = n_next;

                    n_next = shift_arr[n_tmp];

                    if (i == 1) {
                        shift_arr[n_tmp] = shift_arr[i];

                    } else {
                        shift_arr[n_tmp] = n_prev;
                    }
                    i = i + n_shift;

                }
            }
            System.out.println("The shift of the numb:  " + n_shift);
            System.out.println("The length of the array:  " + shift_arr.length);
            System.out.println("The shifted array :");
            for (int i = 0; i < (int) shift_arr.length; i++)
                System.out.print(" " + shift_arr[i] + ";");
            System.out.println();
        } else{
            System.out.println("The task 7");
            System.out.println("The shift of the numb must not be :  " + n_shift);
            System.out.println("Please set the shift again!");
        }
    }

    // Task 6 Start of the executing;
    static public boolean check_balance(int k){         
        int sum =0;
        int sum1 =0;
        int[] send_arr= new int [k];

        for (int i=0;i<send_arr.length;i++)
        send_arr[i]=(int) Math.round(Math.random() * 10); // Filling of the array;

        for (int i=0;i<(int)send_arr.length/2;i++) {               // Calculating of the sum for "the left part"
            sum = sum+send_arr[i];                                 // 1/2 of the length of the array;
          //  System.out.println(send_arr[i]);                     // for the test only;
        }
        if (k%2 == 0) {                                            // if dividing on the whole number;
            for (int i = (int) send_arr.length - 1; i >= (int) send_arr.length / 2; i--) { // i>= 1/2 of len.of array
                sum1 = sum1 + send_arr[i];                                          // to include the mid.part of array;
            }
        } else{                                                     //if not div.on the whole number;
            for (int i = (int) send_arr.length - 1; i > (int) send_arr.length / 2; i--) {// the mid part of array isn't'
                sum1 = sum1 + send_arr[i];                        // including, i> 1/2 of len.of array
            }
        }
        System.out.println();
        System.out.println("The task 6");
        System.out.println("The array :");
        for (int i=0;i<(int)send_arr.length;i++)
        System.out.print(" "+ send_arr[i] + ";");
        System.out.println();
        System.out.println("The length of the array :  " + send_arr.length);
        System.out.println("The sum of the 'left part' of the array :  " + sum);
        System.out.println("The sum of the 'right part' of the array:  "+ sum1);

        if (sum==sum1){
            return true;
        } else{
            return false;
        }
    }

    // Task 5 Start of the executing;
    public static void min_max() {       

        int n_min, n_max;
        int[] nums = {-150, 123, -45, 0, -19, -1, 99, -9, -21, 1};
        n_min = n_max = 0;

        for (int i = 0; i < 10; i++) {
            if (nums[i] > n_min && nums[i] > n_max)
                n_max = nums[i];
            if (nums[i] < n_min)
                n_min = nums[i];
        }

        System.out.println("The task 5");
        System.out.println("The array :");
        for (int i = 0; i < 10; i++)
            System.out.print(""+ nums[i]+";");
        System.out.println();
        System.out.print("Max number :" + n_max );
        System.out.println();
        System.out.print("Min number :" +n_min);
        System.out.println();
    }
    
    // Task 4 Start of the executing;	
    public static void diagonal_num() {          
        int k=6;
        int[][] diagonal_num = new int[k][k];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                if (i == j) {
                    diagonal_num[i][j] = 1;
                } else {
                    diagonal_num[i][j] = i+j + 1;
                }
            }
        }
        System.out.println();
        System.out.println("The task 4");
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++)
               System.out.print(diagonal_num[i][j] + ";");
               System.out.println();
        }
    }
 
}
