package Java.Pruebas;

public class barraPorcentaje {
    public static void main(String[] args) {
        int limite = 40;

        for (int i = 0; i <= limite; i++) {
            delay(70);
            System.out.print(barraProgreso(i, limite, 40) + "\r");
        }

        System.out.println("\n");
        
    }

    public static String barraProgreso(int segmento, int total, int longitud ) {
        float porcentaje = (float) segmento / total;
        float completado = porcentaje * longitud;
        float restante = longitud - completado;

        String completado_resultado = new String(new char[(int)completado]).replace("\0", "#");
        String restante_resultado = new String(new char[(int)restante]).replace("\0", "-");

        String barra = "[" + completado_resultado + restante_resultado + ":" + Math.round((porcentaje * 100)) + "%" +"]";
        return barra;
    }

    public static void delay(int milis){
		try {
			Thread.sleep(milis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
    
}
