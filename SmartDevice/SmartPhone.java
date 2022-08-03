package SmartDevice;

public class SmartPhone extends SmartDevice {

    boolean bolsillo;
    boolean llamadas;
    String tipoDePanel;

    public SmartPhone(){

    }

    public SmartPhone(boolean bolsillo, boolean llamadas, String tipoDePanel) {
        this.bolsillo = true;
        this.llamadas = true;
        this.tipoDePanel = tipoDePanel;
        }


}
