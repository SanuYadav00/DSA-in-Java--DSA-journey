/* Write a program to place n queens on an N*N chessboard such that no 2 queens 
  can attack each other. Queen can attack in vertical.horizontal and diagonal directions
 */
// time complexity O(n!)
import java.util.*;
public class n_queens {
  static int count=0;
  public static void print(char board[][]) {
    System.out.println("___CHESS BOARD__");
    for (int i=0;i<board.length;i++) {
      for (int j=0;j<board.length;j++) {
         System.out.print(board[i][j]+" ");
      }
      System.out.println();
    }
  }
  public static boolean isSafe(char board[][],int row,int col) {
    // vertical up
    for (int i=row-1;i>=0;i--) {
      if (board[i][col]=='Q') {
        return false;
      }
    }

    // diagonal left up
    for (int i=row-1,j=col-1 ;i>=0 && j>=0 ;i--,j--) {
      if (board[i][j]=='Q') {
        return false;
      }
    }

    // diagonal right up
    for (int i=row-1,j=col+1 ;i>=0 && j<board.length ;i--,j++) {
      if (board[i][j]=='Q') {
        return false;
      }
    }

    return true;

  }

  public static void queens(char board[][],int row) {
    if (row==board.length) {
      print(board);
      count++;
      return;
    }
    for (int j=0;j<board.length;j++) {
      if(isSafe(board,row,j)) {
       board[row][j]='Q';
       queens(board,row+1);
       board[row][j]='.';
      }
    }
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of boxes in each row in chessboard:");
    int n=sc.nextInt();
    char board[][]=new char[n][n];
    for (int i=0;i<n;i++) {
      for (int j=0;j<n;j++) {
        board[i][j]='.';
      }

    }
    queens(board,0);
    System.out.println("The total number of ways of solution is:"+count);
    sc.close();
  }
  
}
