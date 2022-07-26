public class PercentageBrowser {
    private int IE = 0;
    private int FireFox = 0;
    private int Safari = 0;
    private int Chrome = 0;
    private int Opera = 0;
    private int total = 0;

    public void addIE() {
        this.IE++;
    }

    public void addFireFox() {
        this.FireFox++;
    }

    public void addSafari() {
        this.Safari++;
    }

    public void addChrome() {
        this.Chrome++;
    }

    public void addOpera() {
        this.Opera++;
    }

    public int getTotal() {
        this.total = IE + FireFox + Safari + Chrome + Opera;
        return this.total;
    }

    public int getIE() {
        return IE;
    }

    public int getFireFox() {
        return FireFox;
    }

    public int getSafari() {
        return Safari;
    }

    public int getChrome() {
        return Chrome;
    }

    public int getOpera() {
        return Opera;
    }
}
