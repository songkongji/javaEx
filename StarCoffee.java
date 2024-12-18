package chap6Exercise;

public class StarCoffee {
    public int money;
    public String name;
    public int customerCount;

    StarCoffee(){
        name = "별다방";
    }

    public String getName() {
        return name;
    }

    public String sell(int money){
        this.money += money;
        customerCount++;
        if(money == Coffee.starAmericano){
            return "별다방 아메리카노";
        } else{
            return "별다방 라떼";
        }
    }

    public void showInfo(){
        System.out.println(name + "은 " + customerCount + "명에게 " + money + "원 벌었습니다.");
    }
}
