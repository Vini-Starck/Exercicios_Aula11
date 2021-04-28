package SistemaCliente;

import java.util.Scanner;

public class metodos {
    
    
    public static void inserir(Cliente[]cliente){
        
        Scanner leitor=new Scanner(System.in);
        for(int i=0; i<cliente.length;i++){
            cliente[i]=new Cliente();
            System.out.println("Nome do "+(i+1)+"º cliente: ");
            cliente[i].setNome(leitor.next());
            System.out.println("Email do "+(i+1)+"º cliente: ");
            cliente[i].setEmail(leitor.next());
            System.out.println("CPF do "+(i+1)+"º cliente: ");
            cliente[i].setCPF(leitor.nextLong());
            System.out.println("Telefone do "+(i+1)+"º cliente: ");
            cliente[i].setTelefone(leitor.nextInt());
        }
        
    }
    public static void exibir(Cliente[]cliente){
        
        for(int i=0; i<cliente.length;i++){
            System.out.println("\nNome do "+(i+1)+"º cliente: "+cliente[i].getNome());
            System.out.println("\nEmail do "+(i+1)+"º cliente: "+cliente[i].getEmail());
            System.out.println("\nCPF do "+(i+1)+"º cliente: "+cliente[i].getCPF());
            System.out.println("\nTelefone do "+(i+1)+"º cliente: "+cliente[i].getTelefone());
        }
        
    }
    
    
    
}
