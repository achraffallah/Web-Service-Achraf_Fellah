import proxy.Banque;
import proxy.BanqueService;
import proxy.Compte;

public class ClientWS {
    public static void main ( String[] args ) {
        BanqueService stub=new Banque (  ).getBanqueServicePort (  ); // middle ware
        System.out.println ( stub.convert ( 7000 ));
        Compte compte = stub.getCompte ( 5 );
        System.out.println ( compte.getCode ());
        System.out.println ( compte.getSolde ());


    }
}
