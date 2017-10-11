package module2.lab2_1_0;

public class Computer {
    private String manufacturer;
    private int serialNumber;
    private float price;
    private int quantityCPU;
    private int frequencyCPU;


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantityCPU() { return quantityCPU; }

    public void setQuantityCPU(int quantityCPU) {
        this.quantityCPU = quantityCPU;
    }

    public int getFrequencyCPU() {
        return frequencyCPU;
    }

    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }

    public static void main(String[] args) {
        Object[] arr = new Object[5];
        Computer margins = new Computer();

        margins.setManufacturer("Samsung");
        margins.setSerialNumber(234156);
        margins.setPrice(100.25f);
        margins.setQuantityCPU(8);
        margins.setFrequencyCPU(5);

        arr[0] = margins.getManufacturer();
        arr[1] = margins.getSerialNumber();
        arr[2] = margins.getPrice();
        arr[3] = margins.getQuantityCPU();
        arr[4] = margins.getFrequencyCPU();

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
