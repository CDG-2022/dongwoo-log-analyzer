public class Print {
    private String key;
    private String code;
    private String id;
    private String time;
    private String browser;
    private String first;
    private String second;
    private String third;
    private String fourth;

    public Print(String first, String second, String third, String fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    public void printResult(){
        System.out.println("first = " + first + " second = " + second + " third = " + third + "  = " + fourth);
    }

}
