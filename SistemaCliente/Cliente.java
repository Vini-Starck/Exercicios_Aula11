package SistemaCliente;

public class Cliente {
    // Atributo
    
    private String nome, email;
    private int telefone;
    private long CPF;
    
    // métodos acessores - getters e setters
    
    // Atribuir valor
    
    /**
     * Atribui um valor ao atributo nome
     * @param nome String
     */
    public void setNome(String nome){
        this.nome=nome;
    }
    
    // Receber valor
    
    /**
     * Retorna o valor do atributo nome
     * @return String
     */
    public String getNome(){
        return this.nome;
    }
    
    /**
     * Atribui valor para o atributo email
     * @param email String
     */
    public void setEmail(String email){
        this.email=email;
    }
    
    /**
     * Retorna o valor do atributo email
     * @return String
     */
    public String getEmail(){
        return this.email;
    }
    
    /**
     * Atribui valor para o atributo telefone
     * @param telefone int
     */
    public void setTelefone(int telefone){
        this.telefone=telefone;
    }
    
    /**
     * Retorna o valor do atributo telefone
     * @return int
     */
    public int getTelefone(){
        return this.telefone;
    }
    
    /**
     * Atribui valor para o atributo CPF
     * @param CPF long
     */
    public void setCPF(long CPF){
        this.CPF=CPF;
    }
    
    /**
     * Retorna o valor do atributo CPF
     * @return long
     */
    public long getCPF(){
        return this.CPF;
    }
    
    
}
