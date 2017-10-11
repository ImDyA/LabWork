package module2.lab2_3_0;

public class MyWindow {
    private double width;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;

    public MyWindow(){
        width = 15.2;
    }

    MyWindow widthWindow = new MyWindow();
//    MyWindow heightWindow = new MyWindow();
//    MyWindow numberOfGlassWindow = new MyWindow();
//    MyWindow colorWindow = new MyWindow();
//    MyWindow isOpenWindow = new MyWindow();

    public void printFields(){
        System.out.println(widthWindow.width);
//        System.out.println(heightWindow.height);
//        System.out.println(numberOfGlassWindow.numberOfGlass);
//        System.out.println(colorWindow.color);
//        System.out.println(isOpenWindow.isOpen);
    }
}
