package Practice_5.Assignment2.src;


public class Document {
    protected String extension;
    protected boolean encryption;

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setEncryption(boolean encryption) {
        this.encryption = encryption;
    }

    public Document buildDoc(){
        return new Document();
    }

    @Override
    public String toString() {
        return "Document [Extension=" + extension + ", Encryption=" + encryption + "]";
    }
}

