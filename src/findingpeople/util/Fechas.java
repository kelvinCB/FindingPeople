/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findingpeople.util;

import java.text.SimpleDateFormat;

/**
 *
 * @author USER
 */
public class Fechas {
    
    
    // Devuelve la fecha actual

	public static String actualDate(){

		Fechas date = new Fechas();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return dateFormat.format(date);
	}

	// Devuelve la hora actual
	public static String  actualHour(){
		Fechas hora = new Fechas();
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		return dateFormat.format(hora);

	}
    
}
