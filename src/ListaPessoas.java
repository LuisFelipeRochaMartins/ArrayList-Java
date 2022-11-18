import java.util.ArrayList;
import java.util.List;

public class ListaPessoas {
    List<Pessoa> lista = new ArrayList<Pessoa>();

    public List<Pessoa> getLista() {
        return lista;
    }

    public void setLista(List<Pessoa> lista) {
        this.lista = lista;
    }

    public boolean add(Pessoa pessoa){
        if(verificaNome(pessoa)) {
            lista.add(pessoa);
            return true;
        }
        return false;
    }
    public boolean verificaNome(Pessoa novo){
        for(Pessoa pessoa : lista){
            if(pessoa.verificaNome(novo)){
                return false;
            }
        }
        return true;
    }
    public void removeNome(Pessoa novo){
        lista.remove(novo);
    }

    public void alterarPessoa(Pessoa novo){
        int pos = lista.indexOf(novo);
        lista.remove(novo);
        lista.add(pos,novo);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ListaPessoas{");
        sb.append("lista=").append(lista);
        sb.append('}');
        return sb.toString();
    }
}
