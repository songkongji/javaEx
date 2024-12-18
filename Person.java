package chap6Exercise;

public class Person {
    public String name;
    public int money;

    Person(String name, int money){
        this.name = name;
        this.money = money;
    }

    public void takeStarCoffee(StarCoffee starCoffee){
        String massage = starCoffee.sell(4000);
        money -= 4000;
        System.out.println(name + "님은 " + massage + "를 4000원 주고 마셨습니다.");

    }

    public void takeStarCoffee2(StarCoffee starCoffee){
        String massage = starCoffee.sell(4300);
        money -= 4300;
        System.out.println(name + "님은 " + massage + "를 4300원 주고 마셨습니다.");
    }

    public void takeBeanCoffee(BeanCoffee beanCoffee){
        String massage = beanCoffee.sell(4500);
        money -= 4500;
        System.out.println(name + "님은 " + massage + "를 4500원 주고 마셨습니다.");
    }

    public void showInfo(){
        System.out.println(name + "님은 " + money + "원 남았습니다.");
    }
}
