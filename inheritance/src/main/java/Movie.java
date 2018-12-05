public class Movie {

    public String name;
    public float duration;
    public String[] times;

    public Movie(String name, float length, String[] times) {
        this.times = times;
        this.duration = length;
        this.name = name;
    }
}
