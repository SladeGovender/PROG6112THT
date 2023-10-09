/**
 *
 * @author sladegovender
 */
public class CameraPriceComparison {
    public static void main(String[] args) {
        String[] manufacturers = {"CANON", "SONY", "NIKON"};
        int[][] cameraPrices = {
            {10500, 8500},
            {9500, 7200},
            {12000, 8000}
        };

        int biggestDiff = 0;
        String manufacturerWithBiggestDiff = "";

        System.out.println("CAMERA TECHNOLOGY REPORT:");
        System.out.println("Manufacturer\tMirrorless Price\tDSLR Price\tCamera Technology Results");

        for (int i = 0; i < manufacturers.length; i++) {
            String manufacturer = manufacturers[i];
            int mirrorlessPrice = cameraPrices[i][0];
            int dslrPrice = cameraPrices[i][1];
            int priceDiff = mirrorlessPrice - dslrPrice;

            System.out.printf("%s\t\tR %d\t\t\tR %d\t\t\tR %d", manufacturer, mirrorlessPrice, dslrPrice, priceDiff);

            if (priceDiff >= 2500) {
                System.out.print(" ***");
            }

            System.out.println();

            if (priceDiff > biggestDiff) {
                biggestDiff = priceDiff;
                manufacturerWithBiggestDiff = manufacturer;
            }
        }

        System.out.println("\nCAMERA WITH THE GREATEST COST DIFFERENCE: " + manufacturerWithBiggestDiff);
    }
}
