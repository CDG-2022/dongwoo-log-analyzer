public class Result {
    private String first;
    private String second;
    private String third;
    private String fourth;

    private StringBuffer sbFirst = new StringBuffer();
    private StringBuffer sbSecond = new StringBuffer();
    private StringBuffer sbThird = new StringBuffer();
    private StringBuffer sbFourth = new StringBuffer();

    private ApiServiceId apiServiceId = new ApiServiceId();
    private StateCode stateCode = new StateCode();
    private PercentageBrowser percentageBrowser = new PercentageBrowser();
    private PeakTime peakTime = new PeakTime();
    private MaxApi maxApi = new MaxApi();

    public void setFirst(String first) {
        this.first = first;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public void setThird(String third) {
        this.third = third;
    }

    public void setFourth(String fourth) {
        this.fourth = fourth;
    }

    public void Setting() {
        sbFirst.append(first);
        sbSecond.append(second);
        sbThird.append(third);
        sbFourth.append(fourth);
        sbFirst.deleteCharAt(0);
        sbSecond.deleteCharAt(0);
        sbThird.deleteCharAt(0);
        sbFourth.deleteCharAt(0);
        first = sbFirst.toString();
        second = sbSecond.toString();
        third = sbThird.toString();
        fourth = sbFourth.toString();
        sbFirst.setLength(0);
        sbSecond.setLength(0);
        sbThird.setLength(0);
        sbFourth.setLength(0);
    }

    public void ResultMaxApi() {

    }

    public void ResultStateCode() {
        if(first.equals("10")) {
            stateCode.addTen();
        }else if(first.equals("200")) {
            stateCode.addTwoHund();
        }else if(first.equals("404")) {
            stateCode.addFourZeroFour();
        }
    }

    public void ResultApiServiceId() {

    }

    public void ResultPeakTime() {

    }

    public void ResultPercentageBrowser() {
        int IE = 0, FireFox = 0, Safari = 0, Chrome = 0, Opera = 0;
        if(third == "IE") {
            IE++;
        }else if(third == "FireFox") {
            FireFox++;
        }else if(third == "Safari") {
            Safari++;
        }else if(third == "Chrome") {
            Chrome++;
        }else if(third == "Opera") {
            Opera++;
        }
        int total = IE + FireFox + Safari + Chrome + Opera;
        System.out.println("웹 브라우저 별 사용비율");
        System.out.println("IE : " + IE/total*100);
        System.out.println("FireFox" + FireFox/total*100);
        System.out.println("Safari" + Safari/total*100);
        System.out.println("Chrome : " + Chrome/total*100);
        System.out.println("Opera : " + Opera/total*100);
    }

    public void PrintResult() {
        System.out.println("상태코드 별 횟수");
        System.out.println("10 : " + stateCode.getTen());
        System.out.println("200 : " + stateCode.getTwoHund());
        System.out.println("404 : " + stateCode.getFourZeroFour());
    }
}
