package chap6Exercise;

public class Card {
    private static int number;
    private int cardNumber;
    private String name;

    Card(){
        number++;
        cardNumber = number; //각자 카드 번호를 갖기 위해 인스턴스 변수에 대입
    }

//    public int getNumber(){
//        return number;
//    } 이거로 바로 불러오면 카드 번호 값이 모두 똑같아짐

    public int getCardNumber() {
        return cardNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
