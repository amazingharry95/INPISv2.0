/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InpisController;

import InpisModel.*;
import java.util.Date;
import java.sql.ResultSet;
/**
 *
 * @author amazingharry95
 */
public class ControlMaster {
    Personil personil = new Personil();
    Istri istri = new Istri();
    Anak anak = new Anak();
    Admin admin = new Admin();
    
    //control untuk mengambil seluruh data personil
    public ResultSet getPersonilData(){
        return personil.getAllData();
    }
    
    //control untuk insert data Personil
    public ResultSet InsertPersonilData(String NRP, String agamaPersonil, String golDarahPersonil, String jabatan, String korps, 
            String namaPersonil, String noASABRI, String noBPJS, String noKTA, String noNPWP, String noTelepon, String pangkat, 
            String penMiliter, String penPengembang, String penUmum, String statusKeluarga, String statusRumah, Date tamatJabatan, 
            Date tamatTNI, String tglLahirPersonil, String tmptLahirPersonil, Date tmtPangkatPertama, Date tmtPangkatTerakhir, 
            String alamatPersonil) {
        return personil.setPersonilData(NRP, agamaPersonil, golDarahPersonil, jabatan, korps, namaPersonil, noASABRI, noBPJS, 
                noKTA, noNPWP, noTelepon, pangkat, penMiliter, penPengembang, penUmum, statusKeluarga, statusRumah,
                tamatJabatan, tamatTNI, tglLahirPersonil, tmptLahirPersonil, tmtPangkatPertama, tmtPangkatTerakhir,
                alamatPersonil);
    }
    
    //control untuk insert data Istri
    public ResultSet InsertIstriData(String NRP, String agamaIstri, String golDarahIstri, String KPIIstri, 
            String KTAJalasenastri, String metodeKb, String penTerakhirIstri, String tmptLahirIstri, String namaIstri,
            String tglLahirIstri, String hobi1, String hobi2) {
        return istri.setIstriData(NRP, agamaIstri, golDarahIstri, KPIIstri, KTAJalasenastri, metodeKb, penTerakhirIstri, 
                tmptLahirIstri, tglLahirIstri, namaIstri, hobi1, hobi2);
    }
            
    //control untuk insert data Anak
    public ResultSet InsertAnakData(String NRP, String tglLahirAnak, String tmptLahirAnak, 
            String namaAnak) {
        return anak.setAnakData(NRP, tglLahirAnak, tmptLahirAnak, namaAnak);
    }
    
    //control untuk login
    public ResultSet Login(String username, String password) {
        return admin.Login(username, password);
    }
        
//    // control untuk lihat detail personil yang dipilih
//    public ResultSet getPersonilData(String NRP) {
//        return personil.getPersonilbyID(NRP);
//    }

}