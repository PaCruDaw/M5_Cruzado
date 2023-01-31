class Devolucion {

    //hola

    public static float calculoBilletes (float x) {
        int v_dinero[] = {100, 50, 20, 10, 5};    
        float devolucion = 0;
        for (int i = 0; i < 5; i++) {
            int j = 0;
            while (x >= v_dinero[i]) {
                x = x - v_dinero[i];
                devolucion = devolucion + v_dinero[i];
                j++;
            }
            if (j != 0) {
                System.out.println(j + " billetes de " + v_dinero[i]);
            } 
        }
        return x;
    }

    public static float calculoMonedasEuro (float x) {
        int v_dinero[] = {2, 1};    
        float devolucion = 0;
        for (int i = 0; i < 2; i++) {
            int j = 0;
            while (x >= v_dinero[i]) {
                x = x - v_dinero[i];
                devolucion = devolucion + v_dinero[i];
                j++;
            }
            if (j != 0) {
                System.out.println(j + " monedas de " + v_dinero[i]);
            } 
        }
        return x;
    }

    public static void calculoCentimos (float x) {
        int v_dinero[] = {50, 20, 10, 5, 2, 1};    
        float devolucion = 0;
        for (int i = 0; i < 6; i++) {
            int j = 0;
            while (x >= v_dinero[i]) {
                x = x - v_dinero[i];
                devolucion = devolucion + v_dinero[i];
                j++;
            }
            if (j != 0) {
                System.out.println(j + " monedas de " + v_dinero[i] + " centimos");
            } 
        }
    }    
    
    public static void main (String[] args) {
        System.out.print("Introduzca el importe a devolver: ");
        String importe = System.console().readLine();
        try {
            float import_num = Float.parseFloat(importe);
            import_num = calculoBilletes(import_num);
            import_num = calculoMonedasEuro(import_num);
            //hay que redondear para que no haga cosas raras con sus propios redondeos
            import_num = Math.round(import_num*100); 
            calculoCentimos(import_num);
        }
        catch (Exception e) {
            System.out.println("Introduzca un valor valido.");
        }
    }
}
