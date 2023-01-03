package Task2_and_3_and_4;
class Device {
    String manufacturer;
    float price;
    String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    @Override
    public String toString() {
        return String.format("Device: \nManufacturer = %s\nPrice = %s\nSerialNumber = %s", manufacturer,
                price, serialNumber);
    }
    @Override
    public boolean equals(Object obj) {
        if(obj == this)return true;
        if(obj == null || obj.getClass() != this.getClass()) return false;
        Device device = (Device) obj;
        if(manufacturer != device.manufacturer || price != device.price || serialNumber != device.serialNumber) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 17;
        double a = Math.random() * 100000;
        int b = (int)a;
        result = 31 * result * (int)price * b;

        return Math.abs(result);
    }
}
class Monitor extends Device {
    int resolutionX;
    int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;

    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return String.format("Device: \nManufacturer = %s\nPrice = %s\nSerialNumber = %s\nX = %s\nY = %s", manufacturer,
                price, serialNumber, resolutionX, resolutionY);
    }
    @Override
    public boolean equals (Object obj) {
        if (obj == this) return true;
        if(obj == null || obj.getClass() != this.getClass()) return false;
        Monitor monitor = (Monitor) obj;
        if(resolutionX != monitor.resolutionX || resolutionY != monitor.resolutionY) return false;
        return true;
    }
    @Override
    public int hashCode() {
        int result = 17;
        double a = Math.random() * 100000;
        int b = (int)a;
        result = 31 * result * resolutionX * resolutionY * b;
        return Math.abs(result);
    }
}
class EthernetAdapter extends Device{
    int speed;
    String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }
    @Override
    public String toString() {
        return String.format("Device: \nManufacturer = %s\nPrice = %s\nSerialNumber = %s\nSpeed = %s\nMac = %s", manufacturer,
                price, serialNumber, speed, mac);
    }
    @Override
    public boolean equals(Object obj) {
        if(obj == this)return true;
        if(obj == null || obj.getClass() != this.getClass()) return false;
        EthernetAdapter ethernetAdapter = (EthernetAdapter) obj;
        if(speed != ethernetAdapter.speed || mac != ethernetAdapter.mac) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 17;
        double a = Math.random() * 100000;
        int b = (int)a;
        result = 31 * result * speed * b;

        return Math.abs(result);
    }
}

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("Samsung", 1000, "3465G", 1900,4000);
        EthernetAdapter ethernetAdapter = new EthernetAdapter("Manufacturer", 500, "2354F", 200,
                "40-61-86-CF-1C-E6");
        System.out.println(monitor.toString());
        System.out.println();
        System.out.println(ethernetAdapter.toString());
        Monitor monitor1 = new Monitor("TestHashCode", 10, "test", 2, 3);
        Monitor monitor2 = new Monitor("TestHashCode", 10, "test", 3,4);
        Monitor monitor3 = new Monitor("TestHashCode", 10, "test", 4, 5);
        System.out.println(monitor1.hashCode());
        System.out.println(monitor2.hashCode());
        System.out.println(monitor3.hashCode());


    }
}

