import javax.swing.*;

public class ListaTareas {
    public static void main(String[] args) {
        /*Crea una clase llamada tarea que represente una tarea con su nombre una descripcion. luego, crea una clase llamada lista tareas que contenga un array
         * de objetos de tipo tarea. el programa debe permitir al usuario agregar tareas a la lista, mostrar la lista de tareas y marcar una tarea como completada
         * . ademas, cuando se muestra la lista, las tareas completadas deben mostrarse con un indicador*/

        int cantidadTareas=Integer.parseInt(JOptionPane.showInputDialog("Cuantas tareas desea ingresar"));
        String tarea, descrpcion;
        Tarea listaTareas[]=new Tarea[cantidadTareas];

        for(int i=0;i<cantidadTareas;i++){
            tarea=JOptionPane.showInputDialog("Ingrese su tarea");
            descrpcion=JOptionPane.showInputDialog("Ingrese una pequeña descripcion de su tarea");
            listaTareas[i]=new Tarea(tarea,descrpcion);
        }

        for(int i=0;i<cantidadTareas;i++){
            System.out.println(listaTareas[i]);
        }
    }
}
