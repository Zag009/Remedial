import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //
        Scanner input = new Scanner(System.in);
        ArrayList<empleados> personalElegido = new ArrayList<empleados>();
        // Trabajadores
        // Llenar practicantes
        empleados practicante1 = new empleados("Sofia", true, false, "1", false, true, false, true);
        empleados practicante2 = new empleados("Pedro", true, false, "1", false, true, false, true);
        empleados practicante3 = new empleados("Luis", true, false, "1", false, true, false, true);

        // Llenar ingenieros
        empleados inge1 = new empleados("Jose ", false, true, "2", true, false, true, false);
        empleados inge2 = new empleados("Luis", false, true, "2", true, false, true, false);
        empleados inge3 = new empleados("Francisco", false, true, "2", true, false, true, false);

        // Llenar administradores
        empleados admin1 = new empleados("Andre", false, true, "3", true, false, true, true);
        empleados admin2 = new empleados("Joaquin", false, true, "3", true, false, true, true);
        empleados admin3 = new empleados("Sharon", false, true, "3", true, false, true, true);

        //
        String op, nombre;
        System.out.println("1. Investigativo ");
        System.out.println("2. Nuevo cliente ");
        System.out.println("3. Mantenimiento ");
        System.out.println("4. Interno ");
        System.out.println("Ingresa la opcion--> ");
        op = input.next();
        System.out.println("Ingresa el nombre del proyecto ");
        nombre = input.next();
        Proyecto proyecto = new Proyecto(nombre, op);
        String comb = "";
        comb = proyecto.ver();
        String s = "";
        empleados usar = new empleados("nombre", false, false, s, false, false, false, false);
        empleados usar2 = new empleados("nombre", false, false, s, false, false, false, false);
        String respuesta="";
        if (comb.equalsIgnoreCase("Ingeniero-practicante")) {
            // Ingenieros
            System.out.println("Se necesita un ingeniero y un practicante");
            System.out.println("Ingenieros");
            System.out.println("1. " + inge1.getNombre());
            System.out.println("2. " + inge2.getNombre());
            System.out.println("3. " + inge3.getNombre());
            s = input.next();
            if (s.equalsIgnoreCase("1")) {
                usar = inge1;
            } else if (s.equalsIgnoreCase("2")) {
                usar = inge2;

            } else if (s.equalsIgnoreCase("3")) {
                usar = inge3;
            }
            // Practicantes
            System.out.println("Practicantes ");
            System.out.println("1. " + practicante1.getNombre());
            System.out.println("2. " + practicante2.getNombre());
            System.out.println("3. " + practicante3.getNombre());
            s = input.next();
            if (s.equalsIgnoreCase("1")) {
                usar2 = practicante1;
            } else if (s.equalsIgnoreCase("2")) {
                usar2 = practicante2;

            } else if (s.equalsIgnoreCase("3")) {
                usar2 = practicante3;
            }
            proyecto.personal(usar, usar2);
            System.out.println("Su proyecto: " + nombre + " se llevara a cargo de: ");
            System.out.println(usar.getNombre() + "(Ingeniero) y " + usar2.getNombre() + "(Practicante)");

        } else if (comb.equalsIgnoreCase("Practicante-administrador")) {
            // Practicante
            System.out.println("Se necesita un practicante y un administrador");
            System.out.println("Practicante");
            System.out.println("1. " + practicante1.getNombre());
            System.out.println("2. " + practicante2.getNombre());
            System.out.println("3. " + practicante3.getNombre());
            s = input.next();
            if (s.equalsIgnoreCase("1")) {
                usar = practicante1;
            } else if (s.equalsIgnoreCase("2")) {
                usar = practicante2;

            } else if (s.equalsIgnoreCase("3")) {
                usar = practicante3;
            }
            // Administrador
            System.out.println("Administradores ");
            System.out.println("1. " + admin1.getNombre());
            System.out.println("2. " + admin2.getNombre());
            System.out.println("3. " + admin3.getNombre());
            s = input.next();
            if (s.equalsIgnoreCase("1")) {
                usar2 = admin1;
            } else if (s.equalsIgnoreCase("2")) {
                usar2 = admin2;

            } else if (s.equalsIgnoreCase("3")) {
                usar2 = admin3;
            }
            proyecto.personal(usar, usar2);
            System.out.println("Su proyecto: " + nombre + " se llevara a cargo de: ");
            System.out.println(usar.getNombre() + "(Practicantes) y " + usar2.getNombre() + "(Administradores)");
        }
        else if (comb.equalsIgnoreCase("ingeniero-administrador")) {
            // ingenieros
            System.out.println("Se necesita un ingeniero y un administrador");
            System.out.println("Ingenieros");
            System.out.println("1. " + inge1.getNombre());
            System.out.println("2. " + inge2.getNombre());
            System.out.println("3. " + inge3.getNombre());
            s = input.next();
            if (s.equalsIgnoreCase("1")) {
                usar = inge1;
            } else if (s.equalsIgnoreCase("2")) {
                usar = inge2;

            } else if (s.equalsIgnoreCase("3")) {
                usar = inge3;
            }
            // Administrador
            System.out.println("Administradores ");
            System.out.println("1. " + admin1.getNombre());
            System.out.println("2. " + admin2.getNombre());
            System.out.println("3. " + admin3.getNombre());
            s = input.next();
            if (s.equalsIgnoreCase("1")) {
                usar2 = admin1;
            } else if (s.equalsIgnoreCase("2")) {
                usar2 = admin2;

            } else if (s.equalsIgnoreCase("3")) {
                usar2 = admin3;
            }
            proyecto.personal(usar, usar2);
            System.out.println("Su proyecto: " + nombre + " se llevara a cargo de: ");
            System.out.println(usar.getNombre() + "(Ingeniero) y " + usar2.getNombre() + "(Administradores)");
        }
        else if (comb.equalsIgnoreCase("Practicante-administrador")) {
            // Practicante
            System.out.println("Se necesita un practicante y un administrador");
            System.out.println("Practicante");
            System.out.println("1. " + practicante1.getNombre());
            System.out.println("2. " + practicante2.getNombre());
            System.out.println("3. " + practicante3.getNombre());
            s = input.next();
            if (s.equalsIgnoreCase("1")) {
                usar = practicante1;
            } else if (s.equalsIgnoreCase("2")) {
                usar = practicante2;

            } else if (s.equalsIgnoreCase("3")) {
                usar = practicante3;
            }
            // Administrador
            System.out.println("Administradores ");
            System.out.println("1. " + admin1.getNombre());
            System.out.println("2. " + admin2.getNombre());
            System.out.println("3. " + admin3.getNombre());
            s = input.next();
            if (s.equalsIgnoreCase("1")) {
                usar2 = admin1;
            } else if (s.equalsIgnoreCase("2")) {
                usar2 = admin2;

            } else if (s.equalsIgnoreCase("3")) {
                usar2 = admin3;
            }
            proyecto.personal(usar, usar2);
            System.out.println("Su proyecto: " + nombre + " se llevara a cargo de: ");
            System.out.println(usar.getNombre() + "(Practicantes) y " + usar2.getNombre() + "(Administradores)");
        }
        
    }
}