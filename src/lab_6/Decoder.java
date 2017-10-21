package lab_6;

import java.util.HashSet;
 
public class Decoder {
 
  public static void main(String[] args) {
	  decode();
  }
 
  static void decode() {
 
    int count = 0;
 
    for (int x1 = 1; x1 <= 1; x1++)
      for (int x2 = 0; x2 <= 9; x2++)
        for (int x3 = 2; x3 <= 9; x3++)
          for (int x4 = 2; x4 <= 9; x4++)
            for (int x5 = 2; x5 <= 9; x5++)
              for (int x6 = 2; x6 <= 9; x6++)
                for (int x7 = 0; x7 <= 9; x7++)
                  for (int x8 = 2; x8 <= 9; x8++)
                    for (int x9 = 2; x9 <= 9; x9++) {
 
                      HashSet<Integer> hs = new HashSet<Integer>();
                      hs.add(x1);
                      hs.add(x2);
                      hs.add(x3);
                      hs.add(x4);
                      hs.add(x5);
                      hs.add(x6);
                      hs.add(x7);
                      hs.add(x8);
                      hs.add(x9);

                      if (hs.size() < 9) continue;
 
                      if (x3 + x7 != x1 * 10 + x2) continue;
 
                      int x3x4 = x3 * 10 + x4;

                      if (x3x4 >= 100) continue;

                      if (x5 * 10 + x6 + x8 * 10 + x9 != x3x4) continue;
 
                      System.out.println("Найдено решение: " + x3+x5+x6 + " + " + x7+x8+x9 + " = " + x1+x2+x3+x4 + ".");
                      count++;
                    }
 
    System.out.print("Перебор вариантов закончен. ");
    System.out.println("Число найденных решений " + count + ".");
  }
}