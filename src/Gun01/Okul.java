package Gun01;

public class Okul {

    private int okulNo;
    private String okulAd;

    public Okul(int okulNo, String okulAd) {
        setOkulNo(okulNo);
        setOkulAd(okulAd);
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }

    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    @Override
    public String toString() {
        return "Okul{" +
                "okulNo=" + okulNo +
                ", okulAd='" + okulAd + '\'' +
                '}';
    }
}
