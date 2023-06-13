public enum Gender {
    MAN("Férfi", "Herr"),
    WOMAN("Nő","Frau");

    private String magyarNem;
    private String nemetNem;
    private Gender(String magyarNem, String nemetNem){
        this.magyarNem = magyarNem;
        this.nemetNem = nemetNem;
    }
    public String getMagyarNem(){
        return magyarNem;
    }
    public String getNemetNem(){
        return nemetNem;
    }


}
