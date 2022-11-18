import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListaPessoas l = new ListaPessoas();

        Pessoa p = new Pessoa( "Luis", "luisitogameplays@gmail.com");

        String domain = p.getEmail().split("@")[1];

        l.add(p);

        p = new Pessoa( "Ls", "Luisão");

        l.add(p);

        List<Pessoa> lista = l.getLista();

        for(Pessoa item: lista)
            System.out.println(item.toString());
    }
}
