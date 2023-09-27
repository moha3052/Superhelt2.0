import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class Database {
    public ArrayList<Superhelt> getSuperheltArrayList() {
        return superheltArrayList;
    }

    private ArrayList<Superhelt> superheltArrayList;

    public Database(){
        superheltArrayList = new ArrayList<>();
    }
    public void tilFøjSuperhelt(String navn, String superheltenavn, int yearcreated, boolean ishuman, int strenght, String superheltekraft) {

        superheltArrayList.add(new Superhelt(navn, superheltenavn, yearcreated, ishuman, strenght, superheltekraft));

    }
    public void printsuperhelte(){
        for (int i =0; i<superheltArrayList.size(); i++){

            System.out.println(superheltArrayList.get(i));


        }
    }
    public void søgesuperhelt(String superheltnavn){
        for (int i =0; i<superheltArrayList.size(); i++){

            if (superheltArrayList.get(i).getSuperHelteNavn().contains(superheltnavn)) {

                System.out.println(superheltArrayList.get(i));
                break;


            }
        }
    }

    void addsupperhelt(){
        Database database = new Database();


    }

}

