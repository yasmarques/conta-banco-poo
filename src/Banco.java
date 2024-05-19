public class Banco {
    public static void main(String[] args) throws Exception {
        
        ContaBanco cl1 = new ContaBanco();
        cl1.setNumConta(1111);
        cl1.setDono("Jubileu");
        cl1.abrirConta("CC");
        cl1.depositar(300.0f);


        ContaBanco cl2 = new ContaBanco();
        cl2.setNumConta(2222);
        cl2.setDono("Creuza");
        cl2.abrirConta("CP");
        cl2.depositar(500.0f);

        cl2.sacar(100);
        
        cl1.Cliente();
        cl2.Cliente();
        

    }
}
