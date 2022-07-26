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
        if(third.equals("IE")) {
            percentageBrowser.addIE();
        }else if(third.equals("Firefox")) {
            percentageBrowser.addFireFox();
        }else if(third.equals("Safari")) {
            percentageBrowser.addSafari();
        }else if(third.equals("Chrome")) {
            percentageBrowser.addChrome();
        }else if(third.equals("Opera")) {
            percentageBrowser.addOpera();
        }
    }

    public void PrintResult() {

        System.out.println("상태코드 별 횟수");
        System.out.println("10 : " + stateCode.getTen());
        System.out.println("200 : " + stateCode.getTwoHund());
        System.out.println("404 : " + stateCode.getFourZeroFour());

        System.out.println("웹 브라우저 별 사용비율");
        System.out.println("IE : " + (double)percentageBrowser.getIE()/(double)percentageBrowser.getTotal()*100 + "%");
        System.out.println("FireFox : " + (double)percentageBrowser.getFireFox()/(double)percentageBrowser.getTotal()*100 + "%");
        System.out.println("Safari : " + (double)percentageBrowser.getSafari()/(double)percentageBrowser.getTotal()*100 + "%");
        System.out.println("Chrome : " + (double)percentageBrowser.getChrome()/(double)percentageBrowser.getTotal()*100 + "%");
        System.out.println("Opera : " + (double)percentageBrowser.getOpera()/(double)percentageBrowser.getTotal()*100 + "%");


    }
}
