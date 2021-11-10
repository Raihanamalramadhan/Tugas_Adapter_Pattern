class KucingAdapter implements Kucing{
    Bebek kucing;
    public KucingAdapter(Bebek kucing){
        this.kucing = kucing;
    }
  
    public void miaou(){
        kucing.kwek();
    }
}
 