public class Main {
    public static void main(String[] args) {
        Person person = new Person("lia", Gender.WOMAN, EyeColor.BROWN,Pet.CAT);
        System.out.println(person.toString());
        //System.out.println(person.getGender().getNemetNem());
    }
}