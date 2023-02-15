
package projetopetshop;
public class Cliente extends Pessoa implements IPessoa{


    private String cpf;
    private String telefone;
    private String email;
    
  
    public void exibir() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("CPF: " + this.getCpf());
    }
    
    
   
    public String getCpf() {
        return cpf;
    }

   
    public void setCpf(String cpf) {
         if(cpf.equals(""))
        {
            throw new StringVazioException();
        }
        else
        {
        this.cpf = cpf;
    }
    }
   

   
    public String getTelefone() {
        return telefone;
    }

    
    public void setTelefone(String telefone) {
     if(telefone.equals(""))
        {
            throw new StringVazioException();
        }
        else
        {
        this.telefone = telefone;
    }
    }
   

   
    public String getEmail() {
        return email;
    }

   
    public void setEmail(String email) {
     if(email.equals(""))
        {
            throw new StringVazioException();
        }
        else
        {
        this.email = email;
    }
    }
}
