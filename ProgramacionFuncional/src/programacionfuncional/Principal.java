package programacionfuncional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author sroa
 */
public class Principal  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creamos aray de enteros
        //ARRAY DE ENTEROS
        int[] enteros = {8, 2, 0, 4, 9};
        System.out.println("" + Arrays.toString(enteros));//imprime 8,2,0,4,9
        //ordenar array
        Arrays.sort(enteros);
        System.out.println("Array ordenado" + Arrays.toString(enteros));//0,2,4,8,9

        //ARRAY TSRING
        String[] nombres = {"Patrobas", "Tercio", "Androinico", "Rolas"};
        System.out.println(Arrays.toString(nombres));
        Arrays.sort(nombres);//ordenamos el array
        System.out.println(Arrays.toString(nombres));//debe de imprimir el array ordenado

        //ARRAY COLLECTION
        List<String> listaNombres = new ArrayList<>();
        listaNombres.add("Patrobas");
        listaNombres.add("Tercio");
        listaNombres.add("Andronico");
        listaNombres.add("Rolas");
        System.out.println("List de Nombres" + listaNombres);
        //vamos a ordenar esta lista y lo vamos hacer con collections
        //COLLECTIONS
        Collections.sort(listaNombres);
        System.out.println(listaNombres);

        //crearnos una lista de empleados 
        //metemos un empleado
        List<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new Empleado("Elias",35,25));
        listaEmpleados.add(new Empleado("Tercio",55,69));
        listaEmpleados.add(new Empleado("Xalostoc",65,6925));
        listaEmpleados.add(new Empleado("Rolas",45,15));
        listaEmpleados.add(new Empleado("Andromeda",34,111));
        listaEmpleados.add(new Empleado("Sr.Carbons",33,2.22));
        listaEmpleados.add(new Empleado("Eusebio",32,150.25));
        
        
        System.out.println("ListaEmpleados");
         //vamos a decirle que la camos a ordenar
        //aplicar el orden y es por eso que implemntamos la interface Coparable en la clase Empleado
        Collections.sort(listaEmpleados);
        //iterar lista
        for(Empleado e: listaEmpleados)System.out.println(e);
        //vamos a decirle que la camos a ordenar
        //aplicar el orden y es por eso que implemntamos la interface
        
        
        
        
        
        
        
        
    }

}
