package libreriasv12;

public class Consola implements InterfaceMetodosComunes {
    private String msg;

    public Consola(String msg){
        this.msg=msg;
    };

    @Override
    public void visualiza(){
        System.out.println("Sale por la consola " + msg);
    }

}

