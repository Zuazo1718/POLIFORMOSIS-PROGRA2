package pojos;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        /*
        //producto
        Producto producto = new Producto("C001", "Teclado retroiluminado");
        System.out.println(producto);

        //alquilable
        Alquilable alquilable = new Alquilable("A005","Monitor 19",10.5);
        System.out.println(alquilable);

        //tecnologico
        Empresa empresa = new Empresa("DELL","Av. Principal #35",2000);
        Tecnologico tecnologico = new Tecnologico("T100","Vostro 100","USA", Calendar.getInstance().getTime(), empresa);
        System.out.println(tecnologico);

        //monitor
        Monitor monitor = new Monitor("M111","Monitor 21",12.5,"FULL HD");
        System.out.println(monitor);

        //CPU
        Empresa toshiba = new Empresa("TOSHIBA","Av. Segunda #77",1580);
        Cpu cpu = new Cpu("P20","Satellite","China",Calendar.getInstance().getTime(), toshiba,16);
        System.out.println(cpu);
        */
        /*
        //POLIMORFISMO
        Producto producto = new Producto("G120","Genius G120 + ");
        Producto lj750 = new Impresora("lj758","Canon Laserjet 758",30);
        //System.out.println(lj750);
        Producto s200 = new Monitor("s200","Samsung s200 plus",15,"FULL HD");
        //System.out.println(s200);
        Producto n500 = new DiscoDuro("n500","Maxtor n500",10,500);
        //System.out.println(n500);

        Impresora impresora = (Impresora) lj750;
        //System.out.println(impresora);
        Monitor monitor = (Monitor) s200;
        //System.out.println(monitor);
        DiscoDuro discoDuro = (DiscoDuro) n500;
        //System.out.println(discoDuro);

        System.out.println("-------------------------- REALIZADO Z --------------------------");

        Producto[] productos = new Producto[3];
        productos[0] = impresora;
        productos[1] = monitor;
        productos[2] = discoDuro;

        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i]);
        }

         */
        // Interfaces
        Monitor lg1080 = new Monitor("lg1080","Monitor LG 1080+",10,"HD");
        lg1080.reset();
        lg1080.estado();
        DiscoDuro s1000 = new DiscoDuro("s1000","Samsmung s1000",20,1000);
        s1000.reset();
        s1000.estado();
        //Cpu lg1020 = new Cpu("Azuz12","Delux","USA",Calendar.getInstance().getTime(), "lg1020",16);
        //DiscoSolido f2000 = new DiscoSolido("f2000","LG f2000","China",Calendar.getInstance().getTime(), "LG");
        Impresora L3150 = new Impresora("Epsonl3150","L3150",50);
        L3150.reset();
        L3150.estado();



    }
}




























