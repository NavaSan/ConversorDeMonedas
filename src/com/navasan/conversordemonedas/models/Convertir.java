package com.navasan.conversordemonedas.models;

import com.navasan.conversordemonedas.conexion.ConsultarApi;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Convertir {
    public List<String> historial = new ArrayList<>();
    public String Conversion(String monedaPrincipal, String monedaConvertir, double monto){
        ConsultarApi consulta = new ConsultarApi();
        Monedas monedas = consulta.ConvertirMoneda(monedaPrincipal);
        double monedaValor = monedas.conversion_rates().get(monedaConvertir);
        double resultado = monto * monedaValor;
        String convertido = "El valor " + monto + " [" + monedaPrincipal + "] corresponde al valor final de =>>>> " + resultado + " [" + monedaConvertir + "]" + " Fecha = " + LocalDateTime.now();
        historial.add(convertido);

        return convertido;
    }
}
