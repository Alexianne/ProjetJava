package package_v3;


public class NetworkCard {
    
    /* Attributes */
    private String devName; 
    private String intercoDevName;
    private String macAddr;
    private String ipAddr;

    /* Constructor */
    public NetworkCard(String devName,String intercoDevName, String macAddr, String ipAddr){
        this.devName = devName;
        this.intercoDevName = intercoDevName;
        this.macAddr = macAddr;
        this.ipAddr = ipAddr;
    }
    
    /* Methods */
    public String getDevName() {
        return devName;
    }
    public void setDevName(String devName) {
        this.devName = devName;
    }
    public String getIntercoDevName() {
        return intercoDevName;
    }
    public void setIntercoDevName(String intercoDevName) {
        this.intercoDevName = intercoDevName;
    }
    public String getMacAddr() {
        return macAddr;
    }
    public void setMacAddr(String macAddr) {
        this.macAddr = macAddr;
    }
    public String getIpAddr() {
        return ipAddr;
    }
    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }
    // fonction à faire
    public String generateMacAddr(String maker){
        String macAddress="AB:CD:EF:01:23:45";
        //select début mac avec constructeur
        //random fin mac (test non existant)
        return macAddress;
    }
    public String generateIpAddr(IntercoDev intercoDev){
        String ipAddress="192.168.0.1";
        //select préfix ip avec intercoDev
        //random fin ip (test non existant)
        return ipAddress;
    }
    
}
	