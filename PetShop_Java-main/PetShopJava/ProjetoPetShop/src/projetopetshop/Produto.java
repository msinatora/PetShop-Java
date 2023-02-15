package projetopetshop;

public class Produto {
 private String nomeProd;
    private String desc;
    private String codBarras;
    private int qntd;
    private double preco;
    
      public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        if(codBarras.equals(""))
        {
            throw new StringVazioException();
        }
        else
        {
        this.codBarras = codBarras;
    }
    }
    
    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        if(nomeProd.equals(""))
        {
            throw new StringVazioException();
        }
        else
        {
        this.nomeProd = nomeProd;
    }
    }

    public int getQntd() {
        return qntd;
    }

    public void setQntd(int qntd) {
        if(qntd<0)
        {
            throw new IllegalArgumentException("Valor Negativo.Tente Novamente");
        }
           else{
        this.qntd = qntd;
    }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco<0)
        {
            throw new IllegalArgumentException("Valor Negativo.Tente Novamente");
        }
           else{
        this.preco = preco;
    }
}

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        if(desc.equals(""))
        {
            throw new StringVazioException();
        }
        else
        {
        this.desc = desc;
    }
    }

    public void exibir() {
        System.out.println("Nome: " + this.getNomeProd());
        System.out.println("Descricao: " + this.getDesc());
        System.out.println("Preco: " + this.getPreco());
    }
   
}