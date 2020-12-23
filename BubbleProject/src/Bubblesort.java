import java.util.*;

public class Bubblesort {

	public void bubbleSort(int[] a) {

		      boolean swapped = true;

		      int j = 0;

		      int tmp;

		      while (swapped) {

		            swapped = false;

		            j++;

		            for (int i = 0; i < a.length - j; i++) {                                       

		                  if (a[i] > a[i + 1]) {                          

		                        tmp = a[i];

		                        a[i] = a[i + 1];

		                        a[i + 1] = tmp;

		                        swapped = true;

		                  }

		            }                

		      }

	}}