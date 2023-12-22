package ua.edu.ucu.apps.Task3;

public class ProxyImage implements MyImage {
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }
    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }

    public static void main(String[] args) {
        ProxyImage proxyObject = new ProxyImage("test.png");
        proxyObject.display();
    }
}
