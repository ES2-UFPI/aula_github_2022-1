public class Conta {
    private double dinheiro;
    
    public String sacar(double value) {
        if(value > this.dinheiro ){
            return "O valor execede o limite";
        }else{
            this.dinheiro = this.dinheiro - value;
            return "Saque feito com sucesso";
        }
    }

    public void depositar(double value) {
        this.dinheiro = this.dinheiro + value;
    }

    public String toString(){
        return "Saldo: "+ dinheiro;
    }
}
