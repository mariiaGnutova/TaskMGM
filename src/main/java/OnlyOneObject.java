public class OnlyOneObject {
    private String name;
    private String lastName;
    private int count;
    private static int x;

    private OnlyOneObject(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.count = 1;
    }

    public static OnlyOneObject createKingObject(String name, String lastName) {
        if (x != 1) {
            OnlyOneObject king = new OnlyOneObject(name, lastName);
            x = king.getCount();
            return king;
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return (this.getName() + " " + this.getLastName());
    }

    public static void resetObject(OnlyOneObject onlyOneObject){
        if (onlyOneObject != null){
            onlyOneObject = null;
        resetX();}
    }

    private static void resetX() {
        OnlyOneObject.x = 0;
    }
}
