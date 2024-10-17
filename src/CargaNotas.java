import java.util.ArrayList;
import java.util.Scanner;

public class CargaNotas {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();


        Scanner sc = new Scanner(System.in);
        boolean salirNotas = false;
        boolean salirAlumno = false;
        while(!salirAlumno){
            Alumno alumno = new Alumno();

            System.out.println("Introduzca el datos del alumno");
            System.out.println("Introduzca el nombre del alumno");
            alumno.setNombreCompleto(sc.next());
            System.out.println("Introduzca el legajo del alumno");
            alumno.setLegajo(sc.nextLong());
            ArrayList<Nota> notas = new ArrayList<>();
                while(!salirNotas){
                    Nota nota = new Nota();
                    System.out.println("Ingrese nombre catedra");
                    nota.setCatedra(sc.next());
                    System.out.println("Ingrese nota del alumno");
                    nota.setNotaExamen(sc.nextDouble());

                    notas.add(nota);


                    System.out.println("¿Desea salir de la carga de nota? Escriba SI");
                    sc.nextLine();
                    String salir = sc.nextLine();
                    if(salir.equalsIgnoreCase("SI")){
                        salirNotas = true;
                    };
                    alumno.setNota(notas);
                }
                    alumnos.add(alumno);
                    salirAlumno = true;


        }



        for(Alumno alumno : alumnos){
            int promedio = 0;
            int notas =0;
            System.out.println("Datos del alumno: " + alumno.getNombreCompleto());
            for(Nota nota : alumno.getNota()){
                promedio += nota.getNotaExamen();
                notas += 1;

                System.out.println(nota.getNotaExamen());
            }
            promedio = promedio / notas;
            System.out.println("Promedio: " + promedio);
        }
    }

}

