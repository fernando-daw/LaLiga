import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        int opcion=0;
        boolean salir = false;

        while (!salir){
            System.out.println("\nMenu");
            System.out.println("1. Crear liga");
            System.out.println("2. Jugar liga");
            System.out.println("3. Pausar liga");
            System.out.println("Eliminar liga");
            System.out.println("Salir");
            System.out.println("Escoge una opcion");
            opcion= menu.nextInt();

            switch (opcion){
                case 1:
                    Liga.crearnuevaliga;
                    break;
                case 2:
                    if (Liga.ligacreada()){
                        Liga.jugarliga();
                    }else{System.out.println("Debes crear una liga primero");}
                    break;
                 case 3:
                    if (Liga.ligacreada()){
                    System.out.println("Se ha pausado la Liga");
                      }else {
                    System.out.println("Debes crear una liga primero");
                     }
                case 4:
                    if (Liga.ligacreada()){
                        Liga.borrarliga(NombreLiga);
                    }else {
                        System.out.println("Debes crear una liga primero");
                    }
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;


                }

            }
        }
    }
