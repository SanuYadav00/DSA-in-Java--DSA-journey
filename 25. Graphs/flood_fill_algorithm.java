/* leetcode 733
 Given a m*n integer grid image where image[i][j] represents the pixel value of the image.
 You are also given three integers sr, sc and color. You should perform a flood fill on the image starting 
 from the pixel image[sr][sc].
 To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting 
 pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with
 the same color), and so on. Replace the color of all the aforementioned pixels with color.

 image=[[1,1,1],
        [1,1,0],
        [1,0,1]]
   sr=1, sc=1, color=2
   
   ans=[[2,2,2],
        [2,2,0],
        [2,0,1]]

 */
// TC O(m*n)
public class flood_fill_algorithm {
 public static  int[][] floodFill(int [][] image, int sr, int sc, int color) {
  boolean vis[][]=new boolean[image.length][image[0].length];
  int orgCol = image[sr][sc];
        if (orgCol != color) {  
            helper(image, sr, sc, color, vis, orgCol);
        }
  return image;
 }

 public static void helper(int [][] image, int sr, int sc, int color,boolean vis[][],int orgCol) {
   if (sr<0 || sc<0 || sr>=image.length || sc>=image[0].length
   || vis[sr][sc] || image[sr][sc]!=orgCol) {
     return;
   }

   image[sr][sc]=color;
   vis[sr][sc]=true;

 // left
 helper(image,sr,sc-1,color,vis,orgCol);
 //right
 helper(image,sr,sc+1,color,vis,orgCol);
 //up
 helper(image,sr-1,sc,color,vis,orgCol);
 //down
 helper(image,sr+1,sc,color,vis,orgCol);
}
  public static void main(String args[]) {
    int image[][]={{1,1,1},
                   {1,1,0},
                   {1,0,1}};
    int sr=1, sc=1, color=2;
    int result[][]=floodFill(image,sr,sc,color);
    System.out.println("The output after floodFill is:");
    for (int i=0;i<result.length;i++) {
       for (int j=0;j<result[0].length;j++) {
        System.out.print(" "+result[i][j]);
       }
       System.out.println();
    }             
  }
}
