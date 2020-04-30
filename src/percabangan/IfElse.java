package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 25000;
        double uangDiDompet = 50000;

        if(uangDiDompet<totalBelanja) { // kondisi bernilai false
            System.out.println("Uang Kurang, Kurangi belanja anda");
        }else if(uangDiDompet>totalBelanja) {
            double kembalian = uangDiDompet-totalBelanja;
            System.out.println("Uang Cukup, Kembalian : "+kembalian);
        }else {
            System.out.println("Uang Pas, Awokwokwokwok");
        }
    }
}
