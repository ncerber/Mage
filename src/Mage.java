public class Mage {
    private final String name;
    private final int level;
    private final int damage;
    private final String type; //fire, ice, earth

    public Mage(String name, int level, int damage, String type) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.type = type;
    }

    @Override
    public String toString() {
        return "" + name +
                ", " + level +
                ", " + damage +
                ", " + type;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getDamage() {
        return damage;
    }

    public String getType() {
        return type;
    }

    public String getInfo(){
        return toString();
    }

    public String fight(Mage mage){
        if(type.equals("fire") && mage.getType().equals("ice")) return name;
        if(mage.getType().equals("fire") && type.equals("ice")) return mage.getName();

        if(type.equals("ice") && mage.getType().equals("earth")) return name;
        if(mage.getType().equals("ice") && type.equals("earth")) return mage.getName();

        if(type.equals("earth") && mage.getType().equals("fire")) return name;
        if(mage.getType().equals("earth") && type.equals("fire")) return mage.getName();

        if(type.equals(mage.getType())){
            if(level != mage.getLevel()) return (level > mage.getLevel()) ? name : mage.getName();
            if(damage != mage.getDamage()) return damage > mage.getDamage() ? name : mage.getName();
        }
        return "draw";
    }
}
