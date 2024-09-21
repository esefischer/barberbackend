package mosbach.dhbw.de.cftestbackend.model.Logik;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class User {


    private static final Logger log = LoggerFactory.getLogger(User.class);



    private  int id ;
    private String vorname ;
    private String nachname;
    private String email;
    private String passwort ;
    private int token;
    private String rolle ;

    public User(int id, String vorname, String nachname, String email, String passwort, int token, String rolle ) {
        this.id = id;
        this.vorname = vorname;
        this.nachname = nachname;
        this.email = email;
        this.passwort = passwort;
        this.token = token;
        this. rolle =  rolle;
    }


    public User(String vorname, String nachname, String email, String passwort, String Rolle) {
        this.id = id;
        this.vorname = vorname;
        this.nachname = nachname;
        this.email = email;
        this.passwort = passwort;
        this.rolle = rolle;

    }

    public User(int id, String vorname, String nachname, String email, String passwort, String rolle ) {
        this.id = id;
        this.vorname = vorname;
        this.nachname = nachname;
        this.email = email;
        this.passwort = passwort;
        this. rolle =  rolle;
    }


    public String registrieren(){

      return "Nutzer 1 wurde registriert" ;
    }

    public int anmelden(){

        return 0;
    }

    public void abmelden(int token){


    }

    public int getId() {
        return id;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getEmail() {
        return email;
    }

    public String getPasswort() {
        return passwort;
    }

    public int getToken() {
        return token;
    }

    public String getRolle() {
        return rolle;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    public void setToken(int token) {
        this.token = token;
    }

    public void setRolle(String rolle) {
        this.rolle = rolle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && token == user.token && Objects.equals(vorname, user.vorname) && Objects.equals(nachname, user.nachname) && Objects.equals(email, user.email) && Objects.equals(passwort, user.passwort) && Objects.equals(rolle, user.rolle);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", email='" + email + '\'' +
                ", passwort='" + passwort + '\'' +
                ", token=" + token +
                ", rolle='" + rolle + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, vorname, nachname, email, passwort, token, rolle);


    }
}
