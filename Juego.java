public class Juego {
    public static void main(String[] args) {
        juego();
    }
    public static int suma(int num1, int num2){
        Calculadora cal = new Calculadora(num1, num2);
        return cal.suma();
    }
    public static boolean partida(int valorDados){
        if (valorDados == 7){
            System.out.println("Felicitaciones, ganaste el juego!!");
            return true;
        }
        System.out.println("Has perdido, mejor suerte la proxima");
        return false;
    }
    public static void juego(){
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();
        int partida1 = suma(dado1.getCaraSuperior(), dado2.getCaraSuperior());
        System.out.println("Las suma de tus dados es "+partida1);
        partida(partida1);
    }
}