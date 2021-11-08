package hello;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author viter
 */
public class MessageBean implements Serializable {
    
    private String msg;
    private String saudacao;
    private String tratamento;
    private int hora;
    private Map<String,String[]> saudacoesMap = new HashMap<String,String[]>();
        
    public MessageBean() {
        this.hora = LocalTime.now().getHour();
        String[] saudacoesPt = new String[4];
        saudacoesPt[0] = "Alô!";
        saudacoesPt[1] = "Bom dia!";
        saudacoesPt[2] = "Boa tarde!";
        saudacoesPt[3] = "Boa noite!";
        this.saudacoesMap.put("pt",saudacoesPt);
        String[] saudacoesEn = new String[4];
        saudacoesEn[0] = "Hello!";
        saudacoesEn[1] = "Good morning!";
        saudacoesEn[2] = "Good afternoon!";
        saudacoesEn[3] = "Good night!";
        this.saudacoesMap.put("en",saudacoesEn);
        String[] saudacoesFr = new String[4];
        saudacoesFr[0] = "Bonjour!";
        saudacoesFr[1] = "Bonjour!";
        saudacoesFr[2] = "Bon après-midi!";
        saudacoesFr[3] = "Bonne nuit!";
        this.saudacoesMap.put("fr",saudacoesFr);
        String[] saudacoesDe = new String[4];
        saudacoesDe[0] = "Hallo!";
        saudacoesDe[1] = "Guten Morgen!";
        saudacoesDe[2] = "Guten Tag!";
        saudacoesDe[3] = "Gute Nacht!";
        this.saudacoesMap.put("de",saudacoesDe);
        String[] saudacoesIt = new String[4];
        saudacoesIt[0] = "Ciao!";
        saudacoesIt[1] = "Buongiorno!";
        saudacoesIt[2] = "Buon pomeriggio!";
        saudacoesIt[3] = "Buona Notte!";
        this.saudacoesMap.put("it",saudacoesIt);
        String[] saudacoesSe = new String[4];
        saudacoesSe[0] = "Hej!";
        saudacoesSe[1] = "God morgon!";
        saudacoesSe[2] = "God eftermiddag!";
        saudacoesSe[3] = "Godnatt!";
        this.saudacoesMap.put("se",saudacoesSe);
    }
    
    public String getMsg() {
        return msg;
    }
    
    public void setMsg(String value) {
        this.msg = saudacoesMap.get(value)[0];
        this.setSaudacao(value);
    }

    public String getSaudacao() {
        return saudacao;
    }

    public void setSaudacao(String value) {
        if( this.hora >= 18) {
            this.saudacao = saudacoesMap.get(value)[3];
        } else if (this.hora >= 12) {
            this.saudacao = saudacoesMap.get(value)[2];
        } else {
            this.saudacao = saudacoesMap.get(value)[1];
        }
    }

    public String getTratamento() {
        return tratamento;
    }

    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }
    
}
