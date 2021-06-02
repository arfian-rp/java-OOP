enum Level{ //enum class
    STANDART("Standart"),
    PREMIUM("premium"),
    VIP("pertamax");
    private String deskripsi;
    Level(String deskripsi){ //construct enum harus bukan public
        this.deskripsi=deskripsi;
    }
}
class Customor{
    Level level;
}
public class EnumClass {
    public static void main(String[] args) {
        Customor customor = new Customor();
        customor.level = Level.PREMIUM;
        Level[] levels = Level.values();
        for(var value: Level.values()){
            System.out.println(value);
        }
    }

}
