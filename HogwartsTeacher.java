public class HogwartsTeacher extends Teacher implements HogwartsPerson {
    private House house;
    private boolean headOfHouse;

    public boolean getHeadOfHouse() {
        return headOfHouse;
    }

    public void setHeadOfHouse(boolean headOfHouse) {
        this.headOfHouse = headOfHouse;
    }
}
