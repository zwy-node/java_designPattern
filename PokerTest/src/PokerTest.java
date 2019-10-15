import java.util.Arrays;

/**
 * @program: stuJava
 * @description: 主函数
 * @author: zwy
 * @create: 2019-07-23 14:44
 **/
public class PokerTest {
    public static void main(String[] args) {

        Poker poker = new Poker();
        poker.shuffle();                      //洗牌
//        Poker.Card cl = poker.deal(0); //第一次发牌
        //对于非静态内部类 Card
        //只有通过其他外部类Poker对象才能创建Card 对象
//        Poker.Card c2 = poker.new Card("红心", 1);    //自己创建一张牌

//        System.out.println(cl);
//        for(int i = 0; i < 17; i++) {
////            poker.shuffle();
//            Poker.Card c3 = poker.deal(i); //第一次发牌
//            System.out.print(c3 + ", ");
//        }

        Player[] players = new Player[3];
        int random = (int) (Math.random() * players.length);
        int place = 0;
        int size = 0;
        for(int i = 0; i < players.length; i ++) {
            int role = 0;
            if(i == random) {
                role = 1;
            }
            if(role == 0) {
                size = 17;
            } else {
                size = 20;
            }

            players[i] = new Player("玩家" + (i + 1), role);
            players[i].PlayerCard(place, role, poker);
            place += size;
        }


        System.out.print(Arrays.toString(players));
        System.out.println("\nHello World!");
    }
}
