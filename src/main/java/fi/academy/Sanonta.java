package fi.academy;

import org.springframework.stereotype.Component;

@Component
public class Sanonta {

    private String elokuva;
    private String sanonta;

    public Sanonta() {
    }

    public Sanonta(String elokuva, String sanonta) {
        this.elokuva = elokuva;
        this.sanonta = sanonta;
    }

    public String getElokuva() {
        return elokuva;
    }

    public void setElokuva(String elokuva) {
        this.elokuva = elokuva;
    }

    public String getSanonta() {
        return sanonta;
    }

    public void setSanonta(String sanonta) {
        this.sanonta = sanonta;
    }
}
