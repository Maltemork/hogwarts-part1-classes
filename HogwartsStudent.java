public class HogwartsStudent extends Student implements HogwartsPerson{
    private House house;
    private boolean prefect;
    private String[] teams;

    public HogwartsStudent(String fullName) {
        super(fullName);
    }

    public House getHouse() {
        return house;
    }



    public void setHouse(House house) {
        this.house = house;
    }

    public boolean getPrefect() {
        return prefect;
    }

    public void setPrefect(boolean prefect) {
        this.prefect = prefect;
    }

    public String[] getTeams() {
        return teams;
    }

    public void setTeams(String[] teams) {
        this.teams = teams;
    }
}
