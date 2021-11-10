class Main
{
    public static void main(String args[])
    {
        SuaraBebek suaraBebek = new SuaraBebek();
        SuaraKucing suaraKucing = new SuaraKucing();
        Kucing kucing = new SuaraKucing();
        Bebek Bebek = new SuaraBebek();
  
        System.out.print("\t**Suara Binatang**\n");
        Kucing BebekAdapter = new KucingAdapter(suaraBebek);  
        System.out.print("1. Suara Kucing\t: ");
        kucing.miaou();

        Bebek KucingAdapter = new BebekAdapter(suaraKucing);  
        System.out.print("2. Suara Bebek\t: ");
        Bebek.kwek();
  

        System.out.print("\n\t**Konvert Pertukaran Suara**\n");
        System.out.print("1. Keluarkan Suara kucing terbaru\t: ");
        BebekAdapter.miaou();

        System.out.print("2. Keluarkan Suara Bebek terbaru\t: ");
        KucingAdapter.kwek();
    }
} 