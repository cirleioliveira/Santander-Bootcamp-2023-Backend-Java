package ExemploPolimorfismo;
public class Autodromo {
    public static void main(String[] args) throws Exception {
        Carro jeep = new Carro();
        jeep.setChassi("256592");
        //jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("462568");
        //z400.ligar();

        // polimorfismo 
        Veiculo coringa = z400;
        coringa.ligar();
    }
}
