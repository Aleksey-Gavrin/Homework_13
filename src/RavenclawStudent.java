public class RavenclawStudent extends HogwartsStudent {
    private int intelligence;
    private int wisdom;
    private int cuteness;
    private int creativity;

    public RavenclawStudent(String fullName, int magicPower, int apparitionDistance, int intelligence, int wisdom,
                            int cuteness, int creativity) {
        super(fullName, magicPower, apparitionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.cuteness = cuteness;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCuteness() {
        return cuteness;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setCuteness(int cuteness) {
        this.cuteness = cuteness;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    private int innerSkillPointSum() {
        return intelligence + wisdom + cuteness + creativity;
    }
    public void innerCompareTo(RavenclawStudent other) {
        if (innerSkillPointSum() > other.innerSkillPointSum()) {
            System.out.println(getFullName() + " лучший ученик Когтеврана, чем " + other.getFullName());
        } else if (innerSkillPointSum() < other.innerSkillPointSum()) {
            System.out.println(other.getFullName() + " лучший ученик Когтеврана, чем " + getFullName());
        } else {
            System.out.println(getFullName() + " и " + other.getFullName() + " одинаково хорошие ученики Когтеврана");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "(ум: " + intelligence + " мудрость: " + wisdom + " остроумие: " + cuteness +
                " творчество: " + creativity + ")";
    }
}
