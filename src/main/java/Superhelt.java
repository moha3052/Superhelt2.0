public class Superhelt {

    //Attributter
    private String navn;
    private String superHelteNavn;
    private String superkrafter;
    private int yearCreated;
    private boolean ishuman;
    private int Strenght;



    //parametre
    public Superhelt(String fornavn, String superHelteNavn, int yearcreated, boolean ishuman, int strenght, String superkrafter) {
        this.navn = fornavn;
        this.superHelteNavn = superHelteNavn;
        this.yearCreated = yearcreated;
        this.ishuman = ishuman;
        this.Strenght = strenght;
        this.superkrafter = superkrafter;
    }


    //get-metode
    public String getNavn() {
        return navn;
    }

    public String getSuperkrafter() {
        return superkrafter;
    }


    public String getSuperHelteNavn() {
        return superHelteNavn;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public boolean getIshuman() {
        return ishuman;
    }
    public int getStrenght() {
        return Strenght;
    }


    //set-metode
    public void setFornavn(){
        this.navn = navn;
    }

    public void setYearCreated(int yearCreated){
        this.yearCreated = yearCreated;
    }

    public void setSuperkrafter(String superkrafter){
        this.superkrafter = superkrafter;
    }
    public void setIshuman(boolean ishuman){
        this.ishuman = ishuman;
    }

    public void setStrenght(int strenght){
        this.Strenght = strenght;
    }

    public void setSuperHelteNavn(String superHelteNavn) {

        this.superHelteNavn = superHelteNavn;
    }

    @Override
    public String toString() {
        return
                "\nnavn: " + navn +
                        "\nsuperHelteNavn: " + superHelteNavn +
                        "\nsuperpower: " + superkrafter +
                        "\nyearCreated: " + yearCreated +
                        "\nishuman: " + ishuman +
                        "\nStrenght: " + Strenght + "\n";
    }

}
