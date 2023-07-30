public class Main {
    public static void main(String[] args) {
        Author henry = new Author("О", "Генри");
        Author murakami = new Author("Харуки", "Мураками");

        Book soulMates = new Book("Родственные души", henry, 1911);
        Book kafka = new Book("Кафка на пляже", murakami, 2002);

        System.out.println(soulMates.getTitle() + ' ' + soulMates.getPublishingYear() + ' ' + soulMates.getAuthor().getFirstName() + ' ' + soulMates.getAuthor().getSecondName());
        System.out.println(kafka.getTitle() + ' ' + kafka.getPublishingYear() + ' ' + kafka.getAuthor().getFirstName() + ' ' + kafka.getAuthor().getSecondName());
    }
}