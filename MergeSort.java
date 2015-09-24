public class MergeSort
{
  private int[] numbers, assistingArray;
  
  private int number;
  
  public static void main (String [] args){
    MergeSort mSort = new MergeSort();
    int [] arr = {0,1,6,2,3,57,54,2,1};
    mSort.startSorting(arr);
    for(int i = 0; i<arr.length; i++){
      System.out.println(mSort.numbers[i]);
    }
  }

  public void startSorting(int[] values) {
    this.numbers = values;
    number = values.length;
    this.assistingArray = new int[number];
    arrMerger(0, number - 1);
  }

  private void arrMerger(int low, int high) {
    if (low < high) {
      int middle = low + (high - low) / 2;
      arrMerger(low, middle);
      arrMerger(middle + 1, high);
      mergeSort(low, middle, high);
    }
  }

  private void mergeSort(int low, int middle, int high) {
    for (int i = low; i <= high; i++) {
      assistingArray[i] = numbers[i];
    }

    int i = low;
    int j = middle + 1;
    int k = low;
    while (i <= middle && j <= high) {
      if (assistingArray[i] <= assistingArray[j]) {
        numbers[k] = assistingArray[i];
        i++;
      } else {
        numbers[k] = assistingArray[j];
        j++;
      }
      k++;
    }
    while (i <= middle) {
      numbers[k] = assistingArray[i];
      k++;
      i++;
    }

  }
}
