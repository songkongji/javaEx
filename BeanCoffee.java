package chap6Exercise;

public class BeanCoffee {
    public int money;
    public String name;
    public int customerCount;

    BeanCoffee(){
        name = "콩다방";
    }

    public String getName() {
        return name;
    }

    public String sell(int money){
        this.money += money;
        customerCount++;
        if(money == Coffee.BeanLatte){
            return "콩다방 라떼";
        } else {
            return "콩다방 아메리카노";
        }
    }

    public void showInfo(){
        System.out.println(name + "은 " + customerCount + "명에게 " + money + "원 벌었습니다.");
    }
}
