public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private String fone;
    private Conta conta;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public Cliente(String nome, String cpf, String email, String fone, Conta conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.fone = fone;
        this.conta= conta;
    }

   public String toString(){
    return "nome: " + nome +  "\ncpf: "+ cpf+ "\nemail: "+ email + "\nfone: "+ fone +"\nConta: " + conta.toString();
   }
}   
