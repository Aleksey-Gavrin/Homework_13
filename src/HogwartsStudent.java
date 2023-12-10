public abstract class HogwartsStudent {
    private final String fullName;
    private int magicPower;
    private int apparitionDistance;

    public HogwartsStudent(String fullName, int magicPower, int apparitionDistance) {
        this.fullName = fullName;
        this.magicPower = magicPower;
        this.apparitionDistance = apparitionDistance;
    }

    public String getFullName() {
        return fullName;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getApparitionDistance() {
        return apparitionDistance;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setApparitionDistance(int apparitionDistance) {
        this.apparitionDistance = apparitionDistance;
    }
    private int commonSkillPointSum() {
        return magicPower + apparitionDistance;
    }
    public void commonCompareTo(HogwartsStudent other) {
        if (commonSkillPointSum() > other.commonSkillPointSum()) {
            System.out.println(fullName + " обладает большей магической силой, чем " + other.fullName);
        }
        else if (commonSkillPointSum() < other.commonSkillPointSum()) {
            System.out.println(other.fullName + " обладает большей магической силой, чем " + fullName);
        }
        else {
            System.out.println("Магическая сила " + fullName + " и " + other.fullName + " равна");
        }
    }
    @Override
    public String toString() {
        return "Студент: " + fullName + " (очки магии: " + magicPower + " расстояние трансгрессии: " + apparitionDistance + ")";
    }



}
