//package Codigo;
//
//public class Entrega{
//    private int id_Entrega;
//    private Pagamento pagamento;
//    private String endereco_Entrega;
//    private String status_Entrega;
//    private String codigo_Rastreamento;
//    private String data_Envio;
//    private String data_Entrega;
//
//    public Entrega(int id_Entrega, Pagamento pagamento, String endereco_Entrega, String status_Entrega, String codigo_Rastreamento, String data_Envio, String data_Entrega){
//        this.id_Entrega = id_Entrega;
//        this.pagamento = pagamento;
//        this.endereco_Entrega = endereco_Entrega;
//        this.status_Entrega = status_Entrega;
//        this.codigo_Rastreamento = codigo_Rastreamento;
//        this.data_Envio = data_Envio;
//        this.data_Entrega = data_Entrega;
//    }
//
//    public int getId_Entrega(){
//        return id_Entrega;
//    }
//
//    public void setId_Entrega(int id_Entrega){
//        this.id_Entrega = id_Entrega;
//    }
//
//    public Pagamento getPagamento(){
//        return pagamento;
//    }
//
//    public void setPagamento(Pagamento pagamento){
//        this.pagamento = pagamento;
//    }
//
//    public String getEndereco_Entrega(){
//        return endereco_Entrega;
//    }
//
//    public void setEndereco_Entrega(String endereco_Entrega){
//        this.endereco_Entrega = endereco_Entrega;
//    }
//
//    public String getStatus_Entrega(){
//        return status_Entrega;
//    }
//
//    public void setStatus_Entrega(String status_Entrega){
//        this.status_Entrega = status_Entrega;
//    }
//
//    public String getCodigo_Rastreamento(){
//        return codigo_Rastreamento;
//    }
//
//    public void setCodigo_Rastreamento(String codigo_Rastreamento){
//        this.codigo_Rastreamento = codigo_Rastreamento;
//    }
//
//    public String getData_Envio(){
//        return data_Envio;
//    }
//
//    public void setData_Envio(String data_Envio){
//        this.data_Envio = data_Envio;
//    }
//
//    public String getData_Entrega(){
//        return data_Entrega;
//    }
//
//    public void setData_Entrega(String data_Entrega){
//        this.data_Entrega = data_Entrega;
//    }
//    
//    
//    public static void main(String[]args){
//    Cliente cli = new Cliente(1, "Larissa", "987.654.321-00", "lari123@gmail.com", "senha123", "Rua das Flores, 100", "(69)99999-0000");
//    Pagamento pag = new Pagamento(10, cliente, 250.0, "Aprovado", "TX123");
//    Entrega ent = new Entrega(101, Pagamento, "Rua das Flores, 100", "Em transporte", "BR233444555BR", "25/10/2025", "28/10/2025");
//
//    System.out.println("== Dados de Entrega ==");
//    System.out.println("Entrega para: " + ent.getPagamento().getCliente(),getNome());
//    System.out.println("Endereço: " + ent.getEndereco_Entrega());
//    System.out.println("Status: " + ent.getStatus_Entrega());
//    System.out.println("Valor Total: " + ent.getPagamento().getValor_Total());
//    System.out.println("Código de Rastreamento: " + ent.getCodigo_Rastreamento());
//    System.out.println("Data de envio: " + ent.getData_Envio());
//    System.out.println("Data de entrega: " + ent.getData_Entrega());
//    }
//
//
//}
