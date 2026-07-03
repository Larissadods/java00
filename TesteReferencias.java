public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(0, 0);
        primeiraConta.getSaldo(()) = 300;
        System.out.println("saldo da primeira " + primeiraConta.getSaldo());

        Conta segundaConta = primeiraConta;
        System.out.println("saldo da segunda conta: " + segundaConta.getSaldo());

        segundaConta.getSaldo() += 100;
        System.out.println("saldo da segunda conta: " + segundaConta.getSaldo());

        System.out.println(primeiraConta.saldo);

        if (primeiraConta == segundaConta) {
            System.out.println("sao a mesma mierda");
        }

       
    }
}
