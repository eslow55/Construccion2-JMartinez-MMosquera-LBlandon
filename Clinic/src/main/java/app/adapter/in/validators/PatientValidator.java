/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.adapter.in.validators;

import org.springframework.stereotype.Component;

/**
 *
 * @author ESTUDIANTE
 */

@Component
public class PatientValidator extends SimpleValidator {

    public String nameValidator(String value) throws Exception {
        return stringValidator("Nombre del paciente ", value);
    }

    public String featuresValidator(String value) throws Exception {
        return stringValidator("Nombre del paciente ", value);
    }
    
    
    public String breedValidator(String value) throws Exception {
        return stringValidator("Nombre del paciente ", value);
    }
    public double weigthValidator(String value) throws Exception{
        return doubleValidator("el peso del paciente", value);
    }
    public int ageValidator(String value) throws Exception{
        return integerValidator("el peso del paciente", value);
    }
    
    public long idValidator(String value) throws Exception{
        return longValidator("el peso del paciente", value);
    }
    

}