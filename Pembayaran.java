abstract public class Pembayaran {

    int biayaJahit;

    Pembayaran(int biaya){
        this.biayaJahit = biaya;
    }

    public int getBayarJahit(){
        return biayaJahit;
    }

    abstract int pembayaran();
}