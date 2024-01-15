package proxyTest;

class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }
    
    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }
    
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
            loadFromDisk(fileName);
        	try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Loading interrupted.");
            }
        }
        realImage.display();
    }
}
