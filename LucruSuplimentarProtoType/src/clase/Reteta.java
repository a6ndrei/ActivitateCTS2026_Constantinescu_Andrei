package clase;

public class Reteta implements IReteta {
    private String medic;
    private String diagnostic;

    public String getMedic() {
        return medic;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setMedic(String medic) {
        this.medic = medic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public Reteta(String medic, String diagnostic) {
        this.medic = medic;
        this.diagnostic = diagnostic;
    }

    public Reteta() {
    }

    @Override
    public IReteta clonare() {
        Reteta reteta = new Reteta();
        reteta.diagnostic=this.diagnostic;
        reteta.medic=this.medic;
        return reteta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("medic='").append(medic).append('\'');
        sb.append(", diagnostic='").append(diagnostic).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
