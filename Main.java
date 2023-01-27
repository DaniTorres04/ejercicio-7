mport java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Estudiante[] estudiante = new Estudiante[5];
        Estudiante obj = new Estudiante("Patri", 170, 12);
        Estudiante obj2 = new Estudiante("Manuel", 173, 43);
        Estudiante obj3 = new Estudiante("Javier", 189, 72);
        Estudiante obj4 = new Estudiante("Alicia", 168, 52);
        Estudiante obj5 = new Estudiante("Alberto", 189, 35);
        estudiante[0] = obj;
        estudiante[1] = obj2;
        estudiante[2] = obj3;
        estudiante[3] = obj4;
        estudiante[4] = obj5;
        System.out.println("Estudiantes sin ordenar: ");
        for (int i = 0; i < estudiante.length; i++){
            System.out.println(estudiante[i].nombre + " - " + estudiante[i].altura + " - " + estudiante[i].edad);
        }
        Arrays.sort(estudiante);
        System.out.println("Estudiantes ordenados: ");
        for (int i = 0; i < estudiante.length; i++){
            System.out.println(estudiante[i].nombre + " - " + estudiante[i].altura + " - " + estudiante[i].edad);
        }
    }
}
