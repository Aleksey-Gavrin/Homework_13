public class SlytherinStudent extends HogwartsStudent {
    private int cunning;
    private int resoluteness;
    private int ambition;
    private int inventiveness;
    private int lustForPower;

    public SlytherinStudent(String fullName, int magicPower, int apparitionDistance, int cunning, int resoluteness, int ambition,
                            int inventiveness, int lustForPower) {
        super(fullName, magicPower, apparitionDistance);
        this.cunning = cunning;
        this.resoluteness = resoluteness;
        this.ambition = ambition;
        this.inventiveness = inventiveness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getResoluteness() {
        return resoluteness;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getInventiveness() {
        return inventiveness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setResoluteness(int resoluteness) {
        this.resoluteness = resoluteness;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setInventiveness(int inventiveness) {
        this.inventiveness = inventiveness;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    private int innerSkillPointSum() {
        return cunning + resoluteness + ambition + inventiveness + lustForPower;
    }

    public void innerCompareTo(SlytherinStudent other) {
        if (innerSkillPointSum() > other.innerSkillPointSum()) {
            System.out.println(getFullName() + " лучший ученик Слизерина, чем " + other.getFullName());
        } else if (innerSkillPointSum() < other.innerSkillPointSum()) {
            System.out.println(other.getFullName() + " лучший ученик Слизерина, чем " + getFullName());
        } else {
            System.out.println(getFullName() + " и " + other.getFullName() + " одинаково хорошие ученики Слизерина");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "(хитрость: " + cunning + " решительность: " + resoluteness + " амбициозность: " + ambition +
                " находчивость: " + inventiveness + " жажда власти: " + lustForPower + ")";
    }
}