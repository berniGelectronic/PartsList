package Parts_A;


import Parts_A.Parts;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bernard
 */
public class modules extends Parts {

    private String barcode;
    private String descrip;
    private String softwareVersion;
    private String place;
    Date lastSavedDate = new Date();
    Date addedDate = new Date();

    public String getPlace() {
        return place;
    }

//    public void setPlace(String place) {
//        this.place = place;
//    }

    public Date getLastSavedDate() {
        return lastSavedDate;
    }

    public void setLastSavedDate(Date lastSavedDate) {
        this.lastSavedDate = lastSavedDate;
    }

    public Date getAddedDate() {
        return addedDate;
    }

//    public void setAddedDate(Date currentDate) {
//        this.addedDate = currentDate;
//    }
    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public modules(String barCode, String description, int pcs, Date currentDate, Date lastSaved, String placeSelected) {
        super.setPcs(pcs);
        this.barcode = barCode;
        this.descrip = description;
        this.addedDate = currentDate;
        this.lastSavedDate = lastSaved;
        this.place=placeSelected;
        
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDescription() {
        return descrip;
    }
    public void setDescriptin(String des)
    {
        this.descrip=des;
    }
//
//    public void setSerial_TV(String serial_TV) {
//        this.serial_TV = serial_TV;
//    }
//

    public String getbarCode() {
        return barcode;
    }
    
//
//    public void setAdditional_info(String additional_info) {
//        this.additional_info = additional_info;
//    }

}
