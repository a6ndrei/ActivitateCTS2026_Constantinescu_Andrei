package clase;

public class Rezervare {
    private boolean asezareLaGeam;
    private String genMuzica;
    private boolean decorareaMesei;

    public boolean isAsezareLaGeam() {
        return asezareLaGeam;
    }

    public String isGenMuzica() {
        return genMuzica;
    }

    public boolean isDecorareaMesei() {
        return decorareaMesei;
    }

    private Rezervare(RezervareBuilder builder) {
        this.asezareLaGeam = builder.asezareLaGeam;
        this.genMuzica = builder.genMuzica;
        this.decorareaMesei = builder.decorareaMesei;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("asezareLaGeam=").append(asezareLaGeam);
        sb.append(", genMuzica=").append(genMuzica);
        sb.append(", decorareaMesei=").append(decorareaMesei);
        sb.append('}');
        return sb.toString();
    }

    public static class RezervareBuilder implements IRezervare {
        private boolean asezareLaGeam;
        private String genMuzica;
        private boolean decorareaMesei;

        public RezervareBuilder setAsezareLaGeam(boolean asezareLaGeam){
            this.asezareLaGeam= asezareLaGeam;
            return this;
        }
        public RezervareBuilder setGenMuzica(String genMuzica){
            this.genMuzica=genMuzica;
            return this;
        }
        public RezervareBuilder setDecorareaMesei(boolean decorareaMesei){
            this.decorareaMesei=decorareaMesei;
            return this;
        }


        @Override
        public Rezervare build() {
            return new Rezervare(this);
        }
    }
}
