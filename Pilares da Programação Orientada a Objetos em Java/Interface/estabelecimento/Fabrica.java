package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.digitalizadora.Scanner;
import equipamentos.impressora.DeskJet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.LaserJet;
import equipamentos.multifuncional.EquipamentoMultifucional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifucional em = new EquipamentoMultifucional();
        
        Scanner scanner = new Scanner();

        //Impressora impressora = scanner;
        Impressora impressora = em;
        Digitalizadora digitalizadora = scanner;
        Copiadora copiadora = em;
        //Copiadora copiadora = scanner;
        //Impressora impressora = new EquipamentoMultifucional();

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
        
    }
    
}
