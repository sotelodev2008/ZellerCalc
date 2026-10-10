package src.java;

public class zeller{ // Estos archivos no empiezan como los Main
    public int q; // Variables que pueden ser modificadas por otros archivos y clases
    public int w;
    public int k;
    public int j;
    public String[] quotes; // Array
    private String check_str; // Al ser privado no puede ser usada ni modificada por otros archivos o clases

    public zeller(final int lang, int day, int month, int year, int year_prefix){
        if (lang == 1) {
            final String[] quotes_temp = {"You have written an incorrect day number", "Some numbers you have written are wrong",
            "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Every data is OK"};
            this.quotes = quotes_temp; // Le da el valor de uno de los argumentos a una de las variables locales
        }
        else if (lang == 2) {
            final String[] quotes_temp = {"Has puesto un numero de dia incorrecto", "Alguno de los numeros que has puesto es incorrecto",
            "Sabado", "Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Todos los datos estan correctos"};
            this.quotes = quotes_temp;
        }
        this.q = day;
        if (month == 1 || month == 2) {
            this.w = 12 + month;
            this.k = year - 1;
        }
        else {
            this.w = month;
            this.k = year;
        }
        this.j = year_prefix;
    }

    private int error(final String check) {
        if (quotes[0].equals(check) || quotes[1].equals(check)) { // Comparación de igualdad con strings
            System.out.println(check);
            return -1;
        }
        return 0;
    }

    public String check() {
        if ((q > 29) && (w == 14)) {
            check_str = quotes[0];
        }
        if ((q < 0) | (q > 31) | (w < 3) | (w > 14) | (k < 0) | (k > 99) | (j < 18) | (j > 22)) {
            check_str = quotes[1];
        }
        int returning = error(check_str);
        if (returning == -1) {
            System.exit(-1);
        }
        return quotes[9];
    }

    public int zellercalc() {
        int h = ((q + (13 * (w + 1) / 5) + k + (k / 4) + (j / 4) - (2 * j) + 700) % 7);
        return h;
    }

    public String day(int h) {
        return switch (h) { // Si se cumple alguno de los casos de comparación de h, devolvera un valor, ya que tiene puesto return
            case 0 -> quotes[2];
            case 1 -> quotes[3];
            case 2 -> quotes[4];
            case 3 -> quotes[5];
            case 4 -> quotes[6];
            case 5 -> quotes[7];
            case 6 -> quotes[8];
            default -> "CalcError";
        };
    }
}
