import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;

public class Principal {


    // Método para mostrar las opciones de divisas existentes en forma de tabla
    private static void mostrarDivisas(List<Currency> divisasValidas) {
        System.out.println("Codigo de divisas | Nombre de divisa         | Paìs");
        System.out.println("---------------------------------------------");
        for (Currency currency : divisasValidas) {
            System.out.printf("%-18s| %-25s| %s%n", currency.getCurrencyCode(), currency.getCurrencyName(), currency.getCountry());
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner lectura = new Scanner(System.in);

        // Obtener las divisas disponibles
        List<Currency> divisasValidas = Currency.getDivisasValidas();

        List<Divisas> tiposDeCambio = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        consultaDivisa consulta = new consultaDivisa();
        boolean salir = false;
        boolean catalogoMostrado = false; // Bandera para indicar si el catálogo ya ha sido mostrado

        while (!salir) {
            if (!catalogoMostrado) { // Si el catálogo no ha sido mostrado
                System.out.println("Presione '1' para conocer divisas disponibles o presione 'Enter' para continuar");
                String catalogo = lectura.nextLine();
                if (catalogo.equals("1")) {
                    mostrarDivisas(divisasValidas);
                    catalogoMostrado = true;
                }
            }

            // Pedir la divisa de origen
            System.out.println("Escriba la divisa de origen");
            String baseCode = lectura.nextLine();
            // Pedir la divisa de destino
            System.out.println("Escriba la divisa de destino");
            String targetCode = lectura.nextLine();
            // Obtener el tipo de cambio
            double tipoDeCambio = consulta.obtenerTipoCambio(baseCode, targetCode);


            if (tipoDeCambio < 0) { // Si ocurre un error en la consulta
                System.out.println("Verifique las divisas que seleccionó.");
                continue; // Vuelve al inicio del bucle
            }

            System.out.println("El tipo de cambio de " + baseCode + " a " + targetCode + " es: " + tipoDeCambio);

            // Crear un objeto Divisas y agregarlo a la lista tiposDeCambio
            Divisas divisas = new Divisas("success", baseCode, targetCode, tipoDeCambio);

            tiposDeCambio.add(divisas);

            // Pedir la cantidad a convertir
            System.out.println("Escriba la cantidad de " + baseCode + " que desea convertir a " + targetCode);
            String input = lectura.nextLine();

            try {
                double cantidad = Double.parseDouble(input);
                double conversion = cantidad * tipoDeCambio;
                System.out.println(cantidad + " " + baseCode + " equivale a " + conversion + " " + targetCode);
            } catch (NumberFormatException e) {
                System.out.println("El valor ingresado no es un número válido.");
            }
            catalogoMostrado = false;
            System.out.println("Para realizar una nueva consulta presione 'Enter', para salir escriba 'Exit'");
            String respuesta = lectura.nextLine();

            if (respuesta.equalsIgnoreCase("Exit")) {
                salir = true;
            }

        }
        System.out.println(tiposDeCambio);

        FileWriter escritura = new FileWriter("TiposDeCambio.json");
        escritura.write(gson.toJson(tiposDeCambio));
        escritura.close();
        System.out.println("Finalizó la ejecución del programa!");
    }
}

