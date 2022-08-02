import java.util.ArrayList;


public class Banco {
    private ArrayList<Cliente> listaCliente;

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
}   
