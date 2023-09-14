import java.util.ArrayList;

public class sdsada {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("첫 번째 원소");
        myList.add("두 번째 원소");
        myList.add("세 번째 원소");

        // ArrayList를 인덱스로 순회
        for (int i = 0; i < myList.size(); i++) {
            String element = myList.get(i);
            System.out.println(element);
        }
    }
}

