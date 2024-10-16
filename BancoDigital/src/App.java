public class App {
    public static void main(String[] args) throws Exception {
        
            Cliente client = new Cliente();
            client.setNome("Rorras");
            
            Conta cc = new ContaCorrente(client);
            Conta poupanca = new ContaPoupanca(client);

            cc.depositar(100);
            cc.transferir(100, poupanca);
            
            cc.imprimirExtrato();
            poupanca.imprimirExtrato();

            

            Cliente client2 = new Cliente();
            client2.setNome("Bia");
            
            Conta cc2 = new ContaCorrente(client2);
            Conta poupanca2 = new ContaPoupanca(client2);
    
            cc2.depositar(200);
            cc2.transferir(100, poupanca2);
            
            cc2.imprimirExtrato();
            poupanca2.imprimirExtrato();
        }
    
    }

