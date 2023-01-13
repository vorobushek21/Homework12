public class Main {
    public static void main(String[] args) {
        Author fightClubAuthor = new Author("Chuck", "Palahniuk");
        Book fightClub = new Book("Fight Club", 1996, fightClubAuthor);
        System.out.println(fightClub);
        System.out.println(fightClub.getAuthorName());
        System.out.println(fightClub.getBookName());
        System.out.println(fightClub.getYear());
        fightClub.setYear(2001);
        System.out.println(fightClub.getYear());
        System.out.println();

        Author flowersForAlgernonAuthor = new Author("Daniel", "Keyes");
        Book flowersForAlgernon = new Book("Flowers for Algernon", 1959, flowersForAlgernonAuthor);
        System.out.println(flowersForAlgernon);
        System.out.println(flowersForAlgernon.getAuthorName());
        System.out.println(flowersForAlgernon.getBookName());
        System.out.println(flowersForAlgernon.getYear());
        flowersForAlgernon.setYear(1960);
        System.out.println(flowersForAlgernon.getYear());

        if (fightClubAuthor.equals(flowersForAlgernonAuthor)) {
            System.out.println("Книги написал один автор");
        } else {
            System.out.println("Книги написаны разными авторами");
        }

        if (fightClub.equals(flowersForAlgernon)) {
            System.out.println("Это одна и та же книга");
        } else {
            System.out.println("Это разные книги");
        }
    }
}