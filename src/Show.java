import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;

    private ArrayList<Actor> listOfActors;

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
        int countSurName = 0;
        int index = -1;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surname)) {
                countSurName++;
                index = i;
            }
        }

        switch (countSurName) {
            case 0 -> System.out.println("Актёр с такой фамилией не найден.");
            case 1 -> listOfActors.set(index, newActor);

            default -> System.out.println("Найдено несколько актёров с такой фамилией. Замена невозможна.");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(ArrayList<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }
}
