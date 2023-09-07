import java.util.*;
class Main {
  public static void main(String[] args) {
    Random r = new Random();
    //ArrayList사용
    ArrayList<Integer> list = new ArrayList<>();
    System.out.println(list.size());
    list.add(5);
    list.add(6);
    list.add(7);
    list.add(8);
    list.remove(2);
    list.clear();
    System.out.println(list.toString());
    while(list.size()<6){
      int num = r.nextInt(45)+1;
      if(list.contains(num))
        continue;
      list.add(num);
    }
    System.out.println(list.toString());

    //hashset
    HashSet<Integer> hash = new HashSet<>();
    while(hash.size()<6){
      int num = r.nextInt(45)+1;
      hash.add(num);
    }
    System.out.println(hash.toString());
  }
}