public class Institution {
    private int id;
    private String name;
    private String city;
    private String state;
    private String act;
    private String ministry;

    // Constructor
    public Institution(int id, String name, String city, String state, String act, String ministry) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.state = state;
        this.act = act;
        this.ministry = ministry;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getAct() {
        return act;
    }

    public String getMinistry() {
        return ministry;
    }

    // Method to display institution details
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", City: " + city + ", State: " + state + 
               ", Act: " + act + ", Ministry: " + ministry;
    }
}
