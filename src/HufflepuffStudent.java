public class HufflepuffStudent extends HogwartsStudent{
    private int diligence;
    private int loyalty;
    private int honesty;

    public HufflepuffStudent(String fullName, int magicPower, int apparitionDistance, int diligence, int loyalty, int honesty) {
        super(fullName, magicPower, apparitionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }
    private int innerSkillPointSum() {
        return diligence + loyalty + honesty;
    }
    public void innerCompareTo(HufflepuffStudent other) {
        if (innerSkillPointSum() > other.innerSkillPointSum()) {
            System.out.println(getFullName() + " лучший ученик Пуффендуя, чем " + other.getFullName());
        } else if (innerSkillPointSum() < other.innerSkillPointSum()) {
            System.out.println(other.getFullName() + " лучший ученик Пуффендуя, чем " + getFullName());
        } else {
            System.out.println(getFullName() + " и " + other.getFullName() + " одинаково хорошие ученики Пуффендуя");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "(трудолюбие: " + diligence + " верность: " + loyalty + " честность: " + honesty + ")";
    }
}
