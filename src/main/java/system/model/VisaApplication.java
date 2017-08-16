package system.model;

public class VisaApplication {
    private Long id;
    private VisaType type;
    private String notes;

    public VisaApplication(){
    }


    public VisaType getType() {
        return type;
    }

    public void setType(VisaType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VisaApplication that = (VisaApplication) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        return type == that.type;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
