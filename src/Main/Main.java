// Copyright 2020 Techtorial LLC
package Main;

import java.util.Arrays;

public class Main {

//	/**
//	 * Write a method that will accept an array as parameter
//	 * and return maximum value from array.
//	 * <p>
//	 * for example:
//	 * {3,9,55,73,99,2,10} -> return 99
//	 *
//	 * @param arrays of numbers
//	 * @return maximum value from array
//	 */
	public int maxNum(int[] arrays) {
		int[] array = {3, 9, 55, 73, 99, 2, 10};
		Arrays.sort(arrays);
		int maxNumber = arrays[arrays.length - 1];

		//TODO
		return maxNumber;
	}

//	/**
//	 * Write a method that received an integer array and returns the sum of all
//	 * odd numbers in the array
//	 *
//	 * @param array;
//	 * @return sum of odd numbers in the array
//	 */
	public int sumOfOdds(int[] array) {
		int sum = 0;
		// TODO
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1) {
				sum += array[i];
			}
		}
		return sum;
	}

//	/**
//	 * Write a method that takes an array of integers and returns a boolean. You
//	 * method should return true if array contains three consecutive even number
//	 * or three consecutive odd numbers. Return false otherwise.
//	 * threeAmigos([2, 1, 3, 5]) -> true
//	 * threeAmigos([2, 1, 2, 5]) -> false
//	 * threeAmigos([2, 4, 2, 5]) -> true
//	 */

	public boolean threeAmigos(int[] array) {

		// TODO

		for (int i = 0; i + 2 < array.length; i++) {
			if (array[i] % 2 == 0 && array[i + 1] == 0 && array[i + 2] == 00) {
				return true;

			}
			if (array[i] % 2 != 0 && array[i + 1] != 0 && array[i + 2] != 0) {
				return false;
			}

		}
		return false;
	}



//		for (int i = 0; i < array.length; i++) {
//			if (i == array.length - 2) {
//				continue;
//			}
//			if (i == array.length - 1) {
//				continue;
//			}
//			if (array[i] % 2 == 0)
//				if (array[i + 1]%2 == 0) {
//					if (array[i + 2] % 2 == 0) {
//						return true;
//					}
//				}
//
//			if (array[i] % 2 != 0)
//				if (array[i + 1]%2 != 0) {
//					if (array[i + 2] % 2 != 0) {
//						return true;
//					}
//				}
//		}
//		return false;
//}





	
//	/**
//	 * Write a method that takes an array of ints and returns a boolean.
//	 * Return true if that array contains two numbers anywhere in the array
//	 * whose sum is 100
//	 * {50,45,20}
//	 * @param nums
//	 * @return boolean
//	 */
	    public boolean make100With2(int[] nums){
//		//OUTER: for(int i=0; ){
//		for(int i=0;i<nums.length;i++){
//			for ( int j=1; j<nums.length; j++ ){
//				if (nums[i]+nums[j]==100){
//					return true;
//
//				}
//			}
//
//			}
//		return false;
//		}




		int[] maxNum1 = {6, 99, 3, 45, 0, -234};
		boolean flag = false;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == 100) {
					flag = true;

				}
			}

		}
		return flag;
	}



//
//	/**
//	  *
// 	  * Write a method switchPairs that switches the order of values in an Array of Strings in a pairwise fashion.
//	  * Your method should switch the order of the first two values,
//	  * then switch the order of the next two, switch the order of the next two, and so on.
//	  *
//	  * {"four", "score", "and", "seven", "years", "ago"}-> return {"score", "four", "seven", "and", "ago", "years"}
//	  * {"to", "be", "or", "not", "to", "be", "hamlet"} -> return {"be", "to", "not", "or", "be", "to", "hamlet"}
//	  *
//	  * Method that is using String[]
//	  * @param
//	  * @return switched pairs array
//	  */
	public String[] switchPairs(String[] list){
		//TODO


		return null;
	}
	
//	/**
//	 *
//	 * @param array of book pages
//	 * @return page that is out of order; if all pages in the order return -1;
//	 *
//	 * For example you given an array
//	 *  int[]pages={20,100,55,78,44,90}; -> method will return 55
//	 *	int[]pages2={20,21,22,78,44,90};-> method will return 44
//	 *  int[]pages3={20,21,22,78,84,90};-> method will return -1
//	 */
	       public int outOfOrder(int[] arr){
		//TODO

//		for(int i =0; i+1< arr.length;i++){
//			if (arr[i]>=arr[i+1]){
//				return arr[i+1];
//			}
//		}
		return -1;
	}

//	/**
//	 *
//	 * Write a method that takes an array of integers and returns a boolean.
//	 * Return true if the array contains 1 and 2 later somewhere in the array,
//	 * and 1 has to come before 2.
//	 *
//	 * contains12([1, 3, 2]) -> true
//	 * contains12([3, 1, 2]) -> true
//	 * contains12([3, 1, 4, 5, 2]) -> true
//	 * contains12([3, 2, 4, 5, 1]) -> false
//	 *
//	 * @param nums
//	 * @return boolean
//	 */

	public boolean contains12(int[] nums) {
		int indexOf1 = -1;//wev need to get smallest number for 1//getbto index number of first 1in the array
		int indexOf2 = -1;//we need to get biggest index number for 2
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1 && indexOf1 == -1) {
				indexOf1 = i;

			}

			if (nums[i] == 2) {
				return true;
			}
		}
		return false;
	}
		// TODO
//
//
//		return false;
//	}
	
//	/**
//	 * Write a method that will accept array of integers as parameter
//	 * and will return one long number of combined numbers.
//	 * If the number is negative accept it as positive
//	 *
//	 * For example:
//	 * {2,66,3,90,1,-10} -> return int 266390110
//	 * {0,34,5,3,8} -> return int 34538
//	 *
//	 * @param array of numbers
//	 * @return combined numbers of array
//	 */
	public long combineNumbers(int[] numbers) {
		//TODO
		return -1;
	}
	
//	/**
//	 * Write a method that will accept one array as parameter and will remove duplicates
//	 * and return will have unique numbers inside
//	 *
//	 * for example:
//	 * {3,6,8,3,2,7,9,9} -> return {3,6,8,2,7,9}
//	 * {-1,5,8,-1,-55,55,0} -> return {-1,5,8,-55,55,0}
//	 *
//	 * @param array of numbers
//	 * @return array of unique numbers
//	 */
	public int[] removeDuplicates(int[] nums) {
		//TODO
		return null;
	}

}
