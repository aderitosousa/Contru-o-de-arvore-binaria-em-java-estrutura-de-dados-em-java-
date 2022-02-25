package teste.implementaçeõs;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<Carro> listacarros = new ArrayList<>();

        listacarros.add(new Carro("BMW"));
        listacarros.add(new Carro("avenza"));
        listacarros.add(new Carro("landcruiser"));
        listacarros.add(new Carro("toyota"));

        System.out.println(listacarros.contains(new Carro("BMW")));
        System.out.println(listacarros.contains(new Carro("landcruiser")));
        System.out.println(listacarros.contains(new Carro("toyota")));
        System.out.println(listacarros.contains(new Carro("AVENZA")));

                /*Outra maneira de usar o equals*/

        Carro carro1 =new Carro("avenza");
        Carro carro2 =new Carro("avenza");

        System.out.println(carro1.equals(carro2));

    }
}
