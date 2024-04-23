import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.navasan.conversordemonedas.conexion.ConsultarApi;
import com.navasan.conversordemonedas.models.Convertir;
import com.navasan.conversordemonedas.models.HistorialConverciones;
import com.navasan.conversordemonedas.models.Monedas;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Convertir convertir = new Convertir();

        while (true) {
            Scanner lectura = new Scanner(System.in);
            System.out.println("*****************************************************\n");
            System.out.println("Bienvenido/a al conversor de Moneda =]");
            System.out.println("""
                    1) Dolar =>>> Peso Chileno
                    2) Peso Chileno =>>> Dolar
                    3) Dolar =>>> Peso Colombiano
                    4) Peso Colombiano =>>> Dolar
                    5) Dolar =>>> Real Brasileño
                    6) Real Brasileño =>>> Dolar
                    7) Salir
                                    
                    Elija una opcion valida
                    """);
            System.out.println("*****************************************************");

            int valor = lectura.nextInt();
            if (valor == 7) {
                System.out.println("Gracias por usar mi app, vuelve pronto =]");
                break;
            }
            System.out.println("Ingresa el valor del monto que quieras convertir:");
            double monto = lectura.nextDouble();

            switch (valor) {
                case 1:
                    String dolarAPesoChileno = convertir.Conversion("USD", "CLP", monto);
                    System.out.println(dolarAPesoChileno);
                    break;
                case 2:
                    String pesoChilenoADolar = convertir.Conversion("CLP", "USD", monto);
                    System.out.println(pesoChilenoADolar);
                    break;
                case 3:
                    String dolarAPesoColombiano = convertir.Conversion("USD", "COP", monto);
                    System.out.println(dolarAPesoColombiano);
                    break;
                case 4:
                    String pesoColombianoADolar = convertir.Conversion("COP", "USD", monto);
                    System.out.println(pesoColombianoADolar);
                    break;
                case 5:
                    String dolarARealBrazileño = convertir.Conversion("USD", "BRL", monto);
                    System.out.println(dolarARealBrazileño);
                    break;
                case 6:
                    String RealBrazilenoADolar = convertir.Conversion("BRL", "USD", monto);
                    System.out.println(RealBrazilenoADolar);
                    break;
            }
        }
        System.out.println(convertir.historial);
    }
}