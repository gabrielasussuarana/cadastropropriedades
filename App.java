public class App {
    public static void main(String[] args) throws Exception {
        
        CadastroImoveis cadImovel = new CadastroImoveis();
        
        Residencial R1 = new Residencial("João Silva", new Geo(4090, 9090),500, 400);
        Residencial R2 = new Residencial("Isabele Santos", new Geo(4000, 9000),200, 150);
        Residencial R3 = new Residencial("Julia Souza", new Geo(4090, 9090),800, 700);
        Residencial R4 = new Residencial("João Silva", new Geo(4090, 9090),800, 760);

        cadImovel.adicionar(R1);
        cadImovel.adicionar(R2);
        cadImovel.adicionar(R3);
        cadImovel.adicionar(R4);

        Residencial.setValorReferencia(5);
        System.out.println("\nO valor atual de referencia é: " + Residencial.getValorReferencia());

        titulo("- Lista Todos -");
        cadImovel.listar();

        titulo("- Lista Proprietários -");
        cadImovel.listarProprietarios("João Silva"); 
    }  
    
    public static void titulo(String t){
        System.out.println("\n");
        for (int i = 0; i<t.length(); i++){
            System.out.print("-");
        }
        System.out.println("\n" + t);
        for (int i = 0; i<t.length();i++){
            System.out.print("-");
        }
    }
}

