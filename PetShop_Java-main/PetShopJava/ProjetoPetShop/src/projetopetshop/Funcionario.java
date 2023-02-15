package projetopetshop;

public class Funcionario extends Pessoa implements IPessoa {
    private String telefone;
    private String rg;
    private String cargo;

    
    public String getCargo() {
        return cargo;
    }

  
    public void setCargo(String cargo) {
        if(cargo.equals(""))
        {
            throw new StringVazioException();
        }
        else
        {
        this.cargo = cargo;
    }
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        if(rg.equals(""))
        {
            throw new StringVazioException();
        }
        else
        {
        this.rg = rg;
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
}
