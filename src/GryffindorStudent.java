public class GryffindorStudent extends HogwartsStudent {
    private int nobility;
    private int honor;
    private int bravery;

    public GryffindorStudent(String fullName, int magicPower, int apparitionDistance, int nobility, int honor, int bravery) {
        super(fullName, magicPower, apparitionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }
    private int innerSkillPointSum() {
        return nobility + honor + bravery;
    }
    public void innerCompareTo(GryffindorStudent other) {
        if (innerSkillPointSum() > other.innerSkillPointSum()) {
            System.out.println(getFullName() + " лучший ученик Гриффиндора, чем " + other.getFullName());
        }
        else if (innerSkillPointSum() < other.innerSkillPointSum()) {
            System.out.println(other.getFullName() + " лучший ученик Гриффиндора, чем " + getFullName());
        }
        else {
            System.out.println(getFullName() + " и " + other.getFullName() + " одинаково хорошие ученики Гриффиндора");
        }
    }
    @Override
    public String toString() {
        return super.toString() + "(благородство: " + nobility + " честь: " + honor + " храбрость: " + bravery + ")";
    }
}
