package service;

import entity.Personel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonelService implements IPersonelService {

    private List<Personel> personelList=new ArrayList<Personel>();


    public void kaydet(Personel personel) {

        if (personel!=null){

            Personel yeniPersonel=new Personel();

            yeniPersonel.setId(personel.getId());
            yeniPersonel.setDepartman(personel.getDepartman());
            yeniPersonel.setIseGirisTarih(personel.getIseGirisTarih());
            yeniPersonel.setMaas(personel.getMaas());
            yeniPersonel.setOlusturanKisi("Developer");
            yeniPersonel.setOlusturulmaTarihi(new Date());
            yeniPersonel.setGuncellemeTarihi(null);
            yeniPersonel.setAd(personel.getAd());
            yeniPersonel.setSoyad(personel.getSoyad());
            yeniPersonel.setDogumTarihi(personel.getDogumTarihi());
            yeniPersonel.setTcNo(personel.getTcNo());
            yeniPersonel.setTelNo(personel.getTelNo());
            yeniPersonel.setSicilNo(personel.getSicilNo());
            yeniPersonel.setUnvan(personel.getUnvan());

            personelList.add(yeniPersonel);

        }

    }

    public List<Personel> personelListesiGetir() {
        return personelList;

    }
}
