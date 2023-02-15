package projetopetshop;
import java.util.ArrayList;
import java.util.Scanner;


public class ProjetoPetShop {
    
    
    
    public static void main(String[] args) {
        
     Scanner scan=new Scanner(System.in);
    
     ArrayList <Cliente> cliente = new ArrayList ();
     ArrayList <Funcionario> funcionario = new ArrayList();
     ArrayList <Produto> produto= new ArrayList ();
     boolean rodando = true;
     boolean erro;
     //
     while(rodando){
         
        System.out.println("|1| Cadastrar Cliente");
        System.out.println("|2| Listar Clientes Cadastrados");
        System.out.println("|3| Buscar Cliente Por Nome");
        System.out.println("|4| Cadastrar Funcionario");
        System.out.println("|5| Listar Funcionario Cadastrados");
        System.out.println("|6| Buscar Funcionario Por Nome");
        System.out.println("|7| Cadastrar Produtos");   
        System.out.println("|8| Listar Produtos Cadastrados");
        System.out.println("|9| Filtrar Produtos");
        System.out.println("|IC| Informacao Cliente");
        System.out.println("|IP| Informacao Produto");
        System.out.println("|RC| Remover Cliente");
        System.out.println("|RF| Remover Funcionario");
        System.out.println("|RP| Remover Produto");
        System.out.println("|10| Sair");
        
        System.out.println("Digite a Opção: ");
        String opcao=scan.nextLine();  
        
         switch(opcao){
       
       case "1": 
       {
           System.out.println("=============Cadastro De Clientes=============");
          Cliente c =new Cliente(); 
          do{
            try
         {
        System.out.println("Digite Seu Nome: ");
            String nome = scan.nextLine();
            c.setNome(nome);
            erro=false;
         }
            catch(StringVazioException e)
                 {
                 System.out.println(e.getMessage());
                 erro=true;
                 }
        }while(erro);
        do{
            try
            {
        System.out.println("Digite Seu Email: ");
        String email = scan.nextLine();
        c.setEmail(email);
        erro=false;
            }
        catch(StringVazioException e)
        {
        System.out.println(e.getMessage());
        erro=true;
                 }
            }while(erro);
       do{
       try{
       System.out.println("Digite Seu Cpf: ");
       String cpf = scan.nextLine();
       c.setCpf(cpf);
       erro=false;}
            
       catch(StringVazioException e)
                 {
        System.out.println(e.getMessage());
        erro=true;
                 }
            }while(erro);
              do{
            try{
            System.out.println("Digite Seu Telefone: ");
            String tel = scan.nextLine();
            c.setTelefone(tel);
            erro=false;
            }
              
         catch(StringVazioException e)
         {
        System.out.println(e.getMessage());
        erro=true;
                 }
            }while(erro);  
         do{
         try
         {    
            System.out.println("Digite Sua Idade: ");
            int idade = scan.nextInt();
            c.setIdade(idade);
            erro=false;
         }  
         catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
            erro=true;
        }
           }while(erro);
         
           cliente.add(c);
           scan.nextLine();
           break;
       }
        case "4": 
       {
           System.out.println("=============Cadastro De Funcionários=============");
           Funcionario f=new Funcionario();
           do{
            try
         {
        System.out.println("Digite Seu Nome: ");
            String nome = scan.nextLine();
            f.setNome(nome);
            erro=false;
         }
            catch(StringVazioException e)
                 {
                 System.out.println(e.getMessage());
                 erro=true;
                 }
        }while(erro);
        do{
            try
            {
        System.out.println("Digite Seu Cargo: ");
           String cargo = scan.nextLine();
        f.setCargo(cargo);  
        erro=false;
            }
        catch(StringVazioException e)
        {
        System.out.println(e.getMessage());
        erro=true;
                 }
            }while(erro);
       do{
       try{
        System.out.println("Digite Seu Rg: ");
           String rg = scan.nextLine();
       f.setRg(rg);
       erro=false;}
            
       catch(StringVazioException e)
                 {
        System.out.println(e.getMessage());
        erro=true;
                 }
            }while(erro);
              do{
            try{
            System.out.println("Digite Seu Telefone: ");
            String tel = scan.nextLine();
                       f.setTelefone(tel);
            erro=false;
            }
              
         catch(StringVazioException e)
         {
        System.out.println(e.getMessage());
        erro=true;
                 }
            }while(erro);  
         do{
         try
         {    
            System.out.println("Digite Sua Idade: ");
            int idade = scan.nextInt();
            f.setIdade(idade);
            erro=false;
         }  
         catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
            erro=true;
        }
           }while(erro);
        
           funcionario.add(f);
           scan.nextLine();
           break;
       }
         case "2": 
       {
           System.out.println("=============Lista De Clientes=============");
           for(int i = 0; i <cliente.size(); i++){
          
               System.out.println("Cliente " + i);
               System.out.println("\tNome: " + cliente.get(i).getNome());
               System.out.println("\tEmail: " + cliente.get(i).getEmail());
               System.out.println("\tCpf: " + cliente.get(i).getCpf());
               System.out.println("\tIdade: " + cliente.get(i).getIdade() );
                System.out.println("\tTelefone: " + cliente.get(i).getTelefone());
           }
           break;
       }
         case "3": 
       {
           System.out.println("=============Buscar Clientes=============");
           System.out.println("Digite o nome: ");
           String nome = scan.nextLine();
           boolean encontrado = false;
           
           //for (int i = 0 ; i <cliente.size(); i++){
           //Cliente cTemp= cliente.get(i);
           for(Cliente cTemp:cliente){
           if(cTemp.getNome().startsWith(nome)){
               System.out.println("Clientes Encontrados");   
               System.out.println("\tCliente: " + cTemp.getNome());
              encontrado=true;
           }if(!encontrado){
               System.out.println("Cliente Não Encontrado");   
           }     
               }
           
           break;
       }
         case "5":
         {
             System.out.println("=============Lista De Funcionários=============");
           for(int i = 0; i <funcionario.size(); i++){
               System.out.println("Funcionário " + i);
               System.out.println("\tNome: " + funcionario.get(i).getNome());
               System.out.println("\tCargo: " + funcionario.get(i).getCargo());
               System.out.println("\tIdade: " + funcionario.get(i).getIdade());
               System.out.println("\tTelefone: " + funcionario.get(i).getTelefone() );
               System.out.println("\tRegistro Geral: " + funcionario.get(i).getRg());
           }
          break;   
         }
         case "6": 
       {
          System.out.println("=============Buscar Funcionários=============");
           System.out.println("Digite o nome: ");
           String nome = scan.nextLine();
           boolean encontrado=false;
           //for (int i = 0 ; i <cliente.size(); i++){
           //Cliente cTemp= cliente.get(i);
           for(Funcionario fTemp:funcionario){
           if(fTemp.getNome().startsWith(nome)){
               System.out.println("Funcionário Encontrados");   
               System.out.println("\tFuncionário: " + fTemp.getNome());
               encontrado = true;
           }if(!encontrado){
               System.out.println("Funcionário Não Encontrado");   
           }
           
       }break;
       }
        case "7": 
        {
           System.out.println("=============Cadastro De Produtos=============");
              Produto p = new Produto();
           do{
            try
         {
        System.out.println("Nome do Produto: ");
        String nomeProd = scan.nextLine();
        p.setNomeProd(nomeProd);
        erro=false;
         }
            catch(StringVazioException e)
                 {
                 System.out.println(e.getMessage());
                 erro=true;
                 }
        }while(erro);
        do{
            try
            {
        System.out.println("Digite a Descrição do Produto: ");
        String desc = scan.nextLine();
        p.setDesc(desc);  
        erro=false;
            }
        catch(StringVazioException e)
        {
        System.out.println(e.getMessage());
        erro=true;
                 }
            }while(erro);
       do{
       try{
       System.out.println("Digite o Código de Barras do Produto: ");
       String codBarras = scan.nextLine();
       p.setCodBarras(codBarras);
       erro=false;
       }
            
       catch(StringVazioException e)
                 {
       System.out.println(e.getMessage());
        erro=true;
                 }
            }while(erro);
              do{
            try{
            System.out.println("Digite o preço do Produto: ");
            double preco = scan.nextDouble();
                       p.setPreco(preco);
            erro=false;
            }
              
         catch(IllegalArgumentException e)
         {
        System.out.println(e.getMessage());
        erro=true;
                 }
            }while(erro);  
         do{
         try
         {    
            System.out.println("Digite a quantidade: ");
            int qntd = scan.nextInt();
           p.setQntd(qntd);
            erro=false;
         }  
         catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
            erro=true;
        }
           }while(erro);
             
           produto.add(p);
           scan.nextLine();
           break;
        }
         case "8": 
        {
           System.out.println("=============Lista De Produtos=============");
           for(int i = 0; i <produto.size(); i++){
          
               System.out.println("Produto " + i);
               System.out.println("\tNome: " + produto.get(i).getNomeProd());
               System.out.println("\tDescrição: " + produto.get(i).getDesc());
               System.out.println("\tCódigo: " + produto.get(i).getCodBarras());
               System.out.println("\tPreço: " + produto.get(i).getPreco());
               System.out.println("\tQuantidade: " + produto.get(i).getQntd());
           }
      
           break;
        }
         case "9": 
        {
           System.out.println("=============Buscar Produtos=============");
           System.out.println("Filtre para encontrar seu produto:\t\n|D| - DESCRICAO \t\n|C| - CÓDIGO DE BARRAS \t\n|P| - PREÇO");
           String letra = scan.nextLine();
           
                //boolean filtro = true;
            
              // while(filtro){
               //switch(letra){
               //case "D":
               if("D".equals(letra))
           {
                System.out.println("Digite a descricao: ");
                String desc = scan.nextLine();
                boolean encontrado = false;
                for(Produto pTemp:produto){
                if(pTemp.getDesc().startsWith(desc)){
                System.out.println("Produtos Encontrados");   
                System.out.println("\tDescricao: " + pTemp.getNomeProd());
                  encontrado = true;              

           }
           if(!encontrado){
               System.out.println("Produto Não Encontrado");   
           }                     

                
                }               

            scan.nextLine();       
            break;
           }
           
           
            //case "C":
            if("C".equals(letra))
            {
                System.out.println("Digite o codigo de barras: ");
                String codBarras = scan.nextLine();
                boolean encontrado = false;
                for(Produto pTemp:produto){
                if(pTemp.getCodBarras().startsWith(codBarras)){
                
                System.out.println("Produtos Encontrados");   
                System.out.println("\tPRODUTO: " + pTemp.getNomeProd());
               encontrado = true;
                   
           }
           if(!encontrado){
               System.out.println("Produto Não Encontrado");  
           }
              }               

            scan.nextLine();       
            break;
           }
           
           //case "P":
           if("P".equals(letra))
           {
                System.out.println("Digite o preco: ");
                double preco = scan.nextDouble();
                boolean encontrado = false;
                for(Produto pTemp:produto){
                if(pTemp.getPreco()==(preco)){
                
           System.out.println("Produtos Encontrados");   
                System.out.println("\tPRODUTO: " + pTemp.getNomeProd());
              encontrado = true;
           }
           if(!encontrado){
               System.out.println("Produto Não Encontrado");   
           }     
                              

                }               

            scan.nextLine();       
            break;
           }
           else{
               System.out.println("Caractere incorrete\nTente novamente!");
               scan.nextLine();       
            break;
           }
       }

         case "10": 
        {
           rodando=false;
           break;
        }
        
                case "RC":
        {
            System.out.println("=============Remover Clientes=============");
            
           for(int i = 0; i <cliente.size(); i++){
               
               Cliente cTemp = cliente.get(i);
               System.out.println("["+i+"]" +cTemp.getNome()+"  /  " +cTemp.getCpf());

        }
            System.out.println("Digite o código que será removido: ");
            int i = scan.nextInt();
            scan.nextLine();
            
            cliente.remove(i);
            break;
        }
        
        case "RF":
        {
            System.out.println("=============Remover Funcionario=============");
            
           for(int i = 0; i <funcionario.size(); i++){
               
               Funcionario fTemp = funcionario.get(i);
               System.out.println("["+i+"]" +fTemp.getNome()+"  /  " +fTemp.getRg());

        }
            System.out.println("Digite o código que será removido: ");
            int i = scan.nextInt();
            scan.nextLine();
            produto.remove(i);
            break;
        }
            
        
        case "RP":
        {
            System.out.println("=============Remover Produto=============");
            
           for(int i = 0; i <produto.size(); i++){
               
               Produto pTemp = produto.get(i);
               System.out.println("["+i+"]" +pTemp.getNomeProd()+"  /  " +pTemp.getDesc());

        }
            System.out.println("Digite o código que será removido: ");
            int i = scan.nextInt();
            scan.nextLine();
            
            produto.remove(i);
            break;
        }
        
        case "IC":{
        
             if (cliente.size() > 0) {
            Cliente cVelho = cliente.get(0);
            Cliente cNovo = cliente.get(0);
            int numIdosos = 0;
            int numMenores = 0;
            double idadeMedia = 0;

            int idadeMaior = cVelho.getIdade();
            int idadeMenor = cNovo.getIdade();

            for (Cliente c : cliente) {
                idadeMedia += c.getIdade();

                if (c.getIdade() > 60) {
                    numIdosos++;
                } else if (c.getIdade() < 18) {
                    numMenores++;
                }

                if (c.getIdade() > idadeMaior) {
                    idadeMaior = c.getIdade();
                    cVelho = c;
                }

                if (c.getIdade() < idadeMenor) {
                    idadeMenor = c.getIdade();
                    cNovo = c;
                }
            }
            System.out.println("Cliente mais  velho: ");
            cVelho.exibir();
            System.out.println("Cliente mais  novo: ");
            cNovo.exibir();
            System.out.println("Quantidade de clientes maiores de 60 anos: " + numIdosos);
            System.out.println("Quantidade de clientes menores de 18 anos: " + numMenores);
            System.out.println("Média das idades: " + (idadeMedia / cliente.size()));
        } else {
            System.out.println("\nNão há clientes cadastrados!");
        }
             break;
    }
            
        
        case "IP":{
        
            if (produto.size() > 0) {
            Produto pCaro = produto.get(0);
            Produto pBarato = produto.get(0);
            double mediaPreco = 0;
            int numProdAcimaMedia = 0;

            double maiorPreco = pCaro.getPreco();
            double menorPreco = pBarato.getPreco();

            for (Produto p : produto) {
                mediaPreco += p.getPreco();

                if (p.getPreco() > maiorPreco) {
                    maiorPreco = p.getPreco();
                    pCaro = p;
                } else if (p.getPreco() < menorPreco) {
                    menorPreco = p.getPreco();
                    pBarato = p;
                }
            }
            mediaPreco = mediaPreco / produto.size();

            for (Produto p : produto) {
                if (p.getPreco() > mediaPreco) {
                    numProdAcimaMedia++;
                }
            }

            System.out.println("Produto mais caro: ");
            pCaro.exibir();
            System.out.println("Produto mais  barato: ");
            pBarato.exibir();
            System.out.println("Média do preço: " + mediaPreco);
            System.out.println("Número de pacotes acima da média: " + numProdAcimaMedia);
        } else {
            System.out.println("\nNão há pacotes cadastrados!");
        }
           
            }
         }
     }
        
    }
}

   
 

        
    
        
       
              
         
          
    