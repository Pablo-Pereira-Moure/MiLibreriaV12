package libreriasv12;

import javax.swing.JOptionPane;

public class Ventana implements InterfaceMetodosComunes {
    private String msg;

    public Ventana(String msg) {
        this.msg = msg;
    }

    @Override
    public void visualiza(){
        JOptionPane.showMessageDialog(null,"Sale por un ventana " + msg);
    }
}
