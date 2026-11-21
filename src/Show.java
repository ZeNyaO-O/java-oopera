import java.util.ArrayList;

public class Show {
    private final String title;
    private final int duration;
    private final Director director;

    private final ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printDirector() {
        System.out.println(director.toString());
    }

    public void printActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }

    public void addActor(Actor actor) {
        if (!listOfActors.contains(actor)) {
            listOfActors.add(actor);
        } else {
            System.out.println("Этот актёр уже участвует в спектакле.");
        }
    }

    public void replaceActor(String surname, Actor newActor) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surname)) {
                listOfActors.set(i, newActor);
                return;
            }
        }
        System.out.println("Актёр с такой фамилией не найден.");
    }

    public String getTitle() {
        return title;
    }
}
