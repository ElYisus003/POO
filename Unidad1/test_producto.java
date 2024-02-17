package Unidad1;

public class test_producto {
	
	public static void lines(){
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println();
    }
	
	public static void main(String []args) {
		
		Producto producto1 = new Producto("Coca-Cola", 123, 20f, (byte) (50), "Bebidas");
		Producto producto2 = new Producto("Avena", 778, 10f, (byte) (100), "Cereales");
		Producto producto3 = new Producto("Sabritas", 663, 16.50f, (byte) (30), "Botanas");
		Producto producto4 = new Producto("Agua", 888, 12f, (byte) (60), "Bebidas");
		Producto producto5 = new Producto("Bolillo", 898, 8f, (byte) (20), "Panadería");
		
		//GUARDAR LOS OBJETOS EN UN ARREGLO
		Producto arregloProducto[] = new Producto[10];
		arregloProducto[0] = producto1;
		arregloProducto[1] = producto2;
		arregloProducto[2] = producto3;
		arregloProducto[3] = producto4;
		arregloProducto[4] = producto5;
		
		//MOSTRAR LOS ATRIBUTOS DE TODOS LOS PRODUCTOS
		for(int i=0; i<5; i++) {
			System.out.println(arregloProducto[i].mostrarAtributos());
			lines();
		}
	}

}
