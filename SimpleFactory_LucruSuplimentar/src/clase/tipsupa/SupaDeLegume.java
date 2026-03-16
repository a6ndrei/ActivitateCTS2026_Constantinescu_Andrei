package clase.tipsupa;

public class SupaDeLegume implements TipSupa {
    private String bucatar;
    private String restaurant;

    public SupaDeLegume(String bucatar, String restaurant) {
        this.bucatar = bucatar;
        this.restaurant = restaurant;
    }

    @Override
    public void afiseazaTipSupa() {
        StringBuilder sb = new StringBuilder();
        sb.append("Supa de legume ").append(" facuta de bucatarul ")
                .append(this.bucatar).append(" la restaurantul ")
                .append(this.restaurant);
        System.out.println(sb.toString());
    }
}
