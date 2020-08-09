import java.lang.*;

public class Main {
    public static void main(String[] args) {

        LinkedList list=new LinkedList();
        list.addValue(32);
        list.addValue(11);
        list.addValue(412);
        list.printList();
        list.removeAt(0);
        list.printList();

        LinkedList listChar=new LinkedList('c');
        listChar.addValue('h');
        listChar.addValue('a');
        listChar.addValue('r');
        listChar.removeAt(2);
        listChar.printList();
    }
}
