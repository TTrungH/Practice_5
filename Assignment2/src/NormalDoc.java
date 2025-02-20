package Practice_5.Assignment2.src;

class NormalDoc extends Document {
    @Override
    public Document buildDoc() {
        System.out.println("Normal Document Created\n" + this);
        return this;
    }
}
