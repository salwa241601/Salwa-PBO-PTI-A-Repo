public class HeroMagic extends Hero {
    private String power;
    HeroMagic(String name, double health) {
        super(name, health);
        this.power = "Magic";
    }
    public String getPower() {
        return power;
    }
    public void setPower(String power) {
        this.power = power;
    }
    public void display(){ 
        System.out.println(this.getName() + " is a " + this.power + " power ");
    }
    
}
