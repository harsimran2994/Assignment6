
package assignment14;

import java.util.Scanner;
public class Assignment14 {


    public static void main(String[] args) {
        int studentCount ;
        int subjectCount ;
       
        
        Scanner keyboard=new Scanner(System.in);
        
        System.out.println("Hello User.");
        System.out.print("How many students (rows)?");
        studentCount=keyboard.nextInt();
        System.out.print("How many subjectss (columns)?");
        subjectCount=keyboard.nextInt();
         int[][] marks=new int[studentCount][subjectCount];
        
        for(int i=0;i<studentCount;i++){
            System.out.println("Student" +(i+1));
            
            for(int j=0;j<subjectCount;j++){
                System.out.print("Mark" +(j+1)+":");
                marks[i][j]=keyboard.nextInt();
            }
        }
        
         for(int i=0;i<studentCount;i++){
            
            
            for(int j=0;j<subjectCount;j++){
                System.out.print("|------");
               
            }
            System.out.println("|");
            for(int j=0;j<subjectCount;j++){
                System.out.print(String.format("| %4d ",marks[i][j]));
            }
            System.out.println("|");
        }
         for(int k=0;k<subjectCount;k++){
                System.out.print("|------");
               
            }
            System.out.println("|");
        
    }
    
}
