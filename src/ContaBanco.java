public class ContaBanco {
    public int numConta;
    private String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void setTipo(String t) {
        this.tipo = t;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String d) {
        this.dono = d;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double d) {
        this.saldo = d;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean s) {
        this.status = s;
    }   
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int n) {
        this.numConta = n;
    }
    public String getTipo() {
        return tipo;
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);

        if (t == "CC"){
            this.setSaldo(50);    
        } else if (t == "CP") {
            this.setSaldo(150);
        }
    }


    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Você precisa sacar: R$" + this.getSaldo() + " para fechar a conta.");
            
        } else if (this.getSaldo() < 0){
            System.out.println("Para fechar a conta você precisa quitar seu saldo no valor de: R$" + this.getSaldo());
        } else {
            this.setStatus(false);
            System.out.println("Sua conta foi encerrada!");
        }
        
        
    }

    public void depositar(float v){
        if (this.getStatus()){
            this.setSaldo(getSaldo() + v);
        } else{
            System.out.println("Você precisa abrir uma conta para depositar.");
        }
    }

    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo() > v){ 
            this.setSaldo(getSaldo() - v);
                System.out.println("Saque realizado com sucesso na conta de: " + this.getDono());
            } else {
                System.out.println("Você não tem saldo o suficiente");    
            } 
        } else {
            System.out.println("Você precisa abrir uma conta para sacar");
        }   
    }            

    public void pagarMensal(){
        int v = 0;

        if(this.getTipo() == "CC"){
            v = 12;
        } else if (this.getTipo() == "CP"){
            v = 20;
        }

        if (this.getStatus()){
            if (this.getSaldo() > v){
                this.setSaldo(this.getSaldo() - v); 
                System.out.println("Mensalidade paga");
            } else {
                System.out.println("Saldo Insuficiente");
            }
        } else {
            System.out.println("Impossivel Pagar");
        }
    }

    public void Cliente(){
        System.out.println("-------------------");
        System.out.println("Cliente: " + this.getDono());
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Status: " + this.getStatus());
    }
        
}
    
    
   

    


