package chap6Exercise;

public class CardTest {
    public static void main(String[] args){
        Card c1 = new Card();
        c1.setName("내 첫번째 카드");
        System.out.println(c1.getName()+ "의 카드 번호 : " + c1.getCardNumber());

        Card c2 = new Card();
        c2.setName("두번째 카드");
        System.out.println(c2.getName() + "의 카드 번호 : " + c2.getCardNumber());

        Card c3 = new Card();
        c3.setName("세번째 카드");
        System.out.println(c3.getName() + "의 카드 번호 : " + c3.getCardNumber());

        System.out.println(c1.getName() + "첫번째 카드 번호 다시 확인 : " + c1.getCardNumber());
    }

}
