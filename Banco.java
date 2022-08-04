import java.util.ArrayList;
import java.util.Scanner;


public class Banco {
    private ArrayList<Cliente> listaCliente;
    private ArrayList<Conta> contas = new ArrayList<Conta>();

    
    public Banco() {
        listaCliente = new ArrayList();
        
    }
    

    public String adicionarCliente(Cliente cliente){
        for (Cliente item : listaCliente) {
            if(item.getCpf() == cliente.getCpf()){
                return "Cliente já cadastrado";
            }
        }

        listaCliente.add(cliente);
        return "Cliente cadastrado com sucesso";
    }
    
    public String dadosCliente(String cpf){
        for (Cliente cliente : listaCliente) {
            if(cliente.getCpf() == cpf){
                return cliente.toString();
            }
        }
        return "Cliente não encontrado!";
    }

    public String removerCliente(String cpf){
        int index = -1;
        for (int i = 0; i < listaCliente.size(); i++) {
            if(listaCliente.get(i).getCpf() == cpf){
                index  = i;
            }
        }

        if(index != -1 ){
            return "Cliente não encontrado";
        }else{
            listaCliente.remove(index);
            return "Cliente removido";
        }
    }

    public int findConta(int numero){
        for(int i = 0; i < contas.size(); i++){
            if(contas.get(i).getNumero() == numero)
                return i;
        }
        return -1;
    }

    public void visualizarSaldo(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" ==== Visulizar saldo ==== \n");
        
        int index;
        do
        {
            System.out.print("Digite seu numero da conta: ");
            int numero = sc.nextInt();
            index = findConta(numero);
        }
        while(index == -1);
        
        System.out.println("Saldo: " + contas.get(index).getSaldo());

        //sc.close();
    }

    public void saque(){
        
        int index;
        double valor;

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor do saque");
        valor = sc.nextDouble();
       
        do
        {
            System.out.print("Digite seu numero da conta: ");
            int numero = sc.nextInt();
            index = findConta(numero);
        }
        while(index == -1);
        
        contas.get(index).saque(valor);
        //sc.close();
    }
}   
