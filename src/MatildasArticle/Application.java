package MatildasArticle;

public class Application {
    public static void main(String[] args) {
        Article article = new Article("khajg","akfj;akfkjal");
        Printer printer = new Printer();
        printer.print(article);
    }
}
