package system.model;

import java.util.UUID;

public class VisaApplication {
    private UUID id;
    private VisaType type;
    private String notes;
    private Client client;

    public VisaApplication(){
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public VisaType getType() {
        return type;
    }

    public void setType(VisaType type) {
        this.type = type;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VisaApplication that = (VisaApplication) o;

        return id != null ? id.equals(that.id) : that.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
