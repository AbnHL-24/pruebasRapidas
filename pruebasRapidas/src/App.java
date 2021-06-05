import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

       try {
        buscarVariacion();
       } catch (Exception e) {
           System.out.println("Hubo excepcion");
       }

    }

    public static  void buscarVariacion() {
        File archivo = new File("/home/abnerhl/VSCodeProjects/pruebasRapidas/pruebasRapidas/src/dataset_91069.txt");
        Scanner sc = new Scanner(archivo);
        long anyo1 = 0;
        long poblacion1 = 0;
        long anyo2 = 0;
        long poblacion2 = 0;
        long anyoMayor = 0;
        long poblacionMayor = 0;
        

        do {
            anyo1 = anyo2;
            poblacion1 = poblacion2;
            anyo2 = sc.nextLong();
            poblacion2 = Long.parseLong(sc.next().replace(",", ""));

            if (poblacionMayor < (poblacion2 - poblacion1)) {
                anyoMayor = anyo2;
            }


        } while (archivo.hasNextLine);
    }
}
