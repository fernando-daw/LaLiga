import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Liga {
    private int num_equipos=22;
    private int num_partidos=11;

    public Liga() {
    }

    private void crearnuevaLiga{
        Scanner pedir= new Scanner(System.in);
        System.out.println("Nombre de la liga");
        String nom_liga= pedir.nextLine();

        String equipo = pedir.nextLine();
        ArrayList<String> Equipos= new ArrayList<String>(); //Creamos la lista donde se van a introducir los equipos
        for (int i=0; i<num_equipos;i++){
            System.out.println("Introduce un equipo para jugar la liga");//Iniciamos el bucle y vamos
            equipo=pedir.nextLine(); //preguntando el nombre de los equipos hasta rellenar el numero de equipos
            Equipos.add(equipo);
            System.out.println(Equipos);
        }
    }

}
