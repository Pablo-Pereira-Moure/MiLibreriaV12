package libreriasv12;

public class Impresora implements InterfaceMetodosComunes {
    private String msg;

    public Impresora(String msg){
        this.msg=msg;
    };

    @Override
    public void visualiza(){
        System.out.println("Sale por la impresora " + msg);
    }

}