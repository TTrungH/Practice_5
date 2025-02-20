package Practice_5.Assignment2.src;


abstract class Document {
    protected String extension;
    protected String encryption;

    public String getEncryption() {
        return encryption;
    }

    public Document setExtension(String extension) {
        this.extension = extension;
        return this;
    }

    public Document setEncryption(String encryption) {
        this.encryption = encryption;
        return this;
    }

    public abstract Document buildDoc();

    @Override
    public String toString() {
        return "Document [Extension: " + extension + ", Encryption: " + encryption + "]";
    }
}
