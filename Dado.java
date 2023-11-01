public class Dado {
    private int caraSuperior;

    public Dado() {
        int valorDado = (int) (Math.random()*6+1);
        this.caraSuperior = valorDado;
    }

    public int getCaraSuperior() {
        return caraSuperior;
    }

}