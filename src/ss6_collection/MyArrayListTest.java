package ss6_collection;

public class MyArrayListTest {
    static void main() {
        MyArrayList<String> myArrayList = new MyArrayList(5);

        myArrayList.add("10");
        myArrayList.add("20");
//        myArrayList.add(30);
//        myArrayList.add(40);
//        myArrayList.add(50);
//        myArrayList.add(60);

        System.out.println(myArrayList);
    }
}
