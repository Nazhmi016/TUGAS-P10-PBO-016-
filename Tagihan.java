public class Tagihan extends Pembayaran{

    Tagihan(int biaya){
        super(biaya);
    }

    @Override
    int pembayaran() {
        return super.getBayarJahit();
    }
}