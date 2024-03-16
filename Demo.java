import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        ArrayList obj = new ArrayList();
        obj.addNumber(50);
        obj.addNumber(70);
        obj.addNumber(90);
        obj.addNumber(100);

        System.out.println(Arrays.toString(obj.getArray()));
    }

}

class ArrayList {

    private int[] list;
    private int currentSize = 0;
    private int[] newArray;

    public void addNumber(int number) {

        if (list == null || list.length == currentSize) {

            resizeArray();
        }

        list[currentSize] = number;
        currentSize++;

    }

    public int[] resizeArray() {

        int newSize;

        if (list == null) {
            newSize = currentSize + 1;

        }

        else {
            newSize = currentSize + 1;
        }

        newArray = new int[newSize];
        if (list != null) {
            System.arraycopy(list, 0, newArray, 0, currentSize);
        }
        list = newArray;
        return list;
        // System.out.println(list);
    }

    // public int[] getList() {

    // return list;
    // }

    public int[] getArray() {

        return list;

    }

}
