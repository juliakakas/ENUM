
public enum Pet {
    CAT("Macska", "Katze"),
    DOG("Kutya","Hund");

    private String magyarPet;
    private String nemetPet;

    private Pet(String magyarPet,String nemetPet){
        this.magyarPet = magyarPet;
        this.nemetPet = nemetPet;
    }
    public String getMagyarPet(){
        return magyarPet;
    }
    public String getNemetPet(){
        return nemetPet;
    }
}
