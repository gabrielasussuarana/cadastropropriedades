import java.util.ArrayList;
import java.util.List;


public class CadastroImoveis {
    public List<Imovel> lista;

    public CadastroImoveis(){
        lista = new ArrayList<Imovel>();
    }
    

    public void listar(){
        for(Imovel i : lista)  {
            System.out.println("\n" + i.toString());
        }
        
    }

    public void listarProprietarios(String proprietario){

        for(Imovel i : lista){
            if(i.getProprietario().toUpperCase().equals(proprietario.toUpperCase())){
                System.out.println("\n" + i.toString());
            }
        }    
    }

    public void adicionar(Imovel elem)
    {
        lista.add(elem);
    }
}