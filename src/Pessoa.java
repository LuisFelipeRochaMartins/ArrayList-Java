import java.util.Date;

public class Pessoa {

    private String nome;

    private String email;

    private Date nascimento;

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    public Pessoa(){

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
            this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean verificaTamanho(String nome){
        if(nome.length()>=3){
            return true;
        }
        return false;
    }
    public boolean verificaNome(Pessoa novo){
        if(novo.getNome().equalsIgnoreCase(this.nome)){
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pessoa{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
