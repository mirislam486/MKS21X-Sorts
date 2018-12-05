public class Sorts{

  public static void selectionsort(int[] ary){
    int min = ary[0];
    int storeIdx = 0;
    for(int i = 0; i < ary.length; i++){
      for(int k = i + 1; k < ary.length; k++){
        storeIdx = k;
        if(ary[i] < min){
          min = ary[i];
        }
      }
      ary[storeIdx] = ary[i];
      ary[i] = min;
    }
    System.out.println(ary);
  }
}
