public class Rectangle {
    int en;
    int boy;
    Rectangle(){
        en=1;
        boy=1;
    }
    Rectangle(int _en,int _boy){
        en = _en;
        boy=_boy;
    }
    int findArea(){
        return en*boy;
    }
    int findPerimeter(){
        return 2*(en+boy);
    }
}
