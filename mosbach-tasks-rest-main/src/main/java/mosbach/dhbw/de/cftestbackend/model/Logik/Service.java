package mosbach.dhbw.de.cftestbackend.model.Logik;

import java.time.Duration;
import java.util.Objects;

public class Service {

    private int id;
    private String name;           // Name der Dienstleistung, z.B. "Haarschnitt"
    private double preis;          // Preis der Dienstleistung
    private Duration dauer;

    public Service(int id, String name, double preis, Duration dauer) {
        this.id = id;
        this.name = name;
        this.preis = preis;
        this.dauer = dauer;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPreis() {
        return preis;
    }

    public Duration getDauer() {
        return dauer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public void setDauer(Duration dauer) {
        this.dauer = dauer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Service service = (Service) o;
        return id == service.id && Double.compare(preis, service.preis) == 0 && Objects.equals(name, service.name) && Objects.equals(dauer, service.dauer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, preis, dauer);
    }

    @Override
    public String toString() {
        return "Service{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", preis=" + preis +
                ", dauer=" + dauer +
                '}';
    }
}
