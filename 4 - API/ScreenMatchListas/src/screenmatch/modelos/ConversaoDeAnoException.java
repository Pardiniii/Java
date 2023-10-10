package screenmatch.modelos;

public class ConversaoDeAnoException extends RuntimeException {
    private String msg;

    public ConversaoDeAnoException(String msg) {
        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return this.msg;
    }
}
