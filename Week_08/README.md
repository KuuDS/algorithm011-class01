学习笔记
=======


## Quick-Sort

```java

import java.util.Arrays;

public class QuickSort {

  public  static  void sort(int[] seq) {
    sort0(seq, 0, seq.length - 1);

  }

  private static void sort0(int [] seq, int start, int end) {
    // border
    if (start >= end) {
      return;
    }

    int divide = divide(seq, start, end);
    sort0(seq, start, divide - 1);
    sort0(seq, divide + 1, end);

  }

  private static int divide(int[] seq, int start, int end) {
    int i = start;
    int j = end;
    int index = seq[i];

    while( i < j) {
      while ( i < j && seq[j] >= index) {
        j--;
      }

      if (i < j) {
        seq[i] = seq[j];
        i++;
      }

      while( i < j && seq[i] < index) {
        i++;
      }
      if (i < j) {
        seq[j] = seq[i];
        j--;
      }
    }
    seq[i] = index;
    return i;
  }
}
```

