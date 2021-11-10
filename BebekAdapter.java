class BebekAdapter implements Bebek{
    Kucing Bebek;
    public BebekAdapter(Kucing Bebek){
        this.Bebek = Bebek;
    }
  
    public void kwek(){
        Bebek.miaou();
    }
}
   