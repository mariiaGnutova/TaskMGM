public class King {

    public static void main(String[] args) {
        OnlyOneObject king = OnlyOneObject.createKingObject("King", "Arthur");
        System.out.println(king.toString());

        OnlyOneObject secondKing = OnlyOneObject.createKingObject("Second", "Second Lastname");
        try {
            System.out.println(secondKing.toString());
        } catch (NullPointerException e) {
            System.out.println("Object wasn't created, please check if you already have one");
        }
    }

}
