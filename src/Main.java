public class Main {
    public static void main(String[] args) {

        Author goncharov = new Author("Гончаров", "Иван", "Александрович");
        Book oblomov = new Book("Обломов", goncharov, 1860);
        oblomov.setYear(1859);
        System.out.println(oblomov);
        Author gogol = new Author("Гоголь", "Николай", "Васильевич");
        Book revizor = new Book("Ревизор", gogol, 1835);
        revizor.setYear(1836);
        System.out.println(revizor);
        System.out.println(oblomov.equals(revizor));
    }
}