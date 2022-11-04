package Lab3_1;

public class MainClass {
    public static void main(String[] args) {

        List list = new List();
        list.addLastValue("aaaaa");
        list.addLastValue("bbbbb");
        list.addLastValue("ccccc");
        list.addLastValue("ddddd");
        list.addLastValue("eeeee");
        list.print();
        System.out.println();
        System.out.println("list.getLastValue = " +list.getLastValue());
        System.out.println();
        list.addFirstValue("AAAAA");
        list.print();
        System.out.println("getFirstValue");
        System.out.println(list.getFirstValue());
        System.out.println("getFirstValueAndDel");
        System.out.println(list.getFirstValueAndDel());
        System.out.println("printAll");
        list.print();
        System.out.println("getLastValueAndDel");
        System.out.println(list.getLastValueAndDel());
        System.out.println("printAll");
        list.print();
        System.out.println("isContainsValue");
        System.out.println(list.isContainsValue("aaaaa"));
        System.out.println(list.isContainsValue("jjjjj"));
        System.out.println("findAndDel");
        list.findAndDel("bbbbb");
        list.print();
    }
}
