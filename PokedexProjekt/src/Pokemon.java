import java.util.ArrayList;

public class Pokemon {

    //Eigenschaften der Pokemon
    private String Name;
    private String Type1;
    private String Type2;
    private int DexNo;


//Konstruktor
    public Pokemon(String Name, String Type1, String Type2, int DexNo) {
        this.Name = Name;
        this.Type1 = Type1;
        this.Type2 = Type2;
        this.DexNo = DexNo;
    }

    //Alle Getter methoden
    public String getName() {
        return Name;
    }

    public String getType1() {
        return Type1;
    }

    public String getType2() {
        return Type2;
    }
    public int getDexNo() {
        return DexNo;
    }


public void zeigeEintrag() {
    System.out.println("DexNr.:" + "\t\t" + this.getDexNo());
    System.out.println("Name:" + "\t\t" + this.getName() + " ");
    System.out.print("Type:" + "\t\t" +this.getType1());
    if(this.getType2()!=null) {
        System.out.println("/" + this.getType2());
    }
    else {
        System.out.println("");
    }
    System.out.println("---------------");


}


}
