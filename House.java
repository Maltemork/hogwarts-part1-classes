public class House implements HogwartsPerson {
    private final String name;
    private final String founder;
    private final String[] colors;
    public String getName() {
        return name;
    }

    public String[] getColors() {
        return colors;
    }

    public String getFounder() {
        return founder;
    }

    public House(String name, String founder, String color1, String color2) {
        this.name = name;
        this.founder = founder;
        this.colors = new String[]{color1, color2};
    }

}
