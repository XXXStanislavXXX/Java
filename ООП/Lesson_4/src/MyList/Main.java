package MyList;

public class Main {
    public static void main(String[] args) {
        GBList<Number> gbList = new GBArrayList<>();
        gbList.add(1);
        gbList.add(3.1415926);
        gbList.join(1).join(2).join(3);
        System.out.println(gbList);
        gbList.update(0, 1.213213f);
        System.out.println(gbList.size());
        gbList.remove(2);
        System.out.println(gbList.size());
        System.out.println(gbList);
        gbList.update(0, 1.213213f);
        System.out.println(gbList.get(2));
        gbList.update(0, 1.213213f);
        System.out.println(gbList);
        //gbList.get(12);
    }
}
