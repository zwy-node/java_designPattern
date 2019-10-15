import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @program: stuJava
 * @description: 创建玩家类
 * @author: zwy
 * @create: 2019-07-23 15:33
 **/
public class Player {
    private String name = "";   //玩家名称
    private int role = 0;       //玩家角色, 0:为平民，1：为地主
    private Poker.Card[] cards;

//    public static Poker initPoker() {
//        Poker poker = new Poker();
//        poker.shuffle();
//        return poker;
//    }

    /**
     * 有参构造函数
     *
     * @param name
     * @param role
     */
    public Player(String name, int role) {
        this.name = name;
        this.role = role;
//        this.PlayerCard();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    void PlayerCard(int place, int role, Poker poker) {
//        Poker poker = initPoker();
        cards = new Poker.Card[17];
        if (role == 1) {
            cards = new Poker.Card[cards.length + 3];
        }

        for (int i = 0; i < cards.length; i++) {
            Poker.Card c3 = poker.deal(i + place);
            cards[i] = c3;
//            System.out.print(c3 + ", ");
        }
    }

    @Override
    public String toString() {
        String roleStr = "";
        switch (role) {
            case 0:
                roleStr = "平民";
                break;
            case 1:
                roleStr = "地主";
                break;
        }

        return String.format("%s[%s]: %s\n", name, roleStr, Arrays.toString(cards));
    }

}
