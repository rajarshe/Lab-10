import static org.junit.Assert.*;

import org.junit.Test;

 

public class testSelectionSort{

      @Test

      public void test() {

            testPositive();

            testNegative();

            testMixed();

            testDuplicates();

      }

      public testSelectionSort() {

      }

      private void testPositive() {

            int[] arr = new int[5];

            arr[0] = 8;

            arr[1] = 9;

            arr[2] = 7;

            arr[3] = 10;

            arr[4] = 2;
           

            int[] Sortedarr = new int[5];

            Sortedarr[0] = 2;

            Sortedarr[1] = 7;

            Sortedarr[2] = 8;

            Sortedarr[3] = 9;

            Sortedarr[4] = 10;

           

            SelectionSort SelectionSort = new SelectionSort ();
            System.out.print ("Sorted Positive: ");
            
      }

      private void testNegative() {

            int[] arr = new int[5];

            arr[0] = -8;

            arr[1] = -9;

            arr[2] = -7;

            arr[3] = -10;

            arr[4] = -2;

           

            int[] Sortedarr = new int[5];

            Sortedarr[0] = -10;

            Sortedarr[1] = -9;

            Sortedarr[2] = -8;

            Sortedarr[3] = -7;

            Sortedarr[4] = -2;

           

            SelectionSort SelectionSort = new SelectionSort ();

      }

      private void testMixed() {

            int[] arr = new int[5];

            arr[0] = 8;

            arr[1] = -9;

            arr[2] = 0;

            arr[3] = -10;

            arr[4] = -2;

           

            int[] Sortedarr = new int[5];

            Sortedarr[0] = -10;

            Sortedarr[1] = -9;

            Sortedarr[2] = -2;

            Sortedarr[3] = 0;

            Sortedarr[4] = 8;

           

            SelectionSort SelectionSort = new SelectionSort ();

      }

      private void testDuplicates() {

            int[] arr = new int[5];

            arr[0] = 8;

            arr[1] = 10;

            arr[2] = 2;

            arr[3] = 10;

            arr[4] = 2;

           

            int[] Sortedarr = new int[5];

            Sortedarr[0] = 2;

            Sortedarr[1] = 2;

            Sortedarr[2] = 8;

            Sortedarr[3] = 10;

            Sortedarr[4] = 10;

           

            SelectionSort SelectionSort = new SelectionSort ();

      }

 

}