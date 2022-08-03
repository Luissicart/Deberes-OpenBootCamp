package SmartDevice;

public class SmartDevice {

    String sistemaOperativo;
    long numeroTelefono;
    boolean conectetividad;
    boolean internet;
    boolean NFC;

    public SmartDevice() {
    }

    public SmartDevice(String sistemaOperativo, long numeroTelefono, boolean conectetividad, boolean internet, boolean NFC) {
        this.sistemaOperativo = sistemaOperativo;
        this.numeroTelefono = numeroTelefono;
        this.conectetividad = conectetividad;
        this.internet = internet;
        this.NFC = NFC;
    }
}
