package Lab3_2;


import java.util.ArrayList;

public class MainClass{

	public static void main (String[] args){
	    DoublyList list = new DoublyList();
        list.addFirstValue(1);
        list.addFirstValue(2);
        list.addLastValue(3);
        list.addLastValue(4);
        list.addLastValue(5);
		list.addLastValue(6);
		list.addLastValue(7);
        System.out.println("getFirstValue = "+ list.getFirstValue());
        System.out.println("getLastValue = " + list.getLastValue());
        System.out.println("PrintAll:");
        list.print();
        System.out.println("getFirstValueAndDelete = "+ list.getFirstValueAndDel());
        System.out.println("PrintAll:");
        list.print();
        System.out.println("getLastValueAndDelete = "+ list.getLastValueAndDel());
        System.out.println("PrintAll:");
        list.print();
        System.out.println("isContains 8?: " + list.isContainsValue(8));
        System.out.println("isContains 6?: " + list.isContainsValue(6));
        System.out.println("find 9 and 5 and delete this and after PrintAll:");
        list.findAndDel(9);
        list.findAndDel(5);
        list.print();
        list.addArrBeforeList(new int[]{1, 2, 3, 4, 5, 6, 7});
        System.out.println("addArrBeforeList(new int[]{1, 2, 3, 4, 5, 6, 7} and PrintAll:");
        list.print();
        System.out.println("addCollectionBerforeList");
        ArrayList  <Integer> arrList = new ArrayList<>();
        arrList.add(11);
        arrList.add(22);
        arrList.add(33);
        list.addCollectionBeforeList(arrList);
        list.print();
        list.addArrAfterList(new int[]{22, 22, 23, 24, 25, 26, 27});
        System.out.println("addArrAfterList(new int[]{22, 22, 23, 24, 25, 26, 27} and PrintAll:");
        list.print();
        System.out.println("addCollectionAfterList(arrList)");
        list.addCollectionAfterList(arrList);
        list.print();
        System.out.println("isertByIndex: ");
        list.insertByIndex(0,100);  //ставка первым значением
        list.insertByIndex(15,55); //ставка в середину
        list.insertByIndex(25,99); //вставка в конец
        //list.isertByIndex(28,99);  //имитация ошибки
        list.print();
            System.out.println("printRevers(): ");
          list.printRevers();
            DoublyList list2 = new DoublyList();
            list2.addFirstValue(333);
            list2.addFirstValue(444);
            list2.addFirstValue(555);
            list2.print();
            System.out.println("mergeAtFirst(list2)");
            list.mergeAtFirst(list2);
            list.print();
            list2.print();
            System.out.println("mergeAtLast(list2)");
            DoublyList list3 = new DoublyList();
            list3.addLastValue(666);
            list3.addLastValue(777);
            list3.addLastValue(888);
            list.mergeAtLast(list3);
            list.print();
            list3.print();
    }
}