package chap6Exercise;

public class Test {
    public static void main(String[] args){
        Person p1 = new Person("기모찌", 15000);
        StarCoffee s1 = new StarCoffee();
        p1.takeStarCoffee(s1);
        p1.showInfo();
        s1.showInfo();
        System.out.println();

        Person p2 = new Person("어려워",10000);
        BeanCoffee b1 = new BeanCoffee();
        p2.takeBeanCoffee(b1);
        p2.showInfo();
        b1.showInfo();
        System.out.println();

        Person p3 = new Person("두번째 기모삐", 10000);
        p3.takeStarCoffee2(s1);
        p3.showInfo();
        s1.showInfo();
        System.out.println();

        p2.takeStarCoffee(s1);
        p2.showInfo();
        s1.showInfo();
        System.out.println();

        p3.takeStarCoffee(s1);
        p3.showInfo();
        s1.showInfo();
    }
}
