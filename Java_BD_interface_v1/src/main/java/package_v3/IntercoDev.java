package package_v3;


public class IntercoDev {
    /* Attributs */
    private String intercoDevName;
    private String typeIntercoDev;
    private String Os;
    private String siteName;
    private String numRoom;
    
    /* Constructor */
    public IntercoDev(String intercoDevName, String typeIntercoDev, String Os, String siteName, String numRoom){
        this.intercoDevName = intercoDevName;
        this.typeIntercoDev = typeIntercoDev;
        this.Os = Os;
        this.siteName = siteName;
        this.numRoom = numRoom;
    }
    
    /* Methods */
    public String getIntercoDevName() {
        return intercoDevName;
    }
    public void setIntercoDevName(String intercoDevName) {
        this.intercoDevName = intercoDevName;
    }
    public String getTypeIntercoDev() {
        return typeIntercoDev;
    }
    public void setTypeIntercoDev(String typeIntercoDev) {
        this.typeIntercoDev = typeIntercoDev;
    }
    public String getOs() {
        return Os;
    }
    public void setOs(String Os) {
        this.Os = Os;
    }
    public String getSiteName() {
        return siteName;
    }
    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }
    public String getNumRoom() {
        return numRoom;
    }
    public void setNumRoom(String numRoom) {
        this.numRoom = numRoom;
    }

}
