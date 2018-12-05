public class Sort{ 

  public static void selectionsort(int[] ary){
    int[] output = new int[ary.length];
    for(int idx = 0; idx < ary.length; i++){
      int minimum = ary.findMin(ary);
      output[i] = minimum;
      ary = ArrayUtils.removeElement(ary, minimum);
    }
    return ary;
  }

  public static int findMin(int[] ary){ //Helper function to find the minimum
    int min = ary[0];
    for(int i = 0; i < ary.length; i++){
      if(ary[i] < min){
        min = ary[i]
      }
      ary[i] = ary[i];
    }
    return min;
  }
}
