public class Print {
    private String stFirst;
    private String stSecond;
    private String stThird;
    private String stFourth;

    private StringBuffer first = new StringBuffer();
    private StringBuffer second = new StringBuffer();
    private StringBuffer third = new StringBuffer();
    private StringBuffer fourth = new StringBuffer();

    public Print(String stFirst, String stSecond, String stThird, String stFourth) {
        this.stFirst = stFirst;
        this.stSecond = stSecond;
        this.stThird = stThird;
        this.stFourth = stFourth;
    }

    public void Setting() {
        first.append(stFirst);
        second.append(stSecond);
        third.append(stThird);
        fourth.append(stFourth);
        first.deleteCharAt(0);
        second.deleteCharAt(0);
        third.deleteCharAt(0);
        fourth.deleteCharAt(0);
    }

    public void PrintResult(){
        System.out.println("first = " + first + " second = " + second + " third = " + third + "  = " + fourth);
    }

}
