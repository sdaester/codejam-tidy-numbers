package algoritmos.solution;

import algoritmos.FromScannedLineToLine;
import algoritmos.ReadFile;

import java.util.Scanner;

public class Solution implements FromScannedLineToLine{
  public String process(Scanner in) {
    return "out";
  }

  public static void main(String[] args) {
    new ReadFile().process(new Solution());
  }

}
