package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifucional implements Copiadora, Digitalizadora, Impressora {
    public void copiar(){
        System.out.println("Copiando via equipamento multifucional");
    }    

     public void digitalizar(){
        System.out.println("Digitalizando via equipamento multifucional");  
    } 

    public void imprimir(){
        System.out.println("Imprimindo via equipamento multifucional");
    }   
    
    
}
