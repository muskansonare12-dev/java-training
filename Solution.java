
import java.util.*;

class travelagencies {
    private int regNo;
    private String agencyName;
    private String packageType;
    private int Price;
    private boolean flightFacility;

    travelagencies(int regNO, String agencyName, String packageType, int price, boolean flightFacility) {
        this.regNo = regNO;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.Price = price;
        this.flightFacility = flightFacility;
    }

    public int getNo() {
        return regNo;
    }

    public void setNo(int regNo) {
        this.regNo = regNo;
    }

    public String getagencyName() {
        return agencyName;

    }

    public void setagencyName(String agencyName) {
        this.agencyName = agencyName;

    }

    public String getpackageType() {
        return packageType;
    }

    public void setpackageType(String packageType) {
        this.packageType = packageType;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public boolean getflightFacility() {
        return flightFacility;
    }

    public void setflightFacility(boolean flightFacility) {
        this.flightFacility = flightFacility;
    }

}

public class Solution {

    static travelagencies agencyDetailsforGivenAndType(travelagencies[] arr, int regNo, String packageType) {
        for (travelagencies agency : arr) {
            if (agency.getflightFacility() && agency.getNo() == regNo
                    && agency.getpackageType().equalsIgnoreCase(packageType)) {
                return agency;
            }
        }
        return null;

    }

    static int findAgencyWithHigestPrice(travelagencies[] arr) {
        int max = 0;
        for (travelagencies agency : arr) {

            if (agency.getPrice() > max) {
                max = agency.getPrice();
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        travelagencies[] arr = new travelagencies[n];
        for (int i = 0; i < n; i++) {
            int regNo = sc.nextInt();
            sc.nextLine();
            String agencyName = sc.nextLine();
            String packageType = sc.nextLine();
            int Price = sc.nextInt();
            boolean flightFacility = sc.nextBoolean();
            travelagencies t = new travelagencies(regNo, agencyName, packageType, Price, flightFacility);
            arr[i] = t;
        }
        int regNo = sc.nextInt();
        sc.nextLine();
        String packageType = sc.nextLine();
        System.out.println("------------------------\noutput\n--------------------------");

        int highhestprice = findAgencyWithHigestPrice(arr);
        travelagencies agency = agencyDetailsforGivenAndType(arr, regNo, packageType);

        System.out.println("highest price:" + highhestprice);
        if (agency != null) {
            System.out.println(agency.getagencyName() + ": " + agency.getPrice());
        }

    }

}
