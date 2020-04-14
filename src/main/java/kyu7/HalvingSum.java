package kyu7;

public class HalvingSum {
    /*
    Task
    Given a positive integer n, calculate the following sum:

    n + n/2 + n/4 + n/8 + ....
    All elements of the sum are the results of integer division.

    Example
        25  =>  25 + 12 + 6 + 3 + 1 = 47
*/

        public int halvingSum(int n){
            int divisionResult = n;
            int halvingSum = 0;
            while (divisionResult != 1){
                halvingSum += divisionResult;
                divisionResult /= 2;
            }
            halvingSum += divisionResult;

            return halvingSum;
        }
    }

