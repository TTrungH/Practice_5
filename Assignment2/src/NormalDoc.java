package Practice_5.Assignment2.src;

public class NormalDoc extends Document{
    @Override
    public void setExtension(String extension) {
        this.extension = extension;
    }
    @Override
    public void setEncryption(String encryption) {
        this.encryption = encryption;
    }
    @Override
    public Document buildDoc(){
        return new Document();
    }
}
