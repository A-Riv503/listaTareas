import javax.swing.*;

public class ListaTareas {

    public static void mostrarListaTareas(Tarea listaTareas[], int cantidadTareas){
       for(int i=0; i<cantidadTareas;i++){
           System.out.println("Tarea num "+(i+1));
           System.out.println(listaTareas[i].tarea);
           System.out.println(listaTareas[i].descripcionTarea);
           System.out.println("---------------------------------------------------");
       }
    }

    public static void tareasCompletadas(Tarea listaTareas[],int cantidadTareas){
        String nombreTarea=JOptionPane.showInputDialog("cual es la tarea que completo");
        for(int i=0;i<cantidadTareas;i++){
            if(listaTareas[i].tarea.equals(nombreTarea)){
                System.out.println("Tarea num "+(i+1)+" completada ");
                System.out.println(listaTareas[i].tarea);
                System.out.println(listaTareas[i].descripcionTarea);
                System.out.println("---------------------------------------------------");
            }else{
                System.out.println("Tarea num "+(i+1));
                System.out.println(listaTareas[i].tarea);
                System.out.println(listaTareas[i].descripcionTarea);
                System.out.println("---------------------------------------------------");
            }
        }
    }


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

        int eleccion=Integer.parseInt(JOptionPane.showInputDialog("1-haz completado una tarea 2-mostrar las tareas 3-quieres agregar mas tareas"));

        if(eleccion==1){
            tareasCompletadas(listaTareas,cantidadTareas);
        }else if(eleccion==2){
            mostrarListaTareas(listaTareas,cantidadTareas);
        }else{
            System.out.println("programa finalizado");
        }


    }
}
