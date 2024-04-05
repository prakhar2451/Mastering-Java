
/**
 * ControlFlowExample
 */
public class ControlFlowExample {

    public static void main(String[] args) {

        int x = 10;
        
        // if-else statement

        if (x > 0) {
            System.out.println("Postive number");
        } else if(x < 0){
            System.out.println("negative number");
        } else {
            System.out.println("zero");
        }

        // switch case statement

        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");                
                break;
            case 'B':
                System.out.println( "Good job!" );     
                break; 
            case 'C':
                System.out.println( "You passed" );  
                break;
            default:
                break;
        }

        // for loop

        for (int i = 0; i<5; i++) {
            System.out.println("Iteration " + (i + 1));
        }

        // while loop

        int count = 0;
        while ( count  < 10 ) {
            System.out.println( "Value of count : " + count );
            count++;
        }

        // do-while loop
        int num = 6;
        do {
            System.out.println("Number : " + num);
            num--;
        } while(num > 0);

    }
}