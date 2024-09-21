package mosbach.dhbw.de.cftestbackend.model.Logik;


import java.time.LocalDateTime;
import java.util.Objects;

public class Termin {

    private int id;
    private User kunde;        // Kunde, der den Termin bucht
    private Service dienstleistung;
    private LocalDateTime startzeit;
    private LocalDateTime endzeit;
    private boolean bestaetigt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getKunde() {
        return kunde;
    }

    public void setKunde(User kunde) {
        this.kunde = kunde;
    }

    public Service getDienstleistung() {
        return dienstleistung;
    }

    public void setDienstleistung(Service dienstleistung) {
        this.dienstleistung = dienstleistung;
    }

    public LocalDateTime getStartzeit() {
        return startzeit;
    }

    public void setStartzeit(LocalDateTime startzeit) {
        this.startzeit = startzeit;
    }

    public LocalDateTime getEndzeit() {
        return endzeit;
    }

    public void setEndzeit(LocalDateTime endzeit) {
        this.endzeit = endzeit;
    }

    public boolean isBestaetigt() {
        return bestaetigt;
    }

    public void setBestaetigt(boolean bestaetigt) {
        this.bestaetigt = bestaetigt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Termin termin = (Termin) o;
        return id == termin.id && bestaetigt == termin.bestaetigt && Objects.equals(kunde, termin.kunde) && Objects.equals(dienstleistung, termin.dienstleistung) && Objects.equals(startzeit, termin.startzeit) && Objects.equals(endzeit, termin.endzeit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, kunde, dienstleistung, startzeit, endzeit, bestaetigt);
    }

    @Override
    public String toString() {
        return "Termin{" +
                "id=" + id +
                ", kunde=" + kunde +
                ", dienstleistung=" + dienstleistung +
                ", startzeit=" + startzeit +
                ", endzeit=" + endzeit +
                ", bestaetigt=" + bestaetigt +
                '}';
    }
}
