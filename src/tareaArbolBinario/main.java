package tareaArbolBinario;

import java.util.Scanner;

import Arbol.ArbolBinarioBusqueda;

public class main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			menu();
		
	}
	public static void menu()
	{
		ArbolBinarioBusqueda ABB= new ArbolBinarioBusqueda();
		int opcion = 0;
		Scanner opcionIngresada= new Scanner(System.in);
		
		while(opcion!=5)
		{
			System.out.println("\n Sistema Arbol Binario de Busqueda");
			System.out.println("1. Insertar Elemento");
			System.out.println("2. Buscar elemento");
			System.out.println("3. Eliminar Nodo");
			System.out.println("4. listar valores del arbol");
			System.out.println("5. salir");
			opcion=opcionIngresada.nextInt();
			
			switch(opcion)
			{
			case 1:
				System.out.println("Ingrese el valor del nodo a insertar");
				
				ABB.insertarElemento(opcionIngresada.nextInt());
				break;
			case 2:
				System.out.println("Ingrese el valor del elemento a buscar");
				ABB.buscarElemento(opcionIngresada.nextInt());
				break;
			case 3:
				System.out.println("Ingrese el valor del nodo a Eliminar");
				ABB.eliminarElemento(opcionIngresada.nextInt());
				break;
			case 4:
				System.out.println(ABB.obtenerElementosOrdenadosDescendentemente());
				
				break;
			case 5:
				
				break;
			default:
				System.out.println("opcion no encontrada");
				break;
				
			}
			
		}
	}

}

