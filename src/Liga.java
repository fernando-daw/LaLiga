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
        System.out.println("Introduce un nombre para la liga");

        Scanner nombre= new Scanner(System.in);
        String equipo = nombre.nextLine();
        ArrayList<String> Equipos= new ArrayList<String>(); //Creamos la lista donde se van a introducir los equipos
        for (int i=0; i<num_equipos;i++){
            System.out.println("Introduce un equipo para jugar la liga");//Iniciamos el bucle y vamos
            equipo=nombre.nextLine(); //preguntando el nombre de los equipos hasta rellenar el numero de equipos
            Equipos.add(equipo);
        }
    }
public void ligacreada{

    }
    public void jugarliga{

    }

    public static void borrarliga(String NombreLiga ) {

    }



}
