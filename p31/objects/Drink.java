package objects;

public final class Drink extends MenuItem implements Alcoholable {
    public enum drinkTypeEnum {
        BEER,
        WINE,
        VODKA,
        BRANDY,
        CHAMPAGNE,
        WHISKEY,
        TEQUILA,
        RUM,
        VERMUTH,
        LIQUOR,
        JAGERMEISTER,
        JUICE,
        COFFEE,
        GREEN_TEA,
        BLACK_TEA,
        MILK,
        WATER,
        SODA
    };
    private final double alcoholVol;
    private final drinkTypeEnum type;
    public Drink(int cost, String name, String description, double alcoholVol, drinkTypeEnum type){
        super(cost, name, description);
        this.alcoholVol = alcoholVol;
        this.type = type;
    }
    public drinkTypeEnum getType(){
        return type;
    }

    @Override
    public boolean isAlcoholicDrink() {
        return alcoholVol != 0;
    }

    @Override
    public double getAlcoholVol() {
        return alcoholVol;
    }
}
