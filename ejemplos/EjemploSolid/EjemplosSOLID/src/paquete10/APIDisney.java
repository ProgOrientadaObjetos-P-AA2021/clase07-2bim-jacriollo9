/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete10;

/**
 *
 * @author Usuario iTC
 */
public class APIDisney implements APIMovie{
    private String apiKey;
    
    @Override
    public void establecerApiKey(String k){
        apiKey = k+"119090";
    }
    
    @Override
    public String obtenerApiKey(){
        return apiKey;
        
    }
}    