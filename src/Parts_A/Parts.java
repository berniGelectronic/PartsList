package Parts_A;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Nije definirnao samo za TV module, već i za popis ostalih stvari
 *
 * @author Bernard
 */
 public abstract class Parts {

    private String manufacturer;
    private int pcs;
//    private String place;
//   
//
//    public String getContainer() {
//        return place;
//    }
//
//    public void setContainer(String container) {
//        this.place = container;
//    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPcs() {
        return pcs;
    }

    public void setPcs(int pcs) {
        if (pcs > 0) {
            this.pcs = pcs;
        } else {
            this.pcs = 0;
        }
    }

}
