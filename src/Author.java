public class Author {

    private String surname;
    private String name;
    private String patronymic;


    public Author(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getName() {
        return this.name;
    }

    public String getPatronymic() {
        return this.patronymic;
    }

    public String toString() {
        return surname + " " + name + " " + patronymic;
    }
}
