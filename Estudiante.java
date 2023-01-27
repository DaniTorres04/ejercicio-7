public class Estudiante implements Comparable<Estudiante> {
    String nombre;
    int edad;
    int altura;

    public Estudiante(String nombre, int edad, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    @Override
    public int compareTo(Estudiante est) {
        int resultado = 0;
        if (this.altura < est.altura){
            resultado = 1;
        }else if (this.altura > est.altura){
            resultado = -1;
        }else{
            if (this.edad < est.edad){
                resultado = 1;
            }else if (this.edad > est.edad){
                resultado = -1;
            }else {
                resultado = 0;
            }
        }
        return resultado;
    }
    }
