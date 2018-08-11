package week1.day1;

import java.util.Scanner;

public class StudentsData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] studentsList = {"sindhuja","rani","akbar","gopi","chin"};
		int i;
		int[] ageList = {24,25,26,27,28};
/*		int[] ageList = {24,25,26};
		char[][] grades = {{'A','B','F','C','E'},
				           {'A','A','A','A','A'},
				           {'B','B','B','B','B'}};
*/		
		for(i=0; i<=4; i++)
		{
			System.out.println( "name is"  + " " + studentsList[i] +" " + "Age is" + " " + ageList[i]);
		}
		/*System.out.println("Whose data you want");
		Scanner scr = new Scanner(System.in);
		int index = scr.nextInt();
		index = index-1;
		System.out.println(studentsList[index] +"who is "+ ageList[index] + "years of old" +  grades[index][3]);
*/
	}

}
