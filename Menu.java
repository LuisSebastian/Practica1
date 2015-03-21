package Menu;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.io.*;

public class Menu {

	public static void main(String[] args) throws IOException{
		
		Scanner leer=new Scanner(System.in);
		int op;
		do{
			System.out.println("Menú de Aplicaciones de Java - IPC1");
			System.out.println("Ingrese el número de la aplicación que desea utilizar");
			System.out.println("1) Rombo de Asteriscos");
			System.out.println("2) Calificaciones");
			System.out.println("3) Hora");
			System.out.println("4) Áreas");
			System.out.println("5) Fechas");
			System.out.println("6) Calculadora");
			System.out.println("7) Tablas de Multiplicar");
			System.out.println("8) Número en letras");
			System.out.println("9) Arábigo-Romano");
			System.out.println("10) Pirámide de números");
			System.out.println("11) Romano-Arábigo (letras)");
			System.out.println("12) Texto con Asteriscos");
			System.out.println("13) Juego Aleatorio");
			System.out.println("14) Figuras Geométricas");
			System.out.println("15) Números Primos");
			System.out.println("16) Salir");
			System.out.println("Ingrese Opción");
			op=leer.nextInt();
			switch(op){
			case 1:					
					String piramide = "*";
					int tamMax = 4;
					for(int x=1; x<= tamMax*2; x++){
						if(x<= tamMax){
							System.out.println(piramide);
							piramide = piramide + "*";
						}else{
							piramide = piramide.substring(0, (tamMax*2)-x);
							System.out.println(piramide);
						}
					}
			break;
			case 2:
				int a,b,c,d,e,f;
				int sum1;
				System.out.println("Ingrese 6 notas");
				Scanner ver=new Scanner(System.in);
				a=ver.nextInt();
				b=ver.nextInt();
				c=ver.nextInt();
				d=ver.nextInt();
				e=ver.nextInt();
				f=ver.nextInt();
				System.out.println((a+b+c+d+e+f)/6);
				sum1=((a+b+c+d+e+f)/6);
				if (sum1 <= 59){
					System.out.println("La Media es E");
				}else if(59 < sum1 && sum1 <= 69 ){
					System.out.println("La Media es D");
				}else if(69 < sum1 && sum1 <= 79 ){
					System.out.println("La Media es C");
				}else if(79 < sum1 && sum1 <= 89 ){
					System.out.println("La Media es B");
				}else 
					System.out.println("La Media es A");
			break;
			case 3:
				Calendar cal = new GregorianCalendar(); 

				// Get the components of the time 
				int hour12 = cal.get(Calendar.HOUR); // 0..11 
				int hour24 = cal.get(Calendar.HOUR_OF_DAY); // 0..23 
				int min = cal.get(Calendar.MINUTE); // 0..59 
				int sec = cal.get(Calendar.SECOND); // 0..59 
				int ms = cal.get(Calendar.MILLISECOND); // 0..999 
				int ampm = cal.get(Calendar.AM_PM); 
				System.out.println("Son las "+hour24+":"+min+":"+sec+" "+(ampm==Calendar.AM?"am":"pm")); 
			break;
			case 4:
				int x,res;
				System.out.println("Ingrese un valor para X");
				Scanner obs=new Scanner(System.in);
				x=obs.nextInt();
				do{
					System.out.println("Elija la fígura geométrica que desee estudiar");
					System.out.println("1 - Círculo");
					System.out.println("2 - Cuadrado");
					System.out.println("3 - Triángulo");
					System.out.println("4 - Salir al menú principal");
					res=obs.nextInt();
					if(res==1){
						System.out.println("El área del círculo es "+(3.1415*(x*x)));
						System.out.println("El perímetro del círculo es "+(2*(3.1415)*x));
						System.out.println("El radio del círculo es "+(x));				
					}else if(res==2){
						System.out.println("El área del cuadrado es "+((x*x)));
						System.out.println("El perímetro del cuadrado es "+(4*x));
					}else if(res==3){
						System.out.println("El área del triángulo es "+(x*(1.732/2)));
						System.out.println("El perímetro del triángulo es "+(3*x));
						System.out.println("La altura del triángulo es "+(x*(2/1.732)));
					}else{
				}}
					while(op!=4);
			case 5:
				Scanner copiar = new Scanner(System.in);
				
				String incognito = new String();
				String letra = new String();
				boolean flag = false;
				
				
				System.out.println("Ingrese la letra incognita:");
				incognito = copiar.nextLine();
				
				System.out.println("");
				
				do{
				
				System.out.println("Ingrese una letra:");
				letra = copiar.nextLine();
				
				System.out.println("");
					
				if(incognito.compareTo(letra)>0){
					System.out.println("Despues");
					System.out.println("");
				}else if(incognito.compareTo(letra)<0){
					System.out.println("Antes");
					System.out.println("");
				} else if(incognito.compareTo(letra)==0){
					System.out.println("Letra Encontrada");
					flag = true;
				}
				
				}while(flag!=true);
					
				}

		}
		while(op!=16);	
	}

}
