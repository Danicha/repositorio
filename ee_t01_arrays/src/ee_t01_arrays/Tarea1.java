package ee_t01_arrays;

import java.io.*;
import java.util.*;

public class Tarea1 {
	
	public static void main(String[] args) {
		if (args.length != 2)
		{
		System.err.println("Numero de argumentos incorrecto");
		System.exit(1);
		}
		else
		{
		File f_entrada = new File(args[0]);
		File f_salida = new File(args[1]);
		//File f_entrada = new File(args [2]);
		LinkedList<String> lista = new LinkedList<String>();
		try {
		/* Creamos un FileReader para leer del fichero en forma de
		Bytes */
		FileReader fr = new FileReader(f_entrada);
		/* Creamos un BufferedReader a partir del FileReader para poder
		leer caracteres */
		BufferedReader br = new BufferedReader(fr);
		/* Creamos un FileWriter para escribir en el fichero en forma
		de Bytes */
		FileWriter fw = new FileWriter(f_salida);
		/* Creamos un PrintWriter a partir del FileWriter para poder
		escribir caracteres */
		PrintWriter pw = new PrintWriter(fw);
		/* Vamos leyendo linea a linea hasta llegar al final del
		fichero (null) */
		String linea = null;
		while ((linea = br.readLine()) != null){
		lista.add(linea);
		}
		/* Ordenamos la lista con el método sort de la clase
		Collections */
		Collections.sort(lista);
		/* Escribimos en el fichero de salida */
		Iterator iter = lista.iterator();
		String cadena;
		while (iter.hasNext())
		{
		cadena = (String) iter.next();
		pw.println(cadena);
		System.out.println(cadena);
		}
		/* Cerramos los flujos de los ficheros */
		br.close();
		fr.close();
		pw.close();
		fw.close();
		} catch (FileNotFoundException e) {
		//e.printStackTrace();
		System.err.println("No se ha encontrado el fichero");
		} catch (IOException e) {
		e.printStackTrace();
		}
		}
		}
		}

