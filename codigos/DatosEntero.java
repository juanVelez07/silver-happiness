public class DatosEntero {
    public static void main(String[] args) {
        
        int edad1;
        int segundos;
        int dias, diferencia, suma, division, edad2;

        edad1 = 20;
        edad2 = 10;

        diferencia= edad1 - edad2;
        suma = edad1 + edad2;
        division = edad1/ edad2;
        dias = edad1 * 365;
        edad2 = edad2*365;
        segundos = dias*86400;

        System.out.println("de la edad1 uno han pasado");
        System.out.println(segundos + " segundos");
       
        System.out.println(diferencia + "años");
      
        System.out.println(suma);
        
        System.out.println(division);
        System.out.println(edad2);
    

    }
}
