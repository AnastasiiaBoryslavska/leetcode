/**
 You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane.
*/

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
    int[] a = coordinates[0];
    int[] b = coordinates[1];
    int x1 = a[0];
    int x2 = b[0];
    int y1 = a[1];
    int y2 = b[1];

    for (int i = 2; i < coordinates.length; i++) {
      int[] curr = coordinates[i];
      int x3 = curr[0];
      int y3 = curr[1];
      if((y2 - y1)*(x3 - x1) != (x2 - x1)*(y3 - y1)) return false;
    }
    return true;
  }
}
