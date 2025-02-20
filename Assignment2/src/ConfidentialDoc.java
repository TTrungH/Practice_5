package Practice_5.Assignment2.src;

class ConfidentialDoc extends Document {
    @Override
    public Document buildDoc() {
        System.out.println("Confidential Document Created\n" + this);
        return this;
    }
}