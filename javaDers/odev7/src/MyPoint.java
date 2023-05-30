public class MyPoint {

    private int x;
    private int y;
    private int[][] xY;

    MyPoint() {
        x = 0;
        y = 0;
        xY = new int[x][y];
    }

    MyPoint(int _x, int _y) {
        x = _x;
        y = _y;
        xY = new int[x][y];
    }

    public int getX() {
        return x;
    }

    public void setX(int _x) {
        x = _x;
    }

    public int getY() {
        return y;
    }

    public void setY(int _y) {
        y = _y;
    }

    public void setXY(int _x, int _y) {
        x = _x;
        y = _y;
        xY = new int[x][y];
    }

    public int getXY(int _x, int _y) {
        return xY[_x][_y];
    }

    public void hesapla(int _x, int _y, int deger) {
        xY[_x][_y] = deger;
    }

    public void printXY() {
        System.out.printf("(%d,%d)", getX(), getY());
    }

    public double distance(MyPoint diger) {
        double sonucX = (diger.getX() - x) * (diger.getX() - x);
        double sonucY = (diger.getY() - y) * (diger.getY() - y);
        return Math.sqrt(sonucX + sonucY);
    }


    // double distance= Math.sqrt(Math.pow(diger.x-x,2)+Math.pow(diger.y-y, 2));

    public void printDistance(MyPoint diger) {
        System.out.printf("%.2f", distance(diger));
    }

    //hesapla metodu kullanılarak yazma işlemi yapıldı
    public void printHesapla(MyPoint point) {

        for (int i = 0; i < point.getX(); i++) {
                for (int j = 0; j < point.getY(); j++) {
                    int deger = j + i;
                    point.hesapla(i, j, deger);
                }
        }
        System.out.println();
        //yazılan değerler okundu
        for (int i = 0; i < point.getX(); i++) {
            for (int j = 0; j < point.getY(); j++) {
                System.out.print(" ");
                System.out.print(point.getXY(i, j));
            }
            System.out.println();
        }


    }





}
