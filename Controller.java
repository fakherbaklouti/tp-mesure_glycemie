package com.example.fakher_baklouti_lsi3_mesure_glycemie;
import android.widget.RadioButton;
import android.widget.SeekBar;

import com.example.fakher_baklouti_lsi3_mesure_glycemie.model.Patient;
public class Controller {
    private static Patient patient;
    public Controller()
    {
        super();
    }
    public void create_patient(int age ,float valeur , boolean isFasting){
        patient=new Patient(age,valeur,isFasting) ;
    }
    //update entre le controller vers la view
    public String getResult(){

        return patient.getResult();//update patient to controller
    }


}
