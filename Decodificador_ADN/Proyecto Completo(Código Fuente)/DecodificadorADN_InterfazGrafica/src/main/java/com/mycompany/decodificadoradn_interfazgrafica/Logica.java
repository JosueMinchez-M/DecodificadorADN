package com.mycompany.decodificadoradn_interfazgrafica;

import javax.swing.JTextField;

/**
 *
 * @author joshua
 */
public class Logica {
    
    String ADN_1 = "";
    String ADN_2 = "";
    
    public void Proceso(JTextField ADN1, JTextField ADN2, JTextField resultado) {
        String susecionADN = "";
        ADN_1 = ADN1.getText();
        ADN_2 = ADN2.getText();
         
        //Con el ciclo for examinamos de derecha a izquierda la secuencia de ADN ADN_1
        for (int i = ADN_1.length(); i >= 0 ; i--) {
            //Con este siguiente ciclo for se examina de izquierda a derecha la secuencia de ADN ADN_2
            for (int j = 0; j < i; j++) {
                /*Con esta sentencia examinamos con el tamaño del nombre de ADN_1, cada vez  
                que esto se haga, se compara el caracter que se examina en cada for con lo
                que se ingresa en ADN_2. Entonces se tomaran los caracteres que se repiten
                en secuencia entre las dos palabras*/
                if(ADN_2.contains(ADN_1.substring(j, i)) && susecionADN.length() < ADN_1.substring(j, i).length()){
                    //La secuencia que se extrae entre lo que se ingreso en ADN_1 Y ADN_2 se guarda en "secuencia"
                    susecionADN = ADN_1.substring(j, i);
                }
            }
        }
        //Se muestra en pantalla la palabra encontrada o en su defecto un aviso de que no se ha encontrado
        if(susecionADN != ""){
            resultado.setText(susecionADN);
        }else{
            resultado.setText("NO SE ENCONTRARON COINCIDENCIAS");
        }
    }
    
}
