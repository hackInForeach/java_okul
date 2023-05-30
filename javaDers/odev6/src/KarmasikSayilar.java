public class KarmasikSayilar {
    private double imajiner;
    private double reel;

    public KarmasikSayilar(double _imajiner,double _reel){

        setImajiner(_imajiner);
        setReel(_reel);

    }

    public double getImajiner() {
        return imajiner;
    }

    public void setImajiner(double _imajiner) {
        this.imajiner = _imajiner;
    }

    public double getReel() {
        return reel;
    }

    public void setReel(double _reel) {
        this.reel = _reel;
    }
    public KarmasikSayilar topla(KarmasikSayilar diger){

        double sonucReel= reel+diger.reel;
        double sonucImajiner=imajiner+diger.imajiner;

        return new KarmasikSayilar(sonucImajiner,sonucReel);
    }
    public KarmasikSayilar carp(KarmasikSayilar diger){

        double sonucImajiner=imajiner*diger.imajiner-reel*diger.reel;
        double sonucReel= reel*diger.imajiner+imajiner*diger.reel;

        return new KarmasikSayilar(sonucImajiner,sonucReel);
    }
    public boolean esitmi(KarmasikSayilar diger){

        return (Math.abs(reel-diger.reel)==0&&Math.abs(imajiner-diger.imajiner)==0);
    }
    public void yazdir(){
        System.out.printf("%.1f + %.1fi\n",reel,imajiner);
    }
}
