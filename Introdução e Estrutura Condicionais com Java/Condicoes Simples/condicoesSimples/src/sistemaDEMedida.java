public class sistemaDEMedida {
    public static void main(String[] args) {
        String sigla = "G";
        switch (sigla) {
            case "P":{
                System.out.println("pequeno");
                break;
            }
            case "M":{
                System.out.println("Medio");
                break;
            }
            case "G":{
                System.out.println("Grande");
                break;
            }
            default:
                System.out.println("Indefinido");
        }

        /*if(sigla == "P")
            System.out.println("pequeno");
        else if(sigla == "M")
            System.out.println("Medio");
        else if(sigla == "G")
            System.out.println("Grande");
        else
        System.out.println("Indefinido"); */
    }
}
