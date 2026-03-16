package clase.tipsupa;

public class SupaDeCiuperci implements TipSupa{
    private String bucatar;
    private String restaurant;

    public SupaDeCiuperci(String bucatar, String restaurant) {
        this.bucatar = bucatar;
        this.restaurant = restaurant;
    }

    @Override
    public void afiseazaTipSupa() {
        StringBuilder sb = new StringBuilder();
        sb.append("Supa de ciuperci ").append(" facuta de bucatarul ")
                .append(this.bucatar).append(" la restaurantul ")
                .append(this.restaurant);
        System.out.println(sb.toString());
    }
}
