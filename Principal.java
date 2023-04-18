public class Principal {
    public static void main(String[] args) {
        Figura figura1 = new Circulo("vermelho",5);
        Figura figura2 = new Retangulo("azul",3,4);
        System.out.println("A area do circulo é: "+ figura1.area());
        System.out.println("A area do ratangulo é: "+ figura2.area());
    }
}
