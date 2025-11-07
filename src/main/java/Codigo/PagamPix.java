//package Codigo;
//
//public class PagamPix extends Pagamento{
//    private String chavePix;
//
//    public PagamPix(int id_Pagamento, Cliente cliente, double valor_Total,String status_Pagamento, String codigo_Pagamento, String chavePix){
//        super(id_Pagamento, cliente, valor_Total, status_Pagamento, codigo_Pagamento);
//        this.chavePix = chavePix;     
//    }
//
//    @Override
//    public void exibirInfor(){
//        System.out.println("Pagamento PIX: " + chavePix);
//        System.out.println("Valor: R$" + valor_Total);
//        System.out.println("Status: " + status_Pagamento);
//        System.out.println("Cliente: " + cli.getNome());
//    }
//
//    void exibirInfor() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//}