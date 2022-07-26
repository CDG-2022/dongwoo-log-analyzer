import java.util.Arrays;

public class ApiServiceId {
    private int blog;
    private int book;
    private int image;
    private int knowledge;
    private int news;
    private int vclip;
    private String first;
    private String second;
    private String third;
    private int[] tab;

    public void addBlog() {
        this.blog++;
    }

    public void addBook() {
        this.book++;
    }

    public void addImage() {
        this.image++;
    }

    public void addKnowledge() {
        this.knowledge++;
    }

    public void addNews() {
        this.news++;
    }

    public void addVclip() {
        this.vclip++;
    }

    public void top3Sort() {
        int tmp;
        tab = new int[]{blog, book, image, knowledge, news, vclip};

        for (int i=0; i<tab.length; i++) System.out.print(tab[i]+ "/ ");

        Arrays.sort(tab);

        for (int i=0; i<tab.length; i++) System.out.print(tab[i]+ "/ ");

        int length = tab.length - 1;
        if(tab[length] == blog) {
            first = "blog";
        } else if(tab[length] == book) {
            first = "book";
        } else if(tab[length] == image) {
            first = "image";
        } else if(tab[length] == knowledge) {
            first = "knowledge";
        } else if(tab[length] == news) {
            first = "news";
        } else if(tab[length] == vclip) {
            first = "vclip";
        }
        if(tab[length - 1] == blog) {
            second = "blog";
        } else if(tab[length - 1] == book) {
            second = "book";
        } else if(tab[length - 1] == image) {
            second = "image";
        } else if(tab[length - 1] == knowledge) {
            second = "knowledge";
        } else if(tab[length - 1] == news) {
            second = "news";
        } else if(tab[length - 1] == vclip) {
            second = "vclip";
        }
        if(tab[length - 2] == blog) {
            third = "blog";
        } else if(tab[length - 2] == book) {
            third = "book";
        } else if(tab[length - 2] == image) {
            third = "image";
        } else if(tab[length - 2] == knowledge) {
            third = "knowledge";
        } else if(tab[length - 2] == news) {
            third = "news";
        } else if(tab[length - 2] == vclip) {
            third = "vclip";
        }
    }
    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    public String getThird() {
        return third;
    }

}
