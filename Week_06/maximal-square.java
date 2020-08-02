
class Solution {
  public int maximalSquare(char[][] matrix) {
    if (matrix == null || matrix.length < 1 || matrix[0].length < 1)
      return 0;

    int height = matrix.length;
    int width = matrix[0].length;
    int maxSide = 0;

    int[] dp = new int[width + 1];

    for (char[] chars : matrix) {
      int northwest = 0; // 个人建议放在这里声明，而非循环体外
      for (int col = 0; col < width; col++) {
        int nextNorthwest = dp[col + 1];
        if (chars[col] == '1') {
          dp[col + 1] = Math.min(Math.min(dp[col], dp[col + 1]), northwest) + 1;
          maxSide = Math.max(maxSide, dp[col + 1]);
        } else
          dp[col + 1] = 0;
        northwest = nextNorthwest;
      }
    }
    return maxSide * maxSide;
  }
}