public class MonApplication5 {

    public static void main( String arg[]) {
         System.out.println("demo Switch");

    int note= 10;

    switch (note)
   {
    case 0:
    System.out.print("Ouch !");
    break;
   case 10:
    System.out.println("Vous avez juste la moyenne");
    break;
   case 20:
    System.out.println("Parfait!");
    break;
  default:
     System.out.println("Il faut davantage travailler.");
  }

}
}