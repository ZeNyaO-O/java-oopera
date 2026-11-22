import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        ArrayList<Actor> showActors = new ArrayList<>();
        ArrayList<Actor> balletActors = new ArrayList<>();
        ArrayList<Actor> operaActors = new ArrayList<>();


        Actor actor1 = new Actor("Александр", "Морозов", Gender.MALE, 183);
        Actor actor2 = new Actor("Мария", "Морозова", Gender.FEMALE, 168);
        Actor actor3 = new Actor("Дмитрий", "Волков", Gender.MALE, 155);
        //Actor actor4 = new Actor("Андрей", "Волков", Gender.MALE, 180);

        Director director1 = new Director("Сергей", "Петров", Gender.MALE, 12);
        Director director2 = new Director("Анна", "Смирнова", Gender.FEMALE, 6);

        Person choreographer = new Person("Юрий", "Григорович", Gender.MALE);

        Person musicAuthorBallet = new Person("Арам", "Хачатурян", Gender.MALE);
        Person musicAuthorOpera = new Person("Пётр", "Чайковский", Gender.MALE);


        Show show = new Show("Ревизор", 120, director1, showActors);
        show.addActor(actor1);
        show.addActor(actor2);
        Ballet ballet = new Ballet("Спартак", 180, director2, balletActors, musicAuthorBallet,
                "Восстание гладиаторов под предводительством Спартака", choreographer);
        ballet.addActor(actor2);
        ballet.addActor(actor3);
        //ballet.addActor(actor4);
        Opera opera = new Opera("Евгений Онегин", 160, director1, operaActors, musicAuthorOpera,
                "История любви Татьяны Лариной и Евгения Онегина", 40);
        opera.addActor(actor1);
        opera.addActor(actor3);


        System.out.println("Спектакль: " + show.getTitle());
        System.out.println("Режиссёр:");
        show.printDirector();
        System.out.println("Актёры:");
        show.printActors();
        System.out.println();

        System.out.println("Спектакль: " + ballet.getTitle());
        System.out.println("Режиссёр:");
        ballet.printDirector();
        System.out.println("Актёры:");
        ballet.printActors();
        System.out.println();

        System.out.println("Спектакль: " + opera.getTitle());
        System.out.println("Режиссёр:");
        opera.printDirector();
        System.out.println("Актёры:");
        opera.printActors();
        System.out.println();

        ballet.replaceActor("Морозова", actor1);
        ballet.printActors();
        System.out.println();

        opera.replaceActor("Сидоров", actor2);
        System.out.println();

/*      ballet.replaceActor("Волков", actor2);
        ballet.printActors();*/

        ballet.printLibretto();
        System.out.println();
        opera.printLibretto();
    }
}
