
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import static java.nio.file.Files.delete;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


interface Müşteriİşlemleri{
    public void bakiyeKontrol();
    public void paraÇekme(String amountToBeDraw);
    public void paraYatırma(String amountToBeDeposited);
    public void paraTransferi(String amountToBeSent,String accountThatAmountToBeSent);
    public void toplamBorçKontrol();
    public void krediÇekme(String creditAmount);
    public void krediBorçÖdeme(String amountPayingCreditDebt);
    public void krediBorçKontrol();
    public void limitKontrol();
    public void krediKartıParaÇekme(String creditCardDrawAmount);
    public void krediKartıBorçÖdeme(String amountPayingCreditCardDebt);
    public void krediKartıBorçKontrol();
}


interface Personelİşlemleri{
    public void maaşÇek(String amountToBeDraw);
    public void maaşHesabınıGör();
    public void müşteriHesabınıKapat(String customerID);
    public void müşteriKrediKartıOluştur(String customerID,String creditCardLimit);
    public void müşteriKrediKartıKapat(String customerID);
    public void müşteriKrediKartıLimitArttır(String customerID,String newLimit);
    public void müşteriLimitGör(String customerID);
    public void müşteriBilgisiGörüntüle(String customerID);
}

interface Yöneticiİşlemleri{
    public void personelMaaşBelirle(String staffID,String staffSalary);
    public void personelBilgisiGörüntüle(String staffName,String staffSurname);
    public void personelKaydıSil(String staffID );
    public void personelMaaşÖde();
}


abstract class Kullanıcı{
    String ad,soyad,şifre,ID;

    public Kullanıcı(String ad, String soyad, String şifre,String ID) {
        this.ad = ad;
        this.soyad = soyad;
        this.şifre = şifre;
        this.ID=ID;
    }
    public Kullanıcı(String ad, String soyad, String şifre) {
        this.ad = ad;
        this.soyad = soyad;
        this.şifre = şifre;
    }
    public Kullanıcı(String şifre){
        this.şifre=şifre;
    }
    public Kullanıcı(){
        
    }
    abstract public void kayıtİşlemleri();
    abstract public void giriş();
}






class Müşteri extends Kullanıcı implements Müşteriİşlemleri{
    
    String anapara,borç,krediKartıNumarası,krediKartıLimiti,krediKartıBorcu,krediBorcu;
    
     public Müşteri(String ad, String soyad, String şifre,String ID,String anapara,String borç,String krediKartıNumarası,String krediKartıLimiti,String krediKartıBorcu,String krediBorcu) {
        super(ad, soyad, şifre,ID);
        this.anapara=anapara;
        this.borç=borç;
        this.krediKartıNumarası=krediKartıNumarası;
        this.krediKartıBorcu=krediKartıBorcu;
        this.krediKartıLimiti=krediKartıLimiti;
        this.krediBorcu=krediBorcu;
    }
    
    public Müşteri(String ad, String soyad, String şifre,String ID) {
        super(ad, soyad, şifre,ID);
    }
    public Müşteri(String ad,String soyad,String şifre){
        super(ad, soyad, şifre);
    }
    public Müşteri(String şifre){
        super(şifre);
    }
    public Müşteri (){
        
    }
    

    @Override
    public void kayıtİşlemleri() {
        
                
        try {
            
            String accountNameControl=this.ad;
            String accountSurnameControl=this.soyad;
            String accountPasswordControl=this.şifre;
            
            Boolean a=false;
            Boolean b=false;
            Boolean c=false;
            
            Scanner scan=new Scanner(new File("Müşteriler.txt"));
            
            String Kelime;
            
            while(scan.hasNext()){
                Kelime=scan.next();
                if(Kelime.equals(accountNameControl)){
                    a=true;
                }
                Kelime=scan.next();
                if(Kelime.equals(accountSurnameControl)){
                    b=true;
                }
                Kelime=scan.next();
                if(Kelime.equals(accountPasswordControl)){
                    c=true;
                }
                scan.next();
            }
            
            scan.close();
            
            if(a==true && b==true){
                JOptionPane.showMessageDialog(null, "Böyle bir kullanıcı zaten var.");
            }
            
            else if (c==true){
                JOptionPane.showMessageDialog(null, "Lütfen farklı bir şifre girin.");
            }
            else{
                
            int x =(int)(Math.random()*9);
            x=x+1;
            String müşteriID =(x+"")+(((int)(Math.random()*1000))+"");
           
                
            BufferedWriter bw=new BufferedWriter(new FileWriter("Müşteriler.txt",true));
            
            bw.write(this.ad+" ");
            bw.write(this.soyad+" ");
            bw.write(this.şifre+" ");
            bw.write(müşteriID+"\n");
            
            bw.close();
            
            
            File oldFile=new File("Müşteriler.txt");
            File newFile=new File("Temp.txt");
            
            Scanner file =new Scanner(oldFile);
            PrintWriter writer=new PrintWriter(newFile);
            
            while(file.hasNext()){
                String line =file.nextLine();
                if(!line.isEmpty()){
                    writer.write(line);
                    writer.write("\n");
                }
            }
            
            file.close();
            writer.close();
            oldFile.delete();
            File yeni=new File("Müşteriler.txt");
            newFile.renameTo(yeni);
            
            
            
            BufferedWriter bw2=new BufferedWriter(new FileWriter("MüşteriHesapBilgileri.txt",true));
            bw2.write(this.şifre);
            bw2.write(" "+müşteriID);
            bw2.write(" "+0); //Anapara
            bw2.write(" "+0); //Borç
            bw2.write(" "+0); //Kredi kartı numarası
            bw2.write(" "+0); //Kredi kartı limiti
            bw2.write(" "+0); //Kredi kartı borcu
            bw2.write(" "+0+"\n"); //Kredi borcu
            
            bw2.close();
            
            
            File oldFile2=new File("MüşteriHesapBilgileri.txt");
            File newFile2=new File("Temp2.txt");
            
            Scanner file2 =new Scanner(oldFile2);
            PrintWriter writer2=new PrintWriter(newFile2);
            
            while(file2.hasNext()){
                String line2 =file2.nextLine();
                if(!line2.isEmpty()){
                    writer2.write(line2);
                    writer2.write("\n");
                }
            }
            
            file2.close();
            writer2.flush();
            writer2.close();
            oldFile2.delete();
            File yeni2=new File("MüşteriHesapBilgileri.txt");
            newFile2.renameTo(yeni2);
            
            String message="Müşteri ID'niz "+müşteriID+".Lütfen ID'nizi unutmayınız."; 
            
            JOptionPane.showMessageDialog(null, "Kaydınız tamamlandı.");
            JOptionPane.showMessageDialog(null,message );
            
            Main.loginAc();
           }
        } catch (IOException ex) {
            Logger.getLogger(Müşteri.class.getName()).log(Level.SEVERE, null, ex);
        }
              
    }
    public void kayıtİşlemleri(String newAccountPassword){
        
        
        try {
            
            
            String tempFile="temp.txt";
            File oldFile=new File("Müşteriler.txt");
            File newFile=new File(tempFile);
            
            String ad="";
            String soyad="";
            String şifre="";
            String ID="";
            Boolean d=false;
            
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(tempFile,true)));
            Scanner scan= new Scanner(new File("Müşteriler.txt"));
            scan.useDelimiter("[ \n]");
            
            while(scan.hasNext()){
                ad=scan.next();
                soyad=scan.next();
                şifre=scan.next();
                ID=scan.next();
                
                if(şifre.equals(this.şifre)){
                    pw.println(ad+" "+soyad+" "+newAccountPassword+" "+ID);
                    
                    d=true;
                    JOptionPane.showMessageDialog(null, "Şifreniz başarıyla değiştirildi");
                }
                
                else{
                    pw.println(ad+" "+soyad+" "+şifre+" "+ID);
                }
            }   
            
            if(d==false){
                JOptionPane.showMessageDialog(null, "Şifre değiştirme işlemi başarısız.");
            }
            
            scan.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File yeni=new File("Müşteriler.txt");
            newFile.renameTo(yeni);
            
            
            
            File oldFile2=new File("Müşteriler.txt");
            File newFile2=new File("Temp.txt");
            
            Scanner file2 =new Scanner(oldFile2);
            PrintWriter writer2=new PrintWriter(newFile2);
            
            while(file2.hasNext()){
                String line2 =file2.nextLine();
                if(!line2.isEmpty()){
                    writer2.write(line2);
                    writer2.write("\n");
                }
            }
            
            file2.close();
            writer2.flush();
            writer2.close();
            oldFile2.delete();
            File yeni2=new File("Müşteriler.txt");
            newFile2.renameTo(yeni2);
            
            
            if(d==true){
                
            String tempFile5="tempx.txt";
            File oldFile5=new File("MüşteriHesapBilgileri.txt");
            File newFile5=new File(tempFile5);
            
            String kullanıcışifresi="";
            String kullanıcıIDsi="";
            String anapara="";
            String borç="";
            String kredikartınumarası="";
            String kredikartılimiti="";
            String kredikartıborcu="";
            String krediborcu="";
            
            PrintWriter pwriter = new PrintWriter(new BufferedWriter(new FileWriter(tempFile5,true)));
            Scanner scans= new Scanner(new File("MüşteriHesapBilgileri.txt"));
            scans.useDelimiter("[ \n]");
            
            while(scans.hasNext()){
                kullanıcışifresi=scans.next();
                kullanıcıIDsi=scans.next();
                anapara=scans.next();
                borç=scans.next();
                kredikartınumarası=scans.next();
                kredikartılimiti=scans.next();
                kredikartıborcu=scans.next();
                krediborcu=scans.next();
                
                if(kullanıcışifresi.equals(this.şifre)){
                    pwriter.println(newAccountPassword+" "+kullanıcıIDsi+" "+anapara+" "+borç+" "+kredikartınumarası+" "+kredikartılimiti+" "+kredikartıborcu+" "+krediborcu);
                    
                }
                else{
                    pwriter.println(kullanıcışifresi+" "+kullanıcıIDsi+" "+anapara+" "+borç+" "+kredikartınumarası+" "+kredikartılimiti+" "+kredikartıborcu+" "+krediborcu);
                }
             }  
            
            scans.close();
            pwriter.flush();
            pwriter.close();
            oldFile5.delete();
            File yeni5=new File("MüşteriHesapBilgileri.txt");
            newFile5.renameTo(yeni5);
            
            
            
            File oldFile4=new File("MüşteriHesapBilgileri.txt");
            File newFile4=new File("Tempt.txt");
            
            Scanner file4 =new Scanner(oldFile4);
            PrintWriter writer4=new PrintWriter(newFile4);
            
            while(file4.hasNext()){
                String line4 =file4.nextLine();
                if(!line4.isEmpty()){
                    writer4.write(line4);
                    writer4.write("\n");
                }
            }
            
            file4.close();
            writer4.flush();
            writer4.close();
            oldFile4.delete();
            File yeni4=new File("MüşteriHesapBilgileri.txt");
            newFile4.renameTo(yeni4);
            }
            
            Main.loginAc();
            
          }  
          catch (IOException ex) {
            Logger.getLogger(Müşteri.class.getName()).log(Level.SEVERE, null, ex);
        } 
       
        
    }

    @Override
    public void giriş() {
        try {
            String accountNameControl=this.ad;
            String accountSurnameControl=this.soyad;
            String accountPasswordControl=this.şifre;
            String accountID=this.ID;
            
            Boolean a=false;
            Boolean b=false;
            Boolean c=false;
            Boolean d=false;
            
            Scanner scan=new Scanner(new File("Müşteriler.txt"));
            
            String Kelime;
            
            while(scan.hasNext()){
                Kelime=scan.next();
                a=false;
                if(Kelime.equals(accountNameControl)){
                    a=true;
                }
                Kelime=scan.next();
                b=false;
                if(Kelime.equals(accountSurnameControl)){
                    b=true;
                }
                Kelime=scan.next();
                c=false;
                if(Kelime.equals(accountPasswordControl)){
                    c=true;
                }
                Kelime=scan.next();
                d=false;
                if(Kelime.equals(accountID)){
                    d=true;
                }
                if(a==true && b==true && c==true && d==true){
                    break;
                }
            }
            
            if(a==true && b==true && c==true && d==true){
                JOptionPane.showMessageDialog(null, "Giriş başarılı.");
                MüşteriArayüzü müşteriarayüzü=new MüşteriArayüzü();
                MüşteriArayüzü.customerInterfaceName.setText(Login.accountName.getText().toLowerCase());
                MüşteriArayüzü.customerInterfaceSurname.setText(Login.accountSurname.getText().toLowerCase());
                MüşteriArayüzü.Password=Login.accountPassword.getText();
                MüşteriArayüzü.ID=Login.accountID.getText();
                müşteriarayüzü.setVisible(true);
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Giriş başarısız.Lütfen tekrar deneyin.");
            }
            
            
            scan.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Müşteri.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    

    @Override
    public void bakiyeKontrol() {
                
        try {
            String kullanıcışifresi="";
            String kullanıcıIDsi="";
            String anapara="";
            String borç="";
            String kredikartınumarası="";
            String kredikartılimiti="";
            String kredikartıborcu="";
            String krediborcu="";
            
            Scanner scans= new Scanner(new File("MüşteriHesapBilgileri.txt"));
            
            
            while(scans.hasNext()){
                kullanıcışifresi=scans.next();
                kullanıcıIDsi=scans.next();
                anapara=scans.next();
                borç=scans.next();
                kredikartınumarası=scans.next();
                kredikartılimiti=scans.next();
                kredikartıborcu=scans.next();
                krediborcu=scans.next();
                
                if(kullanıcışifresi.equals(this.şifre)){
                    String message="Bakiye: "+anapara+" TL";
                    JOptionPane.showMessageDialog(null, message);
                }
            }
            
            scans.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Müşteri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void paraÇekme(String amountToBeDraw) {
        
        
           try{
                String tempFile5="tempx.txt";
                File oldFile5=new File("MüşteriHesapBilgileri.txt");
                File newFile5=new File(tempFile5); 
                
                String kullanıcışifresi="";
                String kullanıcıIDsi="";
                String anapara="";
                String borç="";
                String kredikartınumarası="";
                String kredikartılimiti="";
                String kredikartıborcu="";
                String krediborcu="";
                boolean control=false;
                
                
                PrintWriter pwriter = new PrintWriter(new BufferedWriter(new FileWriter(tempFile5,true)));
                Scanner scans= new Scanner(new File("MüşteriHesapBilgileri.txt"));
                scans.useDelimiter("[ \n]");
                
                
                while(scans.hasNext()){
                    kullanıcışifresi=scans.next();
                    kullanıcıIDsi=scans.next();
                    anapara=scans.next();
                    borç=scans.next();
                    kredikartınumarası=scans.next();
                    kredikartılimiti=scans.next();
                    kredikartıborcu=scans.next();
                    krediborcu=scans.next();
                    
                    
                    if(kullanıcışifresi.equals(this.şifre) && Integer.parseInt(anapara)>=Integer.parseInt(amountToBeDraw)){
                        int amountToBeDrawInt =Integer.parseInt(amountToBeDraw);
                        int anaparaInt=Integer.parseInt(anapara);
                        int newAmount=anaparaInt-amountToBeDrawInt;
                        String newAmountString=String.valueOf(newAmount);
                        
                        pwriter.println(kullanıcışifresi+" "+kullanıcıIDsi+" "+newAmountString+" "+borç+" "+kredikartınumarası+" "+kredikartılimiti+" "+kredikartıborcu+" "+krediborcu);
                        
                        String message="Girdiğiniz tutar başarıyla çekildi.Yeni bakiyeniz "+newAmountString+" TL";
                        JOptionPane.showMessageDialog(null, message);
                        control=true;
                        
                    }
                    else{
                        pwriter.println(kullanıcışifresi+" "+kullanıcıIDsi+" "+anapara+" "+borç+" "+kredikartınumarası+" "+kredikartılimiti+" "+kredikartıborcu+" "+krediborcu);
                    }
                }  
                
                scans.close();
                pwriter.flush();
                pwriter.close();
                oldFile5.delete();
                File yeni5=new File("MüşteriHesapBilgileri.txt");
                newFile5.renameTo(yeni5);
                
                
                File oldFile4=new File("MüşteriHesapBilgileri.txt");
                File newFile4=new File("Tempt.txt");
                Scanner file4 =new Scanner(oldFile4);
                PrintWriter writer4=new PrintWriter(newFile4);
                while(file4.hasNext()){
                    String line4 =file4.nextLine();
                    if(!line4.isEmpty()){
                        writer4.write(line4);
                        writer4.write("\n");
                    }
                }   
                
                file4.close();
                writer4.flush();
                writer4.close();
                oldFile4.delete();
                File yeni4=new File("MüşteriHesapBilgileri.txt");
                newFile4.renameTo(yeni4);
                
                if(control==false){
                    JOptionPane.showMessageDialog(null, "Para çekmek için yeterli bakiyeniz bulunmamaktadır.");
                }
           }
           catch(Exception e){
               JOptionPane.showMessageDialog(null, "Dosya bulunamadı.");
           }
    }

    @Override
    public void paraYatırma(String amountToBeDeposited) {
        
            try {
                String tempFile5="tempx.txt";
                File oldFile5=new File("MüşteriHesapBilgileri.txt");
                File newFile5=new File(tempFile5);
                
                String kullanıcışifresi="";
                String kullanıcıIDsi="";
                String anapara="";
                String borç="";
                String kredikartınumarası="";
                String kredikartılimiti="";
                String kredikartıborcu="";
                String krediborcu="";
                
                
                PrintWriter pwriter = new PrintWriter(new BufferedWriter(new FileWriter(tempFile5,true)));
                Scanner scans= new Scanner(new File("MüşteriHesapBilgileri.txt"));
                scans.useDelimiter("[ \n]");
                
                
                while(scans.hasNext()){
                    kullanıcışifresi=scans.next();
                    kullanıcıIDsi=scans.next();
                    anapara=scans.next();
                    borç=scans.next();
                    kredikartınumarası=scans.next();
                    kredikartılimiti=scans.next();
                    kredikartıborcu=scans.next();
                    krediborcu=scans.next();
                    
                    
                    if(kullanıcışifresi.equals(this.şifre)){
                        int amountToBeDepositedInt =Integer.parseInt(amountToBeDeposited);
                        int anaparaInt=Integer.parseInt(anapara);
                        int newAmount=anaparaInt+amountToBeDepositedInt;
                        String newAmountString=String.valueOf(newAmount);
                        
                        pwriter.println(kullanıcışifresi+" "+kullanıcıIDsi+" "+newAmountString+" "+borç+" "+kredikartınumarası+" "+kredikartılimiti+" "+kredikartıborcu+" "+krediborcu);
                        
                        String message="Girdiğiniz tutar başarıyla yatırıldı.Yeni bakiyeniz "+newAmountString+" TL";
                        JOptionPane.showMessageDialog(null, message);
                        
                    }
                    else{
                        pwriter.println(kullanıcışifresi+" "+kullanıcıIDsi+" "+anapara+" "+borç+" "+kredikartınumarası+" "+kredikartılimiti+" "+kredikartıborcu+" "+krediborcu);
                    }
                }  
                
                scans.close();
                pwriter.flush();
                pwriter.close();
                oldFile5.delete();
                File yeni5=new File("MüşteriHesapBilgileri.txt");
                newFile5.renameTo(yeni5);
                
                
                File oldFile4=new File("MüşteriHesapBilgileri.txt");
                File newFile4=new File("Tempt.txt");
                Scanner file4 =new Scanner(oldFile4);
                PrintWriter writer4=new PrintWriter(newFile4);
                while(file4.hasNext()){
                    String line4 =file4.nextLine();
                    if(!line4.isEmpty()){
                        writer4.write(line4);
                        writer4.write("\n");
                    }
                }   file4.close();
                writer4.flush();
                writer4.close();
                oldFile4.delete();
                File yeni4=new File("MüşteriHesapBilgileri.txt");
                newFile4.renameTo(yeni4);
                
                
            } catch (IOException ex) {
                Logger.getLogger(Müşteri.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    @Override
    public void toplamBorçKontrol() {
        
        try {
            String kullanıcışifresi="";
            String kullanıcıIDsi="";
            String anapara="";
            String borç="";
            String kredikartınumarası="";
            String kredikartılimiti="";
            String kredikartıborcu="";
            String krediborcu="";
            
            Scanner scans= new Scanner(new File("MüşteriHesapBilgileri.txt"));
            
            
            while(scans.hasNext()){
                kullanıcışifresi=scans.next();
                kullanıcıIDsi=scans.next();
                anapara=scans.next();
                borç=scans.next();
                kredikartınumarası=scans.next();
                kredikartılimiti=scans.next();
                kredikartıborcu=scans.next();
                krediborcu=scans.next();
                
                if(kullanıcışifresi.equals(this.şifre)){
                    String message="Borcunuz: "+borç+" TL";
                    JOptionPane.showMessageDialog(null, message);
                }
            }
            scans.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Müşteri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void paraTransferi(String amountToBeSent,String accountThatAmountToBeSent) {
        
           try{
                String tempFile5="tempx.txt";
                File oldFile5=new File("MüşteriHesapBilgileri.txt");
                File newFile5=new File(tempFile5);
                
                String kullanıcışifresi="";
                String kullanıcıIDsi="";
                String anapara="";
                String borç="";
                String kredikartınumarası="";
                String kredikartılimiti="";
                String kredikartıborcu="";
                String krediborcu="";
                boolean c=false;
                
                
                PrintWriter pwriter = new PrintWriter(new BufferedWriter(new FileWriter(tempFile5,true)));
                Scanner scans= new Scanner(new File("MüşteriHesapBilgileri.txt"));
                scans.useDelimiter("[ \n]");
                
                
                while(scans.hasNext()){
                    kullanıcışifresi=scans.next();
                    kullanıcıIDsi=scans.next();
                    anapara=scans.next();
                    borç=scans.next();
                    kredikartınumarası=scans.next();
                    kredikartılimiti=scans.next();
                    kredikartıborcu=scans.next();
                    krediborcu=scans.next();
                    
                    
                    if(kullanıcışifresi.equals(this.şifre) && Integer.parseInt(amountToBeSent)<=Integer.parseInt(anapara)){
                    
                        int amountToBeSentInt =Integer.parseInt(amountToBeSent);
                        int anaparaInt=Integer.parseInt(anapara);
                        int newAmount=anaparaInt-amountToBeSentInt;
                        String newAmountString=String.valueOf(newAmount);
                        
                        pwriter.println(kullanıcışifresi+" "+kullanıcıIDsi+" "+newAmountString+" "+borç+" "+kredikartınumarası+" "+kredikartılimiti+" "+kredikartıborcu+" "+krediborcu);
                        c=true;
                    }
                    else{
                        pwriter.println(kullanıcışifresi+" "+kullanıcıIDsi+" "+anapara+" "+borç+" "+kredikartınumarası+" "+kredikartılimiti+" "+kredikartıborcu+" "+krediborcu);
                    }
                }  
                
                scans.close();
                pwriter.flush();
                pwriter.close();
                oldFile5.delete();
                File yeni5=new File("MüşteriHesapBilgileri.txt");
                newFile5.renameTo(yeni5);
                
                
                File oldFile4=new File("MüşteriHesapBilgileri.txt");
                File newFile4=new File("Tempt.txt");
                Scanner file4 =new Scanner(oldFile4);
                PrintWriter writer4=new PrintWriter(newFile4);
                while(file4.hasNext()){
                    String line4 =file4.nextLine();
                    if(!line4.isEmpty()){
                        writer4.write(line4);
                        writer4.write("\n");
                    }
                }   file4.close();
                writer4.flush();
                writer4.close();
                oldFile4.delete();
                File yeni4=new File("MüşteriHesapBilgileri.txt");
                newFile4.renameTo(yeni4);
        
                
                if(c==true){
                    
                    
                String tempFile="tempx.txt";
                File oldFile=new File("MüşteriHesapBilgileri.txt");
                File newFile=new File(tempFile);
                
                String kullanıcışifresi2="";
                String kullanıcıIDsi2="";
                String anapara2="";
                String borç2="";
                String kredikartınumarası2="";
                String kredikartılimiti2="";
                String kredikartıborcu2="";
                String krediborcu2="";
                
                
                PrintWriter pwriter2 = new PrintWriter(new BufferedWriter(new FileWriter(tempFile,true)));
                Scanner scan= new Scanner(new File("MüşteriHesapBilgileri.txt"));
                scan.useDelimiter("[ \n]");
                
                
                while(scan.hasNext()){
                    kullanıcışifresi2=scan.next();
                    kullanıcıIDsi2=scan.next();
                    anapara2=scan.next();
                    borç2=scan.next();
                    kredikartınumarası2=scan.next();
                    kredikartılimiti2=scan.next();
                    kredikartıborcu2=scan.next();
                    krediborcu2=scan.next();
                    
                    
                    if(kullanıcıIDsi2.equals(accountThatAmountToBeSent)){
                        int amountToBeSentInt2 =Integer.parseInt(amountToBeSent);
                        int anaparaInt2=Integer.parseInt(anapara2);
                        int newAmount2=anaparaInt2+amountToBeSentInt2;
                        String newAmountString2=String.valueOf(newAmount2);
                        
                        pwriter2.println(kullanıcışifresi2+" "+kullanıcıIDsi2+" "+newAmountString2+" "+borç2+" "+kredikartınumarası2+" "+kredikartılimiti2+" "+kredikartıborcu2+" "+krediborcu2);
                        
                        String message="Girdiğiniz tutar başarıyla "+kullanıcıIDsi2+" ID numaralı kullanıcıya gönderildi.";
                        JOptionPane.showMessageDialog(null, message);
                        
                    }
                    else{
                        pwriter2.println(kullanıcışifresi2+" "+kullanıcıIDsi2+" "+anapara2+" "+borç2+" "+kredikartınumarası2+" "+kredikartılimiti2+" "+kredikartıborcu2+" "+krediborcu2);
                    }
                }  
                
                scan.close();
                pwriter2.flush();
                pwriter2.close();
                oldFile.delete();
                File yeni=new File("MüşteriHesapBilgileri.txt");
                newFile.renameTo(yeni);
                
                
                File oldFile6=new File("MüşteriHesapBilgileri.txt");
                File newFile6=new File("Tempt.txt");
                Scanner file6 =new Scanner(oldFile6);
                PrintWriter writer6=new PrintWriter(newFile6);
                while(file6.hasNext()){
                    String line6 =file6.nextLine();
                    if(!line6.isEmpty()){
                        writer6.write(line6);
                        writer6.write("\n");
                    }
                }   
                file6.close();
                writer6.flush();
                writer6.close();
                oldFile6.delete();
                File yeni6=new File("MüşteriHesapBilgileri.txt");
                newFile6.renameTo(yeni6);
                }
                
                else {
                    JOptionPane.showMessageDialog(null, "İşlem geçersiz lütfen tekrar deneyin.");
                }
           }
           catch(FileNotFoundException e){
               JOptionPane.showMessageDialog(null, "Dosya bulunamadı.");
           } 
           catch (IOException ex) {
               Logger.getLogger(Müşteri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void krediÇekme(String creditAmount) {
               
        try {
            
            String tempFile5="tempx.txt";
            File oldFile5=new File("MüşteriHesapBilgileri.txt");
            File newFile5=new File(tempFile5);
            
            String kullanıcışifresi="";
            String kullanıcıIDsi="";
            String anapara="";
            String borç="";
            String kredikartınumarası="";
            String kredikartılimiti="";
            String kredikartıborcu="";
            String krediborcu="";
            
            PrintWriter pwriter = new PrintWriter(new BufferedWriter(new FileWriter(tempFile5,true)));
            Scanner scans= new Scanner(new File("MüşteriHesapBilgileri.txt"));
            scans.useDelimiter("[ \n]");
            
            
            while(scans.hasNext()){
                kullanıcışifresi=scans.next();
                kullanıcıIDsi=scans.next();
                anapara=scans.next();
                borç=scans.next();
                kredikartınumarası=scans.next();
                kredikartılimiti=scans.next();
                kredikartıborcu=scans.next();
                krediborcu=scans.next();
                
                
                if(kullanıcışifresi.equals(this.şifre)){
                    int creditAmountInt=Integer.parseInt(creditAmount);
                    int anaparaInt=Integer.parseInt(anapara);
                    int newAmount=anaparaInt+creditAmountInt;
                    String newAmountString=String.valueOf(newAmount);
                    
                    
                    int krediBorcuInt=Integer.parseInt(krediborcu);
                    int newKrediBorcu=krediBorcuInt+creditAmountInt;
                    String newKrediBorcuString=String.valueOf(newKrediBorcu);
                    
                    int borçInt=Integer.parseInt(borç);
                    int newBorçInt=borçInt+creditAmountInt;
                    String newBorçString=String.valueOf(newBorçInt);
                    
                    String message="Çektiğiniz kredi başarıyla bakiyenize aktarılmıştır.Yeni bakiyeniz: "+newAmountString+" TL, Toplam borcunuz: "+newBorçString+" TL, Toplam kredi borcunuz: "+newKrediBorcuString+" TL";
                    JOptionPane.showMessageDialog(null, message);
                    
                    
                    pwriter.println(kullanıcışifresi+" "+kullanıcıIDsi+" "+newAmountString+" "+newBorçString+" "+kredikartınumarası+" "+kredikartılimiti+" "+kredikartıborcu+" "+newKrediBorcuString);
                    
                }
                else{
                    pwriter.println(kullanıcışifresi+" "+kullanıcıIDsi+" "+anapara+" "+borç+" "+kredikartınumarası+" "+kredikartılimiti+" "+kredikartıborcu+" "+krediborcu);
                }
            }
            
            scans.close();
            pwriter.flush();
            pwriter.close();
            oldFile5.delete();
            File yeni5=new File("MüşteriHesapBilgileri.txt");
            newFile5.renameTo(yeni5);
            
            
            File oldFile4=new File("MüşteriHesapBilgileri.txt");
            File newFile4=new File("Tempt.txt");
            Scanner file4 =new Scanner(oldFile4);
            PrintWriter writer4=new PrintWriter(newFile4);
            while(file4.hasNext()){
                String line4 =file4.nextLine();
                if(!line4.isEmpty()){
                    writer4.write(line4);
                    writer4.write("\n");
                }
            }   file4.close();
            writer4.flush();
            writer4.close();
            oldFile4.delete();
            File yeni4=new File("MüşteriHesapBilgileri.txt");
            newFile4.renameTo(yeni4);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Müşteri.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Müşteri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void krediBorçÖdeme(String amountPayingCreditDebt) {
        
        try {
            String tempFile5="tempx.txt";
            File oldFile5=new File("MüşteriHesapBilgileri.txt");
            File newFile5=new File(tempFile5);
            
            String kullanıcışifresi="";
            String kullanıcıIDsi="";
            String anapara="";
            String borç="";
            String kredikartınumarası="";
            String kredikartılimiti="";
            String kredikartıborcu="";
            String krediborcu="";
            boolean control=false;
            
            PrintWriter pwriter = new PrintWriter(new BufferedWriter(new FileWriter(tempFile5,true)));
            Scanner scans= new Scanner(new File("MüşteriHesapBilgileri.txt"));
            scans.useDelimiter("[ \n]");
            
            
            while(scans.hasNext()){
                kullanıcışifresi=scans.next();
                kullanıcıIDsi=scans.next();
                anapara=scans.next();
                borç=scans.next();
                kredikartınumarası=scans.next();
                kredikartılimiti=scans.next();
                kredikartıborcu=scans.next();
                krediborcu=scans.next();
                
                
                if(kullanıcışifresi.equals(this.şifre) && Integer.parseInt(anapara)>=Integer.parseInt(amountPayingCreditDebt)){
                    int amountPayingCreditDebtInt=Integer.parseInt(amountPayingCreditDebt);
                    int anaparaInt=Integer.parseInt(anapara);
                    int krediBorcuInt=Integer.parseInt(krediborcu);
                    
                    int newAmount=anaparaInt-amountPayingCreditDebtInt;
                    
                    if(amountPayingCreditDebtInt>krediBorcuInt){
                        newAmount=newAmount+(amountPayingCreditDebtInt-krediBorcuInt);
                        amountPayingCreditDebtInt=krediBorcuInt;
                        
                    }
                    
                    String newAmountString=String.valueOf(newAmount);
                     
                    int borçInt=Integer.parseInt(borç);
                    int newBorçInt=borçInt-amountPayingCreditDebtInt;
                    String newBorçString=String.valueOf(newBorçInt);
                       
                    int newKrediBorcu=krediBorcuInt-amountPayingCreditDebtInt;
                    String newKrediBorcuString=String.valueOf(newKrediBorcu);
                    
                    String message="Belirttiğiniz miktar başarıyla ödenmiştir.Kalan bakiye: "+newAmountString+" TL, Kalan toplam borç: "+newBorçString+" TL, Kalan kredi borcu: "+newKrediBorcuString+"  TL";
                    JOptionPane.showMessageDialog(null, message);
                    
                    control=true;
                    
                    pwriter.println(kullanıcışifresi+" "+kullanıcıIDsi+" "+newAmountString+" "+newBorçString+" "+kredikartınumarası+" "+kredikartılimiti+" "+kredikartıborcu+" "+newKrediBorcuString);
                    
                }
                else{
                    pwriter.println(kullanıcışifresi+" "+kullanıcıIDsi+" "+anapara+" "+borç+" "+kredikartınumarası+" "+kredikartılimiti+" "+kredikartıborcu+" "+krediborcu);
                }
            }
            
            scans.close();
            pwriter.flush();
            pwriter.close();
            oldFile5.delete();
            File yeni5=new File("MüşteriHesapBilgileri.txt");
            newFile5.renameTo(yeni5);
            
            
            File oldFile4=new File("MüşteriHesapBilgileri.txt");
            File newFile4=new File("Tempt.txt");
            Scanner file4 =new Scanner(oldFile4);
            PrintWriter writer4=new PrintWriter(newFile4);
            while(file4.hasNext()){
                String line4 =file4.nextLine();
                if(!line4.isEmpty()){
                    writer4.write(line4);
                    writer4.write("\n");
                }
            }   file4.close();
            writer4.flush();
            writer4.close();
            oldFile4.delete();
            File yeni4=new File("MüşteriHesapBilgileri.txt");
            newFile4.renameTo(yeni4);
            
            
            if(control==false){
                JOptionPane.showMessageDialog(null, "Bakiyenizde kredi borcunuzu ödemek için yeterli miktarda para bulunmamaktadır.");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Müşteri.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Müşteri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void krediBorçKontrol() {
        
        try {
            String kullanıcışifresi="";
            String kullanıcıIDsi="";
            String anapara="";
            String borç="";
            String kredikartınumarası="";
            String kredikartılimiti="";
            String kredikartıborcu="";
            String krediborcu="";
            
            Scanner scans= new Scanner(new File("MüşteriHesapBilgileri.txt"));
            
            
            while(scans.hasNext()){
                kullanıcışifresi=scans.next();
                kullanıcıIDsi=scans.next();
                anapara=scans.next();
                borç=scans.next();
                kredikartınumarası=scans.next();
                kredikartılimiti=scans.next();
                kredikartıborcu=scans.next();
                krediborcu=scans.next();
                
                if(kullanıcışifresi.equals(this.şifre)){
                    String message="Toplam kredi borcunuz: "+krediborcu+" TL";
                    JOptionPane.showMessageDialog(null, message);
                }
            }
            
            scans.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Müşteri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void limitKontrol() {
        
        try {
            String kullanıcışifresi="";
            String kullanıcıIDsi="";
            String anapara="";
            String borç="";
            String kredikartınumarası="";
            String kredikartılimiti="";
            String kredikartıborcu="";
            String krediborcu="";
            Boolean c=false;
            
            Scanner scans= new Scanner(new File("MüşteriHesapBilgileri.txt"));
            
            
            while(scans.hasNext()){
                kullanıcışifresi=scans.next();
                kullanıcıIDsi=scans.next();
                anapara=scans.next();
                borç=scans.next();
                kredikartınumarası=scans.next();
                kredikartılimiti=scans.next();
                kredikartıborcu=scans.next();
                krediborcu=scans.next();
                
                if(kullanıcışifresi.equals(this.şifre) && !kredikartınumarası.equals("0")){
                    String message="Kalan limitiniz: "+kredikartılimiti+" TL";
                    c=true;
                    JOptionPane.showMessageDialog(null, message);
                }
            }
            
            scans.close();
            
            if(c==false){
                JOptionPane.showMessageDialog(null, "Bir kredi kartınız bulunmamaktadır.Lütfen kredi kartı almak için bir banka personeline başvurun.");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Müşteri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void krediKartıParaÇekme(String creditCardDrawAmount) {
        
        try {
            String tempFile5="tempx.txt";
            File oldFile5=new File("MüşteriHesapBilgileri.txt");
            File newFile5=new File(tempFile5);
            
            String kullanıcışifresi="";
            String kullanıcıIDsi="";
            String anapara="";
            String borç="";
            String kredikartınumarası="";
            String kredikartılimiti="";
            String kredikartıborcu="";
            String krediborcu="";
            boolean check=false;
            
            PrintWriter pwriter = new PrintWriter(new BufferedWriter(new FileWriter(tempFile5,true)));
            Scanner scans= new Scanner(new File("MüşteriHesapBilgileri.txt"));
            scans.useDelimiter("[ \n]");
            
            
            while(scans.hasNext()){
                kullanıcışifresi=scans.next();
                kullanıcıIDsi=scans.next();
                anapara=scans.next();
                borç=scans.next();
                kredikartınumarası=scans.next();
                kredikartılimiti=scans.next();
                kredikartıborcu=scans.next();
                krediborcu=scans.next();
                
                
                if(kullanıcışifresi.equals(this.şifre) && !kredikartınumarası.equals("0")){
                    
                    int kredikartılimitiInt=Integer.parseInt(kredikartılimiti);
                    int creditCardDrawAmountInt=Integer.parseInt(creditCardDrawAmount);
                    
                    if(creditCardDrawAmountInt>kredikartılimitiInt){
                        String message="Yeterli limitiniz yok.Limit: "+kredikartılimiti+" TL, Çekmek istediğiniz tutar: "+creditCardDrawAmount+" TL";
                        JOptionPane.showMessageDialog(null, message);
                        pwriter.println(kullanıcışifresi+" "+kullanıcıIDsi+" "+anapara+" "+borç+" "+kredikartınumarası+" "+kredikartılimiti+" "+kredikartıborcu+" "+krediborcu);
                        check=true;
                        continue;
                    }
                    
                    int newKrediKartıLimiti=kredikartılimitiInt-creditCardDrawAmountInt;
                    String newKrediKartıLimitiString=String.valueOf(newKrediKartıLimiti);
                    
                    int borçInt=Integer.parseInt(borç);
                    int newBorç=borçInt+creditCardDrawAmountInt;
                    String newBorçString=String.valueOf(newBorç);
                    
                    int kredikartıborcuInt=Integer.parseInt(kredikartıborcu);
                    int newKrediKartıBorcu=kredikartıborcuInt+creditCardDrawAmountInt;
                    String newKrediKartıBorcuString=String.valueOf(newKrediKartıBorcu);
                    
                    int anaparaInt=Integer.valueOf(anapara);
                    int newAnapara=anaparaInt+creditCardDrawAmountInt;
                    String newAnaparaString=String.valueOf(newAnapara);
                    
                    String message2="Çektiğiniz tutar başarıyla bakiyenize aktarılmıştır.Yeni bakiyeniz: "+newAnaparaString+" TL, Toplam borcunuz: "+newBorçString+" TL, Toplam kredi kartı borcunuz : "+newKrediKartıBorcuString+" TL";
                    JOptionPane.showMessageDialog(null, message2);
                    check=true;
                    
                    pwriter.println(kullanıcışifresi+" "+kullanıcıIDsi+" "+newAnaparaString+" "+newBorçString+" "+kredikartınumarası+" "+newKrediKartıLimitiString+" "+newKrediKartıBorcuString+" "+krediborcu);
                    
                }
                else{
                    pwriter.println(kullanıcışifresi+" "+kullanıcıIDsi+" "+anapara+" "+borç+" "+kredikartınumarası+" "+kredikartılimiti+" "+kredikartıborcu+" "+krediborcu);
                }
            }
            
            scans.close();
            pwriter.flush();
            pwriter.close();
            oldFile5.delete();
            File yeni5=new File("MüşteriHesapBilgileri.txt");
            newFile5.renameTo(yeni5);
            
            
            File oldFile4=new File("MüşteriHesapBilgileri.txt");
            File newFile4=new File("Tempt.txt");
            Scanner file4 =new Scanner(oldFile4);
            PrintWriter writer4=new PrintWriter(newFile4);
            while(file4.hasNext()){
                String line4 =file4.nextLine();
                if(!line4.isEmpty()){
                    writer4.write(line4);
                    writer4.write("\n");
                }
            }   file4.close();
            writer4.flush();
            writer4.close();
            oldFile4.delete();
            File yeni4=new File("MüşteriHesapBilgileri.txt");
            newFile4.renameTo(yeni4);
            
            if(check==false){
                JOptionPane.showMessageDialog(null, "Bir kredi kartınız bulunmamaktadır.Lütfen kredi kartı almak için bir banka personeline başvurun.");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Müşteri.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Müşteri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void krediKartıBorçÖdeme(String amountPayingCreditCardDebt) {
        
        try {
            String tempFile5="tempx.txt";
            File oldFile5=new File("MüşteriHesapBilgileri.txt");
            File newFile5=new File(tempFile5);
            
            String kullanıcışifresi="";
            String kullanıcıIDsi="";
            String anapara="";
            String borç="";
            String kredikartınumarası="";
            String kredikartılimiti="";
            String kredikartıborcu="";
            String krediborcu="";
            boolean check=false;
            
            PrintWriter pwriter = new PrintWriter(new BufferedWriter(new FileWriter(tempFile5,true)));
            Scanner scans= new Scanner(new File("MüşteriHesapBilgileri.txt"));
            scans.useDelimiter("[ \n]");
            
            
            while(scans.hasNext()){
                kullanıcışifresi=scans.next();
                kullanıcıIDsi=scans.next();
                anapara=scans.next();
                borç=scans.next();
                kredikartınumarası=scans.next();
                kredikartılimiti=scans.next();
                kredikartıborcu=scans.next();
                krediborcu=scans.next();
                
                
                if(kullanıcışifresi.equals(this.şifre) && !kredikartınumarası.equals("0") && Integer.parseInt(anapara)>=Integer.parseInt(amountPayingCreditCardDebt)){
                    
                    int anaparaInt=Integer.parseInt(anapara);
                    int kredikartılimitiInt=Integer.parseInt(kredikartılimiti);
                    int amountPayingCreditCardDebtInt=Integer.parseInt(amountPayingCreditCardDebt);
                    int krediKartıBorcuInt=Integer.parseInt(kredikartıborcu);
                    int borçInt=Integer.valueOf(borç);
                    
                    int newAnapara=anaparaInt-amountPayingCreditCardDebtInt;
                    
                    if(amountPayingCreditCardDebtInt>krediKartıBorcuInt){
                        newAnapara=newAnapara+(amountPayingCreditCardDebtInt-krediKartıBorcuInt);
                        amountPayingCreditCardDebtInt=krediKartıBorcuInt;
                    }
                    
                    String newAnaparaString=String.valueOf(newAnapara);
                    
                    int newKrediKartıLimiti=kredikartılimitiInt+amountPayingCreditCardDebtInt;
                    String newKrediKartıLimitiString=String.valueOf(newKrediKartıLimiti);
                    
                    int newKrediKartıBorcu=krediKartıBorcuInt-amountPayingCreditCardDebtInt;
                    String newKrediKartıBorcuString=String.valueOf(newKrediKartıBorcu);
                    
                    int newBorç=borçInt-amountPayingCreditCardDebtInt;
                    String newBorçString=String.valueOf(newBorç);
                    
                    String message2="Belirttiğiniz tutar başarıyla yatırılmıştır.Yeni bakiyeniz: "+newAnaparaString+" TL, Toplam borcunuz: "+newBorçString+" TL, Toplam kredi kartı borcunuz : "+newKrediKartıBorcuString+" TL";
                    JOptionPane.showMessageDialog(null, message2);
                    check=true;
                    
                    pwriter.println(kullanıcışifresi+" "+kullanıcıIDsi+" "+newAnaparaString+" "+newBorçString+" "+kredikartınumarası+" "+newKrediKartıLimitiString+" "+newKrediKartıBorcuString+" "+krediborcu);
                    
                }
                else{
                    pwriter.println(kullanıcışifresi+" "+kullanıcıIDsi+" "+anapara+" "+borç+" "+kredikartınumarası+" "+kredikartılimiti+" "+kredikartıborcu+" "+krediborcu);
                }
            }
            
            scans.close();
            pwriter.flush();
            pwriter.close();
            oldFile5.delete();
            File yeni5=new File("MüşteriHesapBilgileri.txt");
            newFile5.renameTo(yeni5);
            
            
            File oldFile4=new File("MüşteriHesapBilgileri.txt");
            File newFile4=new File("Tempt.txt");
            Scanner file4 =new Scanner(oldFile4);
            PrintWriter writer4=new PrintWriter(newFile4);
            while(file4.hasNext()){
                String line4 =file4.nextLine();
                if(!line4.isEmpty()){
                    writer4.write(line4);
                    writer4.write("\n");
                }
            }   file4.close();
            writer4.flush();
            writer4.close();
            oldFile4.delete();
            File yeni4=new File("MüşteriHesapBilgileri.txt");
            newFile4.renameTo(yeni4);
            
            if(check==false){
                JOptionPane.showMessageDialog(null, "Geçersiz işlem.Lütfen kredi kartınız yoksa kredi kartı alın veya varsa bakiyenizdeki parayı kontrol edin.");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Müşteri.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Müşteri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void krediKartıBorçKontrol() {
        
        try {
            String kullanıcışifresi="";
            String kullanıcıIDsi="";
            String anapara="";
            String borç="";
            String kredikartınumarası="";
            String kredikartılimiti="";
            String kredikartıborcu="";
            String krediborcu="";
            Boolean c=false;
            
            Scanner scans= new Scanner(new File("MüşteriHesapBilgileri.txt"));
            
            
            while(scans.hasNext()){
                kullanıcışifresi=scans.next();
                kullanıcıIDsi=scans.next();
                anapara=scans.next();
                borç=scans.next();
                kredikartınumarası=scans.next();
                kredikartılimiti=scans.next();
                kredikartıborcu=scans.next();
                krediborcu=scans.next();
                
                if(kullanıcışifresi.equals(this.şifre) && !kredikartınumarası.equals("0")){
                    String message="Kredi kartı borcunuz: "+kredikartıborcu+" TL";
                    c=true;
                    JOptionPane.showMessageDialog(null, message);
                }
            }
            
            scans.close();
            
            if(c==false){
                JOptionPane.showMessageDialog(null, "Bir kredi kartınız bulunmamaktadır.Lütfen kredi kartı almak için bir banka personeline başvurun.");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Müşteri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}







class BankaPersoneli extends Kullanıcı implements Personelİşlemleri{
    
    String maaş,yatırılmışMaaş;

    public BankaPersoneli(String ad, String soyad, String şifre,String ID,String maaş,String yatırılmışMaaş) {
        super(ad, soyad, şifre,ID);
        this.maaş=maaş;
        this.yatırılmışMaaş=yatırılmışMaaş;
    }
    public BankaPersoneli(String ad, String soyad, String şifre) {
        super(ad, soyad, şifre);
    } 
    
    public BankaPersoneli(String ad, String soyad, String şifre,String ID){
        super(ad, soyad, şifre,ID);
    }
    public BankaPersoneli(String şifre){
        super(şifre);
    }
    public BankaPersoneli(){                                
        
    }

    @Override
    public void kayıtİşlemleri() {
    try {
            
            String accountNameControl=this.ad;
            String accountSurnameControl=this.soyad;
            String accountPasswordControl=this.şifre;
            
            Boolean a=false;
            Boolean b=false;
            Boolean c=false;
            
            Scanner scan=new Scanner(new File("BankaPersoneli.txt"));
            
            String Kelime;
            
            while(scan.hasNext()){
                Kelime=scan.next();
                if(Kelime.equals(accountNameControl)){
                    a=true;
                }
                Kelime=scan.next();
                if(Kelime.equals(accountSurnameControl)){
                    b=true;
                }
                Kelime=scan.next();
                if(Kelime.equals(accountPasswordControl)){
                    c=true;
                }
                scan.next();
                scan.next();
                scan.next();
            }
            
            scan.close();
            
            if(a==true && b==true){
                JOptionPane.showMessageDialog(null, "Böyle bir kullanıcı zaten var.");
            }
            
            else if (c==true){
                JOptionPane.showMessageDialog(null, "Lütfen farklı bir şifre girin.");
            }
            else{
                
            int x =(int)(Math.random()*9);
            x=x+1;
            String personelID =(x+"")+(((int)(Math.random()*1000))+"");
            
           
                
            BufferedWriter bw=new BufferedWriter(new FileWriter("BankaPersoneli.txt",true));
            
            bw.write(this.ad+" ");
            bw.write(this.soyad+" ");
            bw.write(this.şifre+" ");
            bw.write(personelID+" ");
            bw.write(0+" ");
            bw.write(0+"\n");
            
            
            bw.close();
            
            
            File oldFile=new File("BankaPersoneli.txt");
            File newFile=new File("Temp.txt");
            
            Scanner file =new Scanner(oldFile);
            PrintWriter writer=new PrintWriter(newFile);
            
            while(file.hasNext()){
                String line =file.nextLine();
                if(!line.isEmpty()){
                    writer.write(line);
                    writer.write("\n");
                }
            }
            
            file.close();
            writer.close();
            oldFile.delete();
            File yeni=new File("BankaPersoneli.txt");
            newFile.renameTo(yeni);
            
            
            String message="Personel ID'niz "+personelID+".Lütfen ID'nizi unutmayınız."; 
            
            JOptionPane.showMessageDialog(null, "Kaydınız tamamlandı.");
            JOptionPane.showMessageDialog(null,message );
            
            Main.loginAc();
           }
        } catch (IOException ex) {
            Logger.getLogger(Müşteri.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
    
    
    public void kayıtİşlemleri(String newAccountPassword){
        
        try {
            Scanner scan1= new Scanner(new File("BankaPersoneli.txt"));
            String şifreKontrol="";
            boolean c=false;
            
            while(scan1.hasNext()){
                scan1.next();
                scan1.next();
                şifreKontrol=scan1.next();
                scan1.next();
                scan1.next();
                scan1.next();
                if(şifreKontrol.equals(newAccountPassword)){
                    JOptionPane.showMessageDialog(null, "Bu şifre zaten kullanılmakta.Lütfen farklı bir şifre giriniz.");
                    c=true;
                    break;
                }
            }
            
            scan1.close();
            
            if(c==false){
                try {
                    String tempFile="temp.txt";
                    File oldFile=new File("BankaPersoneli.txt");
                    File newFile=new File(tempFile);
                    
                    String ad="";
                    String soyad="";
                    String şifre="";
                    String ID="";
                    String maaş="";
                    String yatırılmışMaaş="";
                    Boolean d=false;
                    
                    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(tempFile,true)));
                    Scanner scan= new Scanner(new File("BankaPersoneli.txt"));
                    scan.useDelimiter("[ \n]");
                    
                    while(scan.hasNext()){
                        ad=scan.next();
                        soyad=scan.next();
                        şifre=scan.next();
                        ID=scan.next();
                        maaş=scan.next();
                        yatırılmışMaaş=scan.next();
                        
                        if(şifre.equals(this.şifre)){
                            pw.println(ad+" "+soyad+" "+newAccountPassword+" "+ID+" "+maaş+" "+yatırılmışMaaş);
                            d=true;
                            JOptionPane.showMessageDialog(null, "Şifreniz başarıyla değiştirildi");
                        }
                        
                        else{
                            pw.println(ad+" "+soyad+" "+şifre+" "+ID+" "+maaş+" "+yatırılmışMaaş);
                        }
                    }
                    
                    if(d==false){
                        JOptionPane.showMessageDialog(null, "Şifre değiştirme işlemi başarısız.");
                    }
                    
                    scan.close();
                    pw.flush();
                    pw.close();
                    oldFile.delete();
                    File yeni=new File("BankaPersoneli.txt");
                    newFile.renameTo(yeni);
                    
                    
                    
                    File oldFile2=new File("BankaPersoneli.txt");
                    File newFile2=new File("Temp.txt");
                    
                    Scanner file2 =new Scanner(oldFile2);
                    PrintWriter writer2=new PrintWriter(newFile2);
                    
                    while(file2.hasNext()){
                        String line2 =file2.nextLine();
                        if(!line2.isEmpty()){
                            writer2.write(line2);
                            writer2.write("\n");
                        }
                    }
                    
                    file2.close();
                    writer2.flush();
                    writer2.close();
                    oldFile2.delete();
                    File yeni2=new File("BankaPersoneli.txt");
                    newFile2.renameTo(yeni2);
                    
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(BankaPersoneli.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(BankaPersoneli.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BankaPersoneli.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    @Override
    public void giriş() {
        try {
            String accountNameControl=this.ad;
            String accountSurnameControl=this.soyad;
            String accountPasswordControl=this.şifre;
            String accountID=this.ID;
            
            Boolean a=false;
            Boolean b=false;
            Boolean c=false;
            Boolean d=false;
            
            Scanner scan=new Scanner(new File("BankaPersoneli.txt"));
            
            String Kelime;
            
            while(scan.hasNext()){
                Kelime=scan.next();
                a=false;
                if(Kelime.equals(accountNameControl)){
                    a=true;
                }
                Kelime=scan.next();
                b=false;
                if(Kelime.equals(accountSurnameControl)){
                    b=true;
                }
                Kelime=scan.next();
                c=false;
                if(Kelime.equals(accountPasswordControl)){
                    c=true;
                }
                Kelime=scan.next();
                d=false;
                if(Kelime.equals(accountID)){
                    d=true;
                }
                scan.next();
                scan.next();
                if(a==true && b==true && c==true && d==true){
                    break;
                }
            }
            
            if(a==true && b==true && c==true && d==true){
                JOptionPane.showMessageDialog(null, "Giriş başarılı.");
                PersonelArayüzü personelarayüzü=new PersonelArayüzü();
                PersonelArayüzü.staffInterfaceName.setText(Login.accountName.getText().toLowerCase());
                PersonelArayüzü.staffInterfaceSurname.setText(Login.accountSurname.getText().toLowerCase());
                PersonelArayüzü.Password=Login.accountPassword.getText();
                PersonelArayüzü.ID=Login.accountID.getText();
                personelarayüzü.setVisible(true);
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Giriş başarısız.Lütfen tekrar deneyin.");
            }
            
            
            scan.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Müşteri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void maaşÇek(String amountToBeDraw) {
        
        try {
            String tempFile="temp.txt";
            File oldFile=new File("BankaPersoneli.txt");
            File newFile=new File(tempFile);
                    
            String ad="";
            String soyad="";
            String şifre="";
            String ID="";
            String maaş="";
            String yatırılmışMaaş="";
            Boolean d=false;
                    
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(tempFile,true)));
            Scanner scan= new Scanner(new File("BankaPersoneli.txt"));
            scan.useDelimiter("[ \n]");
            
            while(scan.hasNext()){
                ad=scan.next();
                soyad=scan.next();
                şifre=scan.next();
                ID=scan.next();
                maaş=scan.next();
                yatırılmışMaaş=scan.next();
                
                if(şifre.equals(this.şifre) && !maaş.equals("0")){
                    int yatırılmışMaaşInt=Integer.parseInt(yatırılmışMaaş);
                    int amountToBeDrawInt=Integer.parseInt(amountToBeDraw);
                    
                    if(amountToBeDrawInt>yatırılmışMaaşInt){
                        String message="Çekmek istediğiniz tutar hesabınızda bulunmamaktadır.Hesaptaki miktar: "+yatırılmışMaaş+" TL"+".Çekmek istediğiniz tutar: "+amountToBeDraw+" TL";
                        pw.println(ad+" "+soyad+" "+şifre+" "+ID+" "+maaş+" "+yatırılmışMaaş);
                        JOptionPane.showMessageDialog(null, message);
                        d=true;
                        continue;
                    }
                    
                    
                    int newYatırılmışMaaş=yatırılmışMaaşInt-amountToBeDrawInt;
                    String newYatırılmışMaaşString=String.valueOf(newYatırılmışMaaş);
                    
                    String message2="İşlem başarılı.Maaş hesabınızdaki yeni tutar: "+newYatırılmışMaaşString+" TL.";
                    JOptionPane.showMessageDialog(null,message2);
                    
                    d=true;
                    pw.println(ad+" "+soyad+" "+şifre+" "+ID+" "+maaş+" "+newYatırılmışMaaşString);
                    
                    
                }
                
                else{
                    pw.println(ad+" "+soyad+" "+şifre+" "+ID+" "+maaş+" "+yatırılmışMaaş);
                }
            }
            
            if(d==false){
                JOptionPane.showMessageDialog(null, "Maaşınız belirsiz.Lütfen yöneticinizle irtibata geçiniz.");
            }
                    
            scan.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File yeni=new File("BankaPersoneli.txt");
            newFile.renameTo(yeni);
            
            
            
            File oldFile2=new File("BankaPersoneli.txt");
            File newFile2=new File("Temp.txt");
                    
            Scanner file2 =new Scanner(oldFile2);
            PrintWriter writer2=new PrintWriter(newFile2);
                    
            while(file2.hasNext()){
                String line2 =file2.nextLine();
                if(!line2.isEmpty()){
                    writer2.write(line2);
                    writer2.write("\n");
                }
            }
            
            file2.close();
            writer2.flush();
            writer2.close();
            oldFile2.delete();
            File yeni2=new File("BankaPersoneli.txt");
            newFile2.renameTo(yeni2);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BankaPersoneli.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BankaPersoneli.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void müşteriHesabınıKapat(String customerID) {
        
        try {
            String tempFile5="tempx.txt";
            File oldFile5=new File("MüşteriHesapBilgileri.txt");
            File newFile5=new File(tempFile5);
            
            String kullanıcışifresi="";
            String kullanıcıIDsi="";
            String anapara="";
            String borç="";
            String kredikartınumarası="";
            String kredikartılimiti="";
            String kredikartıborcu="";
            String krediborcu="";
            boolean check=false;
            
            
            PrintWriter pwriter = new PrintWriter(new BufferedWriter(new FileWriter(tempFile5,true)));
            Scanner scans= new Scanner(new File("MüşteriHesapBilgileri.txt"));
            scans.useDelimiter("[ \n]");
            
            
            while(scans.hasNext()){
                kullanıcışifresi=scans.next();
                kullanıcıIDsi=scans.next();
                anapara=scans.next();
                borç=scans.next();
                kredikartınumarası=scans.next();
                kredikartılimiti=scans.next();
                kredikartıborcu=scans.next();
                krediborcu=scans.next();
                
                
                if(kullanıcıIDsi.equals(customerID) && borç.equals("0")){
                    String message="Hesap kapatıldı.Müşteriye verilen anapara tutarı: "+anapara+" TL";
                    JOptionPane.showMessageDialog(null, message);
                    check=true;
                }
                else{
                    pwriter.println(kullanıcışifresi+" "+kullanıcıIDsi+" "+anapara+" "+borç+" "+kredikartınumarası+" "+kredikartılimiti+" "+kredikartıborcu+" "+krediborcu);
                }
            }
            
            scans.close();
            pwriter.flush();
            pwriter.close();
            oldFile5.delete();
            File yeni5=new File("MüşteriHesapBilgileri.txt");
            newFile5.renameTo(yeni5);
            
            
            File oldFile4=new File("MüşteriHesapBilgileri.txt");
            File newFile4=new File("Tempt.txt");
            Scanner file4 =new Scanner(oldFile4);
            PrintWriter writer4=new PrintWriter(newFile4);
            while(file4.hasNext()){
                String line4 =file4.nextLine();
                if(!line4.isEmpty()){
                    writer4.write(line4);
                    writer4.write("\n");
                }
            }   file4.close();
            writer4.flush();
            writer4.close();
            oldFile4.delete();
            File yeni4=new File("MüşteriHesapBilgileri.txt");
            newFile4.renameTo(yeni4);
            
            
            if(check==true){
                
                String tempFile="tempx.txt";
                File oldFile=new File("Müşteriler.txt");
                File newFile=new File(tempFile);
                
                String müşteriAdı="";
                String müşteriSoyadı="";
                String müşteriŞifresi="";
                String müşteriIDsi="";
                
                
                PrintWriter pwriter2 = new PrintWriter(new BufferedWriter(new FileWriter(tempFile,true)));
                Scanner scan= new Scanner(new File("Müşteriler.txt"));
                scan.useDelimiter("[ \n]");
                
                
                while(scan.hasNext()){
                    müşteriAdı=scan.next();
                    müşteriSoyadı=scan.next();
                    müşteriŞifresi=scan.next();
                    müşteriIDsi=scan.next();
                    
                    if(müşteriIDsi.equals(customerID)){
                    }
                    else{
                        pwriter2.println(müşteriAdı+" "+müşteriSoyadı+" "+müşteriŞifresi+" "+müşteriIDsi);
                    }
                }  
                
                scan.close();
                pwriter2.flush();
                pwriter2.close();
                oldFile.delete();
                File yeni=new File("Müşteriler.txt");
                newFile.renameTo(yeni);
                
                
                File oldFile6=new File("Müşteriler.txt");
                File newFile6=new File("Tempt.txt");
                Scanner file6 =new Scanner(oldFile6);
                PrintWriter writer6=new PrintWriter(newFile6);
                while(file6.hasNext()){
                    String line6 =file6.nextLine();
                    if(!line6.isEmpty()){
                        writer6.write(line6);
                        writer6.write("\n");
                    }
                }   
                file6.close();
                writer6.flush();
                writer6.close();
                oldFile6.delete();
                File yeni6=new File("Müşteriler.txt");
                newFile6.renameTo(yeni6);
            }
            else{
                JOptionPane.showMessageDialog(null, "İşlem geçersiz.Müşterinin ID'si bulunamamış olabilir veya müşterinin borcu olabilir.");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BankaPersoneli.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BankaPersoneli.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void müşteriKrediKartıOluştur(String customerID, String creditCardLimit) {
            
        try {
            String tempFile5="tempx.txt";
            File oldFile5=new File("MüşteriHesapBilgileri.txt");
            File newFile5=new File(tempFile5);
            
            String kullanıcışifresi="";
            String kullanıcıIDsi="";
            String anapara="";
            String borç="";
            String kredikartınumarası="";
            String kredikartılimiti="";
            String kredikartıborcu="";
            String krediborcu="";
            boolean check=false;
            
            
            PrintWriter pwriter = new PrintWriter(new BufferedWriter(new FileWriter(tempFile5,true)));
            Scanner scans= new Scanner(new File("MüşteriHesapBilgileri.txt"));
            scans.useDelimiter("[ \n]");
            
            
            while(scans.hasNext()){
                kullanıcışifresi=scans.next();
                kullanıcıIDsi=scans.next();
                anapara=scans.next();
                borç=scans.next();
                kredikartınumarası=scans.next();
                kredikartılimiti=scans.next();
                kredikartıborcu=scans.next();
                krediborcu=scans.next();
                
                
                if(kullanıcıIDsi.equals(customerID) && kredikartınumarası.equals("0")){
                    int fourdigitnumber1 = (int)(Math.random()*9000)+1000;
                    int fourdigitnumber2 = (int)(Math.random()*9000)+1000;
                    int fourdigitnumber3 = (int)(Math.random()*9000)+1000;
                    
                    String newKrediKartıLimiti=creditCardLimit;
                    String newKrediKartıNumarası=String.valueOf(fourdigitnumber1)+"-"+String.valueOf(fourdigitnumber2)+"-"+String.valueOf(fourdigitnumber3);
                    
                    String message="Müşteriye "+newKrediKartıNumarası+" numaralı ve "+newKrediKartıLimiti+" TL limitli kredi kartı başarıyla tanımlandı.";
                    JOptionPane.showMessageDialog(null, message);
                    check=true;
                    
                    pwriter.println(kullanıcışifresi+" "+kullanıcıIDsi+" "+anapara+" "+borç+" "+newKrediKartıNumarası+" "+newKrediKartıLimiti+" "+kredikartıborcu+" "+krediborcu);
                }
                else{
                    pwriter.println(kullanıcışifresi+" "+kullanıcıIDsi+" "+anapara+" "+borç+" "+kredikartınumarası+" "+kredikartılimiti+" "+kredikartıborcu+" "+krediborcu);
                }
            }
            
            scans.close();
            pwriter.flush();
            pwriter.close();
            oldFile5.delete();
            File yeni5=new File("MüşteriHesapBilgileri.txt");
            newFile5.renameTo(yeni5);
            
            
            File oldFile4=new File("MüşteriHesapBilgileri.txt");
            File newFile4=new File("Tempt.txt");
            Scanner file4 =new Scanner(oldFile4);
            PrintWriter writer4=new PrintWriter(newFile4);
            while(file4.hasNext()){
                String line4 =file4.nextLine();
                if(!line4.isEmpty()){
                    writer4.write(line4);
                    writer4.write("\n");
                }
            }   file4.close();
            writer4.flush();
            writer4.close();
            oldFile4.delete();
            File yeni4=new File("MüşteriHesapBilgileri.txt");
            newFile4.renameTo(yeni4);
            
            if(check==false){
                JOptionPane.showMessageDialog(null, "İşlem geçersiz.Müşterinin ID'si bulunamamış olabilir veya bir kredi kartı olabilir.");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BankaPersoneli.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BankaPersoneli.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void müşteriKrediKartıKapat(String customerID) {
        
        try {
            String tempFile5="tempx.txt";
            File oldFile5=new File("MüşteriHesapBilgileri.txt");
            File newFile5=new File(tempFile5);
            
            String kullanıcışifresi="";
            String kullanıcıIDsi="";
            String anapara="";
            String borç="";
            String kredikartınumarası="";
            String kredikartılimiti="";
            String kredikartıborcu="";
            String krediborcu="";
            boolean check=false;
            
            
            PrintWriter pwriter = new PrintWriter(new BufferedWriter(new FileWriter(tempFile5,true)));
            Scanner scans= new Scanner(new File("MüşteriHesapBilgileri.txt"));
            scans.useDelimiter("[ \n]");
            
            
            while(scans.hasNext()){
                kullanıcışifresi=scans.next();
                kullanıcıIDsi=scans.next();
                anapara=scans.next();
                borç=scans.next();
                kredikartınumarası=scans.next();
                kredikartılimiti=scans.next();
                kredikartıborcu=scans.next();
                krediborcu=scans.next();
                
                
                if(kullanıcıIDsi.equals(customerID) && !kredikartınumarası.equals("0")){
                    
                    if(!kredikartıborcu.equals("0")){
                        String message="Müşterinin kredi kartı borcu varken bu işlem yapılamaz.Müşterinin kredi kartı borç tutarı: "+kredikartıborcu+" TL";
                        JOptionPane.showMessageDialog(null, message);
                        pwriter.println(kullanıcışifresi+" "+kullanıcıIDsi+" "+anapara+" "+borç+" "+kredikartınumarası+" "+kredikartılimiti+" "+kredikartıborcu+" "+krediborcu);
                        check=true;
                        continue;
                    }
                    String newKrediKartıNumarası="0";
                    String newKrediKartıLimiti="0";
                    JOptionPane.showMessageDialog(null, "Müşterinin kredi kartı başarıyla kapatıldı.");
                    check=true;
                    
                    pwriter.println(kullanıcışifresi+" "+kullanıcıIDsi+" "+anapara+" "+borç+" "+newKrediKartıNumarası+" "+newKrediKartıLimiti+" "+kredikartıborcu+" "+krediborcu);
                }
                else{
                    pwriter.println(kullanıcışifresi+" "+kullanıcıIDsi+" "+anapara+" "+borç+" "+kredikartınumarası+" "+kredikartılimiti+" "+kredikartıborcu+" "+krediborcu);
                }
            }
            
            scans.close();
            pwriter.flush();
            pwriter.close();
            oldFile5.delete();
            File yeni5=new File("MüşteriHesapBilgileri.txt");
            newFile5.renameTo(yeni5);
            
            
            File oldFile4=new File("MüşteriHesapBilgileri.txt");
            File newFile4=new File("Tempt.txt");
            Scanner file4 =new Scanner(oldFile4);
            PrintWriter writer4=new PrintWriter(newFile4);
            while(file4.hasNext()){
                String line4 =file4.nextLine();
                if(!line4.isEmpty()){
                    writer4.write(line4);
                    writer4.write("\n");
                }
            }   file4.close();
            writer4.flush();
            writer4.close();
            oldFile4.delete();
            File yeni4=new File("MüşteriHesapBilgileri.txt");
            newFile4.renameTo(yeni4);
            
            if(check==false){
                JOptionPane.showMessageDialog(null, "İşlem geçersiz.Müşterinin ID'si bulunamamış olabilir veya kredi kartı borcu olabilir.");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BankaPersoneli.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BankaPersoneli.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void müşteriKrediKartıLimitArttır(String customerID, String newLimit) {
        
        try {
            String tempFile5="tempx.txt";
            File oldFile5=new File("MüşteriHesapBilgileri.txt");
            File newFile5=new File(tempFile5);
            
            String kullanıcışifresi="";
            String kullanıcıIDsi="";
            String anapara="";
            String borç="";
            String kredikartınumarası="";
            String kredikartılimiti="";
            String kredikartıborcu="";
            String krediborcu="";
            boolean check=false;
            
            
            PrintWriter pwriter = new PrintWriter(new BufferedWriter(new FileWriter(tempFile5,true)));
            Scanner scans= new Scanner(new File("MüşteriHesapBilgileri.txt"));
            scans.useDelimiter("[ \n]");
            
            
            while(scans.hasNext()){
                kullanıcışifresi=scans.next();
                kullanıcıIDsi=scans.next();
                anapara=scans.next();
                borç=scans.next();
                kredikartınumarası=scans.next();
                kredikartılimiti=scans.next();
                kredikartıborcu=scans.next();
                krediborcu=scans.next();
                
                
                if(kullanıcıIDsi.equals(customerID) && !kredikartınumarası.equals("0")){
                    
                    int newLimitInt=Integer.valueOf(newLimit);
                    int kredikartılimitiInt=Integer.valueOf(kredikartılimiti);
                    int kredikartıborcuInt=Integer.valueOf(kredikartıborcu);
                    
                    int eklenecekMiktar=newLimitInt-(kredikartıborcuInt+kredikartılimitiInt);
                    
                    if(eklenecekMiktar<0){
                        
                        JOptionPane.showMessageDialog(null, "Girdiğiniz yeni limit miktarı öncekinden büyük olmalı");
                        pwriter.println(kullanıcışifresi+" "+kullanıcıIDsi+" "+anapara+" "+borç+" "+kredikartınumarası+" "+kredikartılimiti+" "+kredikartıborcu+" "+krediborcu);
                        check=true;
                        continue;
                    }
                    
                    int newKrediKartıLimitiInt=kredikartılimitiInt+eklenecekMiktar;
                    String newKrediKartıLimiti=String.valueOf(newKrediKartıLimitiInt);
                    
                    String message="Limit başarıyla güncellendi.Yeni limit: "+newLimitInt+" TL";
                    JOptionPane.showMessageDialog(null, message);
                    check=true;
                    
                    pwriter.println(kullanıcışifresi+" "+kullanıcıIDsi+" "+anapara+" "+borç+" "+kredikartınumarası+" "+newKrediKartıLimiti+" "+kredikartıborcu+" "+krediborcu);
                }
                else{
                    pwriter.println(kullanıcışifresi+" "+kullanıcıIDsi+" "+anapara+" "+borç+" "+kredikartınumarası+" "+kredikartılimiti+" "+kredikartıborcu+" "+krediborcu);
                }
            }
            
            scans.close();
            pwriter.flush();
            pwriter.close();
            oldFile5.delete();
            File yeni5=new File("MüşteriHesapBilgileri.txt");
            newFile5.renameTo(yeni5);
            
            
            File oldFile4=new File("MüşteriHesapBilgileri.txt");
            File newFile4=new File("Tempt.txt");
            Scanner file4 =new Scanner(oldFile4);
            PrintWriter writer4=new PrintWriter(newFile4);
            while(file4.hasNext()){
                String line4 =file4.nextLine();
                if(!line4.isEmpty()){
                    writer4.write(line4);
                    writer4.write("\n");
                }
            }   file4.close();
            writer4.flush();
            writer4.close();
            oldFile4.delete();
            File yeni4=new File("MüşteriHesapBilgileri.txt");
            newFile4.renameTo(yeni4);
            
            if(check==false){
                JOptionPane.showMessageDialog(null, "İşlem geçersiz.Müşterinin ID'si bulunamamış olabilir veya kredi kartı olmayabilir.");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BankaPersoneli.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BankaPersoneli.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void müşteriLimitGör(String customerID) {
        
        try {
            String kullanıcışifresi="";
            String kullanıcıIDsi="";
            String anapara="";
            String borç="";
            String kredikartınumarası="";
            String kredikartılimiti="";
            String kredikartıborcu="";
            String krediborcu="";
            Boolean c=false;
            
            Scanner scans= new Scanner(new File("MüşteriHesapBilgileri.txt"));
            
            
            while(scans.hasNext()){
                kullanıcışifresi=scans.next();
                kullanıcıIDsi=scans.next();
                anapara=scans.next();
                borç=scans.next();
                kredikartınumarası=scans.next();
                kredikartılimiti=scans.next();
                kredikartıborcu=scans.next();
                krediborcu=scans.next();
                
                if(kullanıcıIDsi.equals(customerID) && !kredikartınumarası.equals("0")){
                    
                    int kredikartılimitiInt=Integer.valueOf(kredikartılimiti);
                    int kredikartıborcuInt=Integer.valueOf(kredikartıborcu);
                    String kredikartılimitiString=String.valueOf(kredikartılimitiInt+kredikartıborcuInt);
                    String message=kullanıcıIDsi+" ID numaralı müşteriye ait kredi kartı limiti: "+kredikartılimitiString+" TL";
                    c=true;
                    JOptionPane.showMessageDialog(null, message);
                }
            }
            
            scans.close();
            
            if(c==false){
                JOptionPane.showMessageDialog(null, "İşlem geçersiz.Müşterinin ID'si bulunamamış olabilir veya kredi kartı olmayabilir.");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BankaPersoneli.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void maaşHesabınıGör() {
        
        try {
            String ad="";
            String soyad="";
            String şifre="";
            String ID="";
            String maaş="";
            String yatırılmışMaaş="";
            
            Scanner scans= new Scanner(new File("BankaPersoneli.txt"));
            
            
            while(scans.hasNext()){
                ad=scans.next();
                soyad=scans.next();
                şifre=scans.next();
                ID=scans.next();
                maaş=scans.next();
                yatırılmışMaaş=scans.next();
                
                if(şifre.equals(this.şifre)){
                    String message="Maaş hesabınızdaki tutar: "+yatırılmışMaaş+" TL";
                    JOptionPane.showMessageDialog(null, message);
                }
            }
            
            scans.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BankaPersoneli.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void müşteriBilgisiGörüntüle(String customerID) {
        
        try {
            String kullanıcışifresi="";
            String kullanıcıIDsi="";
            String anapara="";
            String borç="";
            String kredikartınumarası="";
            String kredikartılimiti="";
            String kredikartıborcu="";
            String krediborcu="";
            boolean c=false;
            
            Scanner scans= new Scanner(new File("MüşteriHesapBilgileri.txt"));
            
            
            while(scans.hasNext()){
                kullanıcışifresi=scans.next();
                kullanıcıIDsi=scans.next();
                anapara=scans.next();
                borç=scans.next();
                kredikartınumarası=scans.next();
                kredikartılimiti=scans.next();
                kredikartıborcu=scans.next();
                krediborcu=scans.next();
                
                if(customerID.equals(kullanıcıIDsi)){
                    if(kredikartınumarası.equals("0")){
                        String message2=kullanıcıIDsi+" ID numaralı müşteriye ait anapara miktarı: "+anapara+" TL.Toplam borç miktarı: "+borç+" TL.Kredi borcu: "+krediborcu+" TL.Müşteriye ait bir kredi kartı bulunmuyor.";
                        JOptionPane.showMessageDialog(null, message2);
                        c=true;
                        continue;
                    }
                    
                    int kredikartılimitiInt=Integer.parseInt(kredikartılimiti);
                    int kredikartıborcuInt=Integer.parseInt(kredikartıborcu);
                    String krediKartıLimitiString=String.valueOf(kredikartılimitiInt+kredikartıborcuInt);
                    
                    String message=kullanıcıIDsi+" ID numaralı müşteriye ait anapara miktarı: "+anapara+" TL.Toplam borç miktarı: "+borç+" TL.Kredi kartı numarası: "+kredikartınumarası+".Kredi kartı limiti: "+krediKartıLimitiString+" TL.Kredi kartı borcu: "+kredikartıborcu+" TL.Kredi borcu: "+krediborcu+" TL.";
                    JOptionPane.showMessageDialog(null, message);
                    c=true;
                }
            }
            scans.close();
            
            if(c==false){
                JOptionPane.showMessageDialog(null, "Böyle bir müşteri bulunamadı.");
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BankaPersoneli.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }

    
}





class BankaYöneticisi extends BankaPersoneli implements Yöneticiİşlemleri{

    public BankaYöneticisi(String ad, String soyad, String şifre,String ID) {
        super(ad, soyad, şifre,ID);
    }
    public BankaYöneticisi(String ad, String soyad, String şifre) {
        super(ad, soyad, şifre);
    }
    public BankaYöneticisi(String şifre){
        super(şifre);
    }
    public BankaYöneticisi(){
        
    }

    @Override
    public void kayıtİşlemleri() {
        try {
            String accountNameControl=this.ad;
            String accountSurnameControl=this.soyad;
            String accountPasswordControl=this.şifre;
            
            Boolean a=false;
            Boolean b=false;
            Boolean c=false;
            
            Scanner scan=new Scanner(new File("BankaYöneticisi.txt"));
            
            String Kelime;
            
            while(scan.hasNext()){
                Kelime=scan.next();
                if(Kelime.equals(accountNameControl)){
                    a=true;
                }
                Kelime=scan.next();
                if(Kelime.equals(accountSurnameControl)){
                    b=true;
                }
                Kelime=scan.next();
                if(Kelime.equals(accountPasswordControl)){
                    c=true;
                }
                scan.next();
            }
            
            scan.close();
            
            if(a==true && b==true){
                JOptionPane.showMessageDialog(null, "Böyle bir kullanıcı zaten var.");
            }
            
            else if (c==true){
                JOptionPane.showMessageDialog(null, "Lütfen farklı bir şifre girin.");
            }
            else{
                
            int x =(int)(Math.random()*9);
            x=x+1;
            String yöneticiID =(x+"")+(((int)(Math.random()*1000))+"");
            
           
                
            BufferedWriter bw=new BufferedWriter(new FileWriter("BankaYöneticisi.txt",true));
            
            bw.write(this.ad+" ");
            bw.write(this.soyad+" ");
            bw.write(this.şifre+" ");
            bw.write(yöneticiID+"\n");
            
            
            bw.close();
            
            
            File oldFile=new File("BankaYöneticisi.txt");
            File newFile=new File("Temp.txt");
            
            Scanner file =new Scanner(oldFile);
            PrintWriter writer=new PrintWriter(newFile);
            
            while(file.hasNext()){
                String line =file.nextLine();
                if(!line.isEmpty()){
                    writer.write(line);
                    writer.write("\n");
                }
            }
            
            file.close();
            writer.close();
            oldFile.delete();
            File yeni=new File("BankaYöneticisi.txt");
            newFile.renameTo(yeni);
            
            
            String message="Yönetici ID'niz "+yöneticiID+".Lütfen ID'nizi unutmayınız."; 
            
            JOptionPane.showMessageDialog(null, "Kaydınız tamamlandı.");
            JOptionPane.showMessageDialog(null,message );
            
            Main.loginAc();
           }
        } catch (IOException ex) {
            Logger.getLogger(Müşteri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void kayıtİşlemleri(String newAccountPassword){
        
        try {
            Scanner scan1= new Scanner(new File("BankaYöneticisi.txt"));
            String şifreKontrol="";
            boolean c=false;
            
            while(scan1.hasNext()){
                scan1.next();
                scan1.next();
                şifreKontrol=scan1.next();
                scan1.next();
                if(şifreKontrol.equals(newAccountPassword)){
                    JOptionPane.showMessageDialog(null, "Bu şifre zaten kullanılmakta.Lütfen farklı bir şifre giriniz.");
                    c=true;
                    break;
                }
            }
            
            scan1.close();
            
            if(c==false){
                
                try {
                    String tempFile="temp.txt";
                    File oldFile=new File("BankaYöneticisi.txt");
                    File newFile=new File(tempFile);
                    
                    String ad="";
                    String soyad="";
                    String şifre="";
                    String ID="";
                    Boolean d=false;
                    
                    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(tempFile,true)));
                    Scanner scan= new Scanner(new File("BankaYöneticisi.txt"));
                    scan.useDelimiter("[ \n]");
                    
                    while(scan.hasNext()){
                        ad=scan.next();
                        soyad=scan.next();
                        şifre=scan.next();
                        ID=scan.next();
                        
                        if(şifre.equals(this.şifre)){
                            pw.println(ad+" "+soyad+" "+newAccountPassword+" "+ID);
                            d=true;
                            JOptionPane.showMessageDialog(null, "Şifreniz başarıyla değiştirildi");
                        }
                        
                        else{
                            pw.println(ad+" "+soyad+" "+şifre+" "+ID);
                        }
                    }
                    
                    if(d==false){
                        JOptionPane.showMessageDialog(null, "Şifre değiştirme işlemi başarısız.");
                    }
                    
                    scan.close();
                    pw.flush();
                    pw.close();
                    oldFile.delete();
                    File yeni=new File("BankaYöneticisi.txt");
                    newFile.renameTo(yeni);
                    
                    
                    
                    File oldFile2=new File("BankaYöneticisi.txt");
                    File newFile2=new File("Temp.txt");
                    
                    Scanner file2 =new Scanner(oldFile2);
                    PrintWriter writer2=new PrintWriter(newFile2);
                    
                    while(file2.hasNext()){
                        String line2 =file2.nextLine();
                        if(!line2.isEmpty()){
                            writer2.write(line2);
                            writer2.write("\n");
                        }
                    }
                    
                    file2.close();
                    writer2.flush();
                    writer2.close();
                    oldFile2.delete();
                    File yeni2=new File("BankaYöneticisi.txt");
                    newFile2.renameTo(yeni2);
                    
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(BankaYöneticisi.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(BankaYöneticisi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BankaYöneticisi.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    

    @Override
    public void giriş() {
        try {
            String accountNameControl=this.ad;
            String accountSurnameControl=this.soyad;
            String accountPasswordControl=this.şifre;
            String accountID=this.ID;
            
            Boolean a=false;
            Boolean b=false;
            Boolean c=false;
            Boolean d=false;
            
            Scanner scan=new Scanner(new File("BankaYöneticisi.txt"));
            
            String Kelime;
            
            while(scan.hasNext()){
                Kelime=scan.next();
                a=false;
                if(Kelime.equals(accountNameControl)){
                    a=true;
                }
                Kelime=scan.next();
                b=false;
                if(Kelime.equals(accountSurnameControl)){
                    b=true;
                }
                Kelime=scan.next();
                c=false;
                if(Kelime.equals(accountPasswordControl)){
                    c=true;
                }
                Kelime=scan.next();
                d=false;
                if(Kelime.equals(accountID)){
                    d=true;
                }
                if(a==true && b==true && c==true && d==true){
                    break;
                }
            }
            
            if(a==true && b==true && c==true && d==true){
                JOptionPane.showMessageDialog(null, "Giriş başarılı.");
                YöneticiEkranı yöneticiekranı=new YöneticiEkranı();
                YöneticiEkranı.adminInterfaceName.setText(Login.accountName.getText().toLowerCase());
                YöneticiEkranı.adminInterfaceSurname.setText(Login.accountSurname.getText().toLowerCase());
                YöneticiEkranı.Password=Login.accountPassword.getText();
                YöneticiEkranı.ID=Login.accountID.getText();
                yöneticiekranı.setVisible(true);
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Giriş başarısız.Lütfen tekrar deneyin.");
            }
            
            
            scan.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Müşteri.class.getName()).log(Level.SEVERE, null, ex);
        }
  }

    @Override
    public void personelMaaşBelirle(String staffID, String staffSalary) {
        
        try {
            String tempFile="temp.txt";
            File oldFile=new File("BankaPersoneli.txt");
            File newFile=new File(tempFile);
                    
            String ad="";
            String soyad="";
            String şifre="";
            String ID="";
            String maaş="";
            String yatırılmışMaaş="";
            Boolean d=false;
                    
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(tempFile,true)));
            Scanner scan= new Scanner(new File("BankaPersoneli.txt"));
            scan.useDelimiter("[ \n]");
            
            while(scan.hasNext()){
                ad=scan.next();
                soyad=scan.next();
                şifre=scan.next();
                ID=scan.next();
                maaş=scan.next();
                yatırılmışMaaş=scan.next();
                
                if(staffID.equals(ID)){
                    
                    int newmaaşInt=Integer.parseInt(staffSalary);
                    String newMaaşString=String.valueOf(newmaaşInt);
                    String message=ID+" ID numaralı personelin maaşı başarıyla değiştirildi.Yeni maaş: "+newMaaşString+" TL";
                    JOptionPane.showMessageDialog(null, message);
                    d=true;
                    
                    pw.println(ad+" "+soyad+" "+şifre+" "+ID+" "+newMaaşString+" "+yatırılmışMaaş);
                    
                }
                else{
                    pw.println(ad+" "+soyad+" "+şifre+" "+ID+" "+maaş+" "+yatırılmışMaaş);
                }
            }
            
            if(d==false){
                JOptionPane.showMessageDialog(null, "Personel bulunamadı.");
            }
                    
            scan.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File yeni=new File("BankaPersoneli.txt");
            newFile.renameTo(yeni);
            
            
            
            File oldFile2=new File("BankaPersoneli.txt");
            File newFile2=new File("Temp.txt");
                    
            Scanner file2 =new Scanner(oldFile2);
            PrintWriter writer2=new PrintWriter(newFile2);
                    
            while(file2.hasNext()){
                String line2 =file2.nextLine();
                if(!line2.isEmpty()){
                    writer2.write(line2);
                    writer2.write("\n");
                }
            }
            
            file2.close();
            writer2.flush();
            writer2.close();
            oldFile2.delete();
            File yeni2=new File("BankaPersoneli.txt");
            newFile2.renameTo(yeni2);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BankaYöneticisi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BankaYöneticisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void personelBilgisiGörüntüle(String staffName, String staffSurname) {
        
        try {
            String ad="";
            String soyad="";
            String şifre="";
            String ID="";
            String maaş="";
            String yatırılmışMaaş="";
            boolean a=false;
            
            Scanner scans= new Scanner(new File("BankaPersoneli.txt"));
            
            
            while(scans.hasNext()){
                ad=scans.next();
                soyad=scans.next();
                şifre=scans.next();
                ID=scans.next();
                maaş=scans.next();
                yatırılmışMaaş=scans.next();
                
                if(ad.equals(staffName) && soyad.equals(staffSurname)){
                    String message="Personelin ID'si: "+ID+".Maaşı: "+maaş+".Maaş hesabındaki tutarı: "+yatırılmışMaaş;
                    JOptionPane.showMessageDialog(null, message);
                    a=true;
                }
            }
            scans.close();
            
            if(a==false){
                JOptionPane.showMessageDialog(null, "Belirttiğiniz ad ve soyada sahip kullanıcı bulunamadı.");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BankaYöneticisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void personelKaydıSil(String staffID) {
        
        try {
            String tempFile="temp.txt";
            File oldFile=new File("BankaPersoneli.txt");
            File newFile=new File(tempFile);
                    
            String ad="";
            String soyad="";
            String şifre="";
            String ID="";
            String maaş="";
            String yatırılmışMaaş="";
            Boolean d=false;
                    
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(tempFile,true)));
            Scanner scan= new Scanner(new File("BankaPersoneli.txt"));
            scan.useDelimiter("[ \n]");
            
            while(scan.hasNext()){
                ad=scan.next();
                soyad=scan.next();
                şifre=scan.next();
                ID=scan.next();
                maaş=scan.next();
                yatırılmışMaaş=scan.next();
                
                if(staffID.equals(ID)){
                    
                    String message=ID+" ID numaralı personelin kaydı başarıyla silindi.Personelin maaş hesabından kendisine verilen tutar: "+yatırılmışMaaş+" TL";
                    JOptionPane.showMessageDialog(null, message);
                    d=true;
                    
                }
                else{
                    pw.println(ad+" "+soyad+" "+şifre+" "+ID+" "+maaş+" "+yatırılmışMaaş);
                }
            }
            
            if(d==false){
                JOptionPane.showMessageDialog(null, "Personel bulunamadı.");
            }
                    
            scan.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File yeni=new File("BankaPersoneli.txt");
            newFile.renameTo(yeni);
            
            
            
            File oldFile2=new File("BankaPersoneli.txt");
            File newFile2=new File("Temp.txt");
                    
            Scanner file2 =new Scanner(oldFile2);
            PrintWriter writer2=new PrintWriter(newFile2);
                    
            while(file2.hasNext()){
                String line2 =file2.nextLine();
                if(!line2.isEmpty()){
                    writer2.write(line2);
                    writer2.write("\n");
                }
            }
            
            file2.close();
            writer2.flush();
            writer2.close();
            oldFile2.delete();
            File yeni2=new File("BankaPersoneli.txt");
            newFile2.renameTo(yeni2);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BankaYöneticisi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BankaYöneticisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void personelMaaşÖde() {
        
        try {
            String tempFile="temp.txt";
            File oldFile=new File("BankaPersoneli.txt");
            File newFile=new File(tempFile);
                    
            String ad="";
            String soyad="";
            String şifre="";
            String ID="";
            String maaş="";
            String yatırılmışMaaş="";
            Boolean d=false;
                    
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(tempFile,true)));
            Scanner scan= new Scanner(new File("BankaPersoneli.txt"));
            scan.useDelimiter("[ \n]");
            
            while(scan.hasNext()){
                ad=scan.next();
                soyad=scan.next();
                şifre=scan.next();
                ID=scan.next();
                maaş=scan.next();
                yatırılmışMaaş=scan.next();
                
                int yatırılmışMaaşInt=Integer.parseInt(yatırılmışMaaş);
                int maaşInt=Integer.parseInt(maaş);
                
                String newYatırılmışMaaşInt=String.valueOf(yatırılmışMaaşInt+maaşInt);
                
                pw.println(ad+" "+soyad+" "+şifre+" "+ID+" "+maaş+" "+newYatırılmışMaaşInt);
                
            }
            
            JOptionPane.showMessageDialog(null, "Bütün personellerin maaşları başarıyla yatırıldı.");
                    
            scan.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File yeni=new File("BankaPersoneli.txt");
            newFile.renameTo(yeni);
            
            
            
            File oldFile2=new File("BankaPersoneli.txt");
            File newFile2=new File("Temp.txt");
                    
            Scanner file2 =new Scanner(oldFile2);
            PrintWriter writer2=new PrintWriter(newFile2);
                    
            while(file2.hasNext()){
                String line2 =file2.nextLine();
                if(!line2.isEmpty()){
                    writer2.write(line2);
                    writer2.write("\n");
                }
            }
            
            file2.close();
            writer2.flush();
            writer2.close();
            oldFile2.delete();
            File yeni2=new File("BankaPersoneli.txt");
            newFile2.renameTo(yeni2);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BankaYöneticisi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BankaYöneticisi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    static public void tümünüGörüntüle(Kullanıcı kullanıcı){
        
       try{
        if(kullanıcı instanceof BankaPersoneli){
            
            PersonelTablosu p=new PersonelTablosu();
            File file=new File("BankaPersoneli.txt");
            BufferedReader br=new BufferedReader(new FileReader(file));
            DefaultTableModel model=(DefaultTableModel)PersonelTablosu.jTable1.getModel();
            
            Object[] tableLines=br.lines().toArray();
            
            for(int i=0;i<tableLines.length;i++)
            {
                
                String[] dataRow=tableLines[i].toString().split(" ");
                model.addRow(dataRow);
                
            }
            br.close();
            p.setVisible(true);
            
        }
        else if(kullanıcı instanceof Müşteri){
            
            MüşteriTablosu p1=new MüşteriTablosu();
            File file1=new File("MüşteriHesapBilgileri.txt");
            BufferedReader bre=new BufferedReader(new FileReader(file1));
            DefaultTableModel model1=(DefaultTableModel)MüşteriTablosu.jTable1.getModel();
            
            
            Object[] tableLines1=bre.lines().toArray();
            
            for(int i=0;i<tableLines1.length;i++)
            {
                String row[]=tableLines1[i].toString().split(" ");
                model1.addRow(row);
                    
                
            }
            bre.close();
            p1.setVisible(true);
        }
       }
       catch(FileNotFoundException e){
           JOptionPane.showMessageDialog(null, "Dosya bulunamadı.");
       } catch (IOException ex) {
            Logger.getLogger(BankaYöneticisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
 

public class Main {
    
       
static public void loginAc(){
       Login log=new Login();
       log.setVisible(true);
}

static public boolean müşteriŞifreKontrol(String newPassword){
    Boolean d=false;
    try {
        Scanner scan= new Scanner(new File("Müşteriler.txt"));
        String şifreKontrol="";
        while(scan.hasNext()){
            scan.next();
            scan.next();
            şifreKontrol=scan.next();
            scan.next();
            if(şifreKontrol.equals(newPassword)){
                JOptionPane.showMessageDialog(null, "Bu şifre zaten kullanılmakta.Lütfen farklı bir şifre giriniz.");
                d=true;
                break;
            }
        }
        scan.close();
    } catch (FileNotFoundException ex) {
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }
         return d;
}

    public static void main(String[] args) {
        new Kaydolma().setVisible(true);
    }
    
}
