import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> Hewan = new LinkedList<String>();

        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");

        System.out.println("Hewan: "+Hewan);

        System.out.println("Hewan yang dihapus : Kelinci, Kambing, Unta");
        Hewan.remove("Kelinci");
        Hewan.remove("Kambing");
        Hewan.remove("Unta");

        System.out.println("Hewan setelah dihapus : "+Hewan);

    }
}