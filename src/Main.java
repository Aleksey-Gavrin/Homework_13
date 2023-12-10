public class Main {
    public static void main(String[] args) {
//        Harry Potter, Hermione Granger, Ronald Weasley
//        Draco Malfoy, Graham Montague, Gregory Goyle
//        Cho Chang, Padma Patil, Marcus Belby
//        Zacharias Smith, Cedric Diggory, Justin Finch-Fletchley
        GryffindorStudent harry = new GryffindorStudent("Harry Potter", 10,60,57,
                44,30);
        GryffindorStudent hermione = new GryffindorStudent("Hermione Granger", 65,44,67,
                52,43);
        GryffindorStudent ronald = new GryffindorStudent("Ronald Weasley", 29,55,53,
                27,90);
        SlytherinStudent draco = new SlytherinStudent("Draco Malfoy", 16,15,57,
                37,81,72,97);
        SlytherinStudent graham = new SlytherinStudent("Graham Montague", 60,28,63,
                59,47,72,35);
        SlytherinStudent gregory = new SlytherinStudent("Gregory Goyle", 67,73,38,
                84,17,53,3);
        RavenclawStudent cho = new RavenclawStudent("Cho Chang", 11, 12, 67,
                21, 97, 69);
        RavenclawStudent padma = new RavenclawStudent("Padma Patil", 98, 65, 69,
                41, 85, 42);
        RavenclawStudent marcus = new RavenclawStudent("Marcus Belby", 91, 23, 70,
                48, 86, 34);
        HufflepuffStudent zacharias = new HufflepuffStudent("Zacharias Smith", 41, 65, 19,
                36, 27);
        HufflepuffStudent cedric = new HufflepuffStudent("Cedric Diggory", 27, 40, 69,
                41, 28);
        HufflepuffStudent justin = new HufflepuffStudent("Justin Finch-Fletchley", 94, 37, 18,
                39, 16);
        HogwartsStudent[] students = new HogwartsStudent[] {harry, hermione, ronald, draco, graham, gregory, cho, padma,
            marcus, zacharias, cedric, justin};
        for (HogwartsStudent i: students) {
            System.out.println(i);
        }
        System.out.println("********************************");
        harry.commonCompareTo(draco);
        System.out.println("********************************");
        harry.innerCompareTo(hermione);
        System.out.println("********************************");
        cho.innerCompareTo(padma);
    }
}