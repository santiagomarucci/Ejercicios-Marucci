package Ejercicio3;
import java.util.Scanner;
public class Ejercicio3 {
	private Scanner Teclado;
	private int contpar=0;
	private int contimpar=0;
	private int Num1;
	private int Num2;
	private int Num3;
	private int Num4;
	private int Num5;
	private int Num6;
	private int Num7;
	private int Num8;
	private int Num9;
	private int Num10;
public void inicializar(){
	Teclado=new Scanner(System.in);
	System.out.println("Ingrese el primer n�mero:");
	Num1=Teclado.nextInt();
	Teclado=new Scanner(System.in);
	System.out.println("Ingrese el segundo n�mero:");
	Num2=Teclado.nextInt();
	Teclado=new Scanner(System.in);
	System.out.println("Ingrese el tercer n�mero:");
	Num3=Teclado.nextInt();
	Teclado=new Scanner(System.in);
	System.out.println("Ingrese el cuarto n�mero:");
	Num4=Teclado.nextInt();
	Teclado=new Scanner(System.in);
	System.out.println("Ingrese el quinto n�mero:");
	Num5=Teclado.nextInt();
	Teclado=new Scanner(System.in);
	System.out.println("Ingrese el sexto n�mero:");
	Num6=Teclado.nextInt();
	Teclado=new Scanner(System.in);
	System.out.println("Ingrese el septimo n�mero:");
	Num7=Teclado.nextInt();
	Teclado=new Scanner(System.in);
	System.out.println("Ingrese el octavo n�mero:");
	Num8=Teclado.nextInt();
	Teclado=new Scanner(System.in);
	System.out.println("Ingrese el noveno n�mero:");
	Num9=Teclado.nextInt();
	Teclado=new Scanner(System.in);
	System.out.println("Ingrese el decimo n�mero:");
	Num10=Teclado.nextInt();
	if(Num1%2==0){
		contpar=contpar+1;
	}else{
		contimpar=contimpar+1;
	}
	if(Num2%2==0){
		contpar=contpar+1;
	}else{
		contimpar=contimpar+1;
	}
	if(Num3%2==0){
		contpar=contpar+1;
	}else{
		contimpar=contimpar+1;
	}
	if(Num4%2==0){
		contpar=contpar+1;
	}else{
		contimpar=contimpar+1;
	}
	if(Num5%2==0){
		contpar=contpar+1;
	}else{
		contimpar=contimpar+1;
	}
	if(Num6%2==0){
		contpar=contpar+1;
	}else{
		contimpar=contimpar+1;
	}
	if(Num7%2==0){
		contpar=contpar+1;
	}else{
		contimpar=contimpar+1;
	}
	if(Num8%2==0){
		contpar=contpar+1;
	}else{
		contimpar=contimpar+1;
	}
	if(Num9%2==0){
		contpar=contpar+1;
	}else{
		contimpar=contimpar+1;
	}
	if(Num10%2==0){
		contpar=contpar+1;
	}else{
		contimpar=contimpar+1;
	}
}
public void imprimir(){
	System.out.println("Hay " +contpar+ " n�meros pares");
	System.out.println("Hay " +contimpar+ " n�meros impares");
}
public static void main(String[] ar){
	Ejercicio3 Ejercicio31;
	Ejercicio31=new Ejercicio3();
	Ejercicio31.inicializar();
	Ejercicio31.imprimir();
}
}
