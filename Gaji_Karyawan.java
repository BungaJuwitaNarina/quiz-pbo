import java.text.DecimalFormat;
import java.util.Scanner;
public class Gaji_Karyawan {
    public String nama, nik, jabatan;
    static double gaji;
    int tambahan,total;
    
    double getGajiPokok(){
        if(jabatan == "Programmer"){
            gaji = 7000000;
        }else if(jabatan == "Manager"){
            gaji = 6000000;
        }else{
            gaji = 5000000;
        }
        return gaji;
    }

    void cetak_hasil(){
        DecimalFormat df = new DecimalFormat();
        System.out.println("----------------DATA GAJI KARYAWAN-------------");
        System.out.println("----------------------oOo----------------------");
        System.out.println("No         :  "+ this.nik);
        System.out.println("Nama       :  "+ this.nama);
        System.out.println("Jabatan    :  "+ this.jabatan);
        System.out.println("Gaji Pokok :  "+df.format(getGajiPokok()));
    }
    
    int tunjangan(int gaji, String jabatan){
        if (jabatan == "supervisor"){
            tambahan = 3000000;
        }else if(jabatan == "manager"){
            tambahan = 5000000;
        }
        return total;
    }

    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        Gaji_Karyawan b = new Gaji_Karyawan();
        
        System.out.print("Nomor Karyawan: ");
        b.nik = sc.next();

        System.out.print("Nama          : ");
        b.nama = sc.next();

        System.out.print("Bagian        : ");
        b.jabatan = sc.next();
        System.out.println("");

        b.cetak_hasil();

    }
}