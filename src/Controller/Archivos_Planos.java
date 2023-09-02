/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import Model.*;
/**
 *
 * @author 57301
 */
public class Archivos_Planos {
    public void EscribirArchivo(File F) {
		int regis, edad, sueldo;
		String Nombre;
		Scanner escan = new Scanner(System.in );
		try {
			FileWriter A = new FileWriter(F);
			BufferedWriter escribir = new BufferedWriter(A);
			
			System.out.println("¿Cuantos registros vas a ingresar?");
			regis = escan.nextInt();
			for (int i = 0; i < regis; i++) {
				System.out.println("Ingrese el nombre del empleado "+ (i+1));
				Nombre = escan.next();
				System.out.println("Ingrese la edad del empleado "+ (i+1));
				edad = escan.nextByte();
				System.out.println("Ingrese el sueldo del empleado "+ (i+1));
				sueldo = escan.nextInt();
				escribir.write(Nombre.toLowerCase() + ","+ edad + "," + sueldo +"\n");
			}
			escribir.close();
			System.out.println("los registros se han completado");
		} catch (Exception e) {}
	}
	
	public  void EnlistarArchivo(File F) {
		String S="";
		try {

			FileReader B = new FileReader(F);
			BufferedReader leer = new BufferedReader(B);
			
			while (S != null) {
				S = leer.readLine();
				if(S != null) {
					System.out.println(S);
				}
				
			}
			leer.close();
			
		} catch (Exception e) {}
	}
	
	public void Reemplazar  (File F) {
		Scanner escan = new Scanner(System.in );
		int regis, edad, sueldo;
		System.out.println("Ingrese el nombre");
		String Reemp = escan.next();
		String Nombre = "" ;
		String S="", ArchivoA="";
		
		try {
			boolean Ban = false;
			
			FileReader B = new FileReader(F);
			BufferedReader leer = new BufferedReader(B);

			while (S != null) {
				S = leer.readLine();
					if(S != null) {
						if(Reemp.equals(S.substring(0, (S.indexOf(","))))) {
							Ban = true;
						}else {
							ArchivoA += S;
						}
					}
			}
			if(Ban) {
				FileWriter A = new FileWriter(F);
				BufferedWriter escribir = new BufferedWriter(A);
					System.out.println("Ingrese el nombre del empleado");
					Nombre = escan.next();
					System.out.println("Ingrese la edad del empleado");
					edad = escan.nextInt();
					System.out.println("Ingrese el sueldo del empleado");
					sueldo = escan.nextInt();
					escribir.write(ArchivoA + "\n");
					escribir.write(Nombre.toLowerCase() + ","+ edad + "," + sueldo +"\n");
					escribir.close();
					System.out.println("el registro se ha completado");
			}else {
				System.out.println("el nombre no se encuentra en el archivo");
			}
		} catch (Exception e) {}
	}
	
	public void eliminar(File F) {
		
		Scanner escan = new Scanner(System.in );
		System.out.println("Ingrese el nombre que desea eliminar del archivo");
		String Elim = escan.next();
		String Nombre = "" ;
		String S="", ArchivoA="";
		
		try {
			boolean Ban = false;
			
			FileReader B = new FileReader(F);
			BufferedReader leer = new BufferedReader(B);
			
			while (S != null) {
				S = leer.readLine();
					if(S != null) {
						if(Elim.equals(S.substring(0, (S.indexOf(","))))) {
							Ban = true;
						}else {
							ArchivoA += S;
						}
					}
			}
			if(Ban) {
				FileWriter A = new FileWriter(F);
				BufferedWriter escribir = new BufferedWriter(A);
					escribir.write(ArchivoA );
					escribir.close();
					System.out.println("el registro del empleado se ha eliminado");
			}else {
				System.out.println("el nombre no se encuentra en el archivo");
			}
		} catch (Exception e) {}	
	}
	
	public void Buscar(File F) {
		Scanner escan = new Scanner(System.in);
		boolean ban = false;
		System.out.println("ingrese el nombre del empleado que desea buscar");
		String Buscar = escan.next(), S = "";
		try {
			FileReader A = new FileReader(F);
			BufferedReader leer = new BufferedReader(A);
			while(S != null) {
				S = leer.readLine();
				if(S != null) {
					if(Buscar.equals(S.substring(0, S.indexOf(",")))) {
						System.out.println("El registro del empleado es: "+ S);
					}
					if(ban) {
						System.out.println("el empleado no se encuentra en el archivo");
					}
				}
			}
			leer.close();
		} catch (Exception e) {}
	}
}
