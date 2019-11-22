package hello;

public class Greeting {

    private final long id;
    private final String content;
    private final String firstName;

    public Greeting(long id, String content, String firstName) {
        this.id = id;
        this.content = content;
        this.firstName = firstName;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getFirstName(){
        return firstName;
    }
}