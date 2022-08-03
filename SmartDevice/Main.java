package SmartDevice;

public class Main {

    public static void main(String[] args) {

        SmartPhone xiaomiMi8 = new SmartPhone(true,true,"IPS");
        xiaomiMi8.sistemaOperativo = "Android";
        xiaomiMi8.numeroTelefono = 777222111;
        xiaomiMi8.conectetividad = true;
        xiaomiMi8.internet = true;
        xiaomiMi8.NFC= true;

        System.out.println(xiaomiMi8.sistemaOperativo);
        System.out.println(xiaomiMi8.numeroTelefono);
        System.out.println(xiaomiMi8.conectetividad);
        System.out.println(xiaomiMi8.internet);
        System.out.println(xiaomiMi8.NFC);
        System.out.println(xiaomiMi8.bolsillo);
        System.out.println(xiaomiMi8.llamadas);
        System.out.println(xiaomiMi8.tipoDePanel);


        SmartPhone samsungGalaxy = new SmartPhone(true,true,"AMOLED");
        samsungGalaxy.sistemaOperativo = "Android";
        samsungGalaxy.numeroTelefono = 666555444;
        samsungGalaxy.conectetividad = true;
        samsungGalaxy.internet = true;
        samsungGalaxy.NFC= true;

        System.out.println(samsungGalaxy.sistemaOperativo);
        System.out.println(samsungGalaxy.numeroTelefono);
        System.out.println(samsungGalaxy.conectetividad);
        System.out.println(samsungGalaxy.internet);
        System.out.println(samsungGalaxy.NFC);
        System.out.println(samsungGalaxy.bolsillo);
        System.out.println(samsungGalaxy.llamadas);
        System.out.println(samsungGalaxy.tipoDePanel);

        SmartPhone iphone10 = new SmartPhone(true,true,"AMOLED");
        iphone10.sistemaOperativo = "IOS";
        iphone10.numeroTelefono = 888222333;
        iphone10.conectetividad = true;
        iphone10.internet = true;
        iphone10.NFC= true;

        System.out.println(iphone10.sistemaOperativo);
        System.out.println(iphone10.numeroTelefono);
        System.out.println(iphone10.conectetividad);
        System.out.println(iphone10.internet);
        System.out.println(iphone10.NFC);
        System.out.println(iphone10.bolsillo);
        System.out.println(iphone10.llamadas);
        System.out.println(iphone10.tipoDePanel);

        SmartWatch amazFit = new SmartWatch("Negro",true);
        amazFit.sistemaOperativo = "Android";
        amazFit.conectetividad = true;
        amazFit.internet = true;
        amazFit.NFC= true;

        System.out.println(amazFit.sistemaOperativo);
        System.out.println(amazFit.numeroTelefono);
        System.out.println(amazFit.conectetividad);
        System.out.println(amazFit.internet);
        System.out.println(amazFit.NFC);
        System.out.println(amazFit.color);
        System.out.println(amazFit.pulsera);

        SmartWatch appleWatch = new SmartWatch("Blanco",true);
        appleWatch.sistemaOperativo = "IOS";
        appleWatch.conectetividad = true;
        appleWatch.internet = true;
        appleWatch.NFC= true;

        System.out.println(appleWatch.sistemaOperativo);
        System.out.println(appleWatch.numeroTelefono);
        System.out.println(appleWatch.conectetividad);
        System.out.println(appleWatch.internet);
        System.out.println(appleWatch.NFC);
        System.out.println(appleWatch.color);
        System.out.println(appleWatch.pulsera);
    }

}
