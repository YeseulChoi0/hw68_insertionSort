import java.util.ArrayList;
public class insertionSort{
  public static void main(String[] commandLine){
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(4);
    list.add(9);
    list.add(0);
    list.add(6);
    list.add(1);
    list.add(14);
    list.add(3);
    System.out.println(list);
    insertionSort(list);
    System.out.println(list);
  }

  public static void insertionSort(ArrayList<Integer> list){
    for (int indexOfInsertion = 1; indexOfInsertion < list.size(); indexOfInsertion++){
      insert1(list, indexOfInsertion);
      // for debugging
      System.out.println("list:" + list);
      }
    }

  public static void insert1(ArrayList<Integer> list, int alreadyInserted){
    int valueToInsert = list.get(alreadyInserted);
    for (int indexToCompare = alreadyInserted-1; indexToCompare >= 0; indexToCompare--){
      // System.out.println(indexToCompare);
      // System.out.println(list);
      if (valueToInsert < list.get(indexToCompare)){
        //System.out.println("Move1");
        shift(list, indexToCompare);
        if (indexToCompare == 0){
          //System.out.println("move2");
          dropValue(list, 0, valueToInsert);
          return;
        }
      }else{
        //System.out.println("move3");
        dropValue(list, indexToCompare + 1, valueToInsert);
        return;
      }
      //System.out.println(list);
    }
  }

  public static void dropValue(ArrayList<Integer> list, int insertIndex, int valueToInsert){
    list.set(insertIndex, valueToInsert);
  }

  public static void shift(ArrayList<Integer> list, int shiftingIndex){
    list.set(shiftingIndex+1, list.get(shiftingIndex));
  }
}
