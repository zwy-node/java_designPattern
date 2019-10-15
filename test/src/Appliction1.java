/**
 * @program: stuJava
 * @description:
 * @author: zwy
 * @create: 2019-07-24 18:10
 **/
class Annoyance extends Exception {
}

class Sneeze extends Annoyance {
}

class Appliction1 {

    public static void main(String[] args) throws Exception {
        try {
            try {
                throw new Sneeze();
            } catch (Annoyance a) {
                System.out.println("Caught Annoyance");
                throw a;
            }
        } catch (Sneeze s) {
            System.out.println("Caught Sneeze");
            return;
        } finally {
            System.out.println("Hello World!");
        }
    }
}
