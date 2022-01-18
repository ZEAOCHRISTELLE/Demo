public class MonApplication10 {

     public static void main ( String arg[]) {
          System.out.println ("Bienvenue dans mon application de gestion ressources humaines");
          
		  String employe1 = "Yves" ;

        
		  ServicePaye2 servicePaye2 ;

          ServicePaye2 = new ServicePaye2();                        // Instanciation

          int salaire1 = ServicePaye1.calculerSalaire (employe1);
         
		 System.out.println (employe1 +"a un salaire de" + salaire1);
    }
}