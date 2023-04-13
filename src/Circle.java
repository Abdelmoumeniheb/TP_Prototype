public class Circle extends Shape {
    public int rayon;
    public Circle() {
        super();
    }
    public Circle(int x,int y,int rayon,String couleur) {
        super(x,y,couleur);
        this.rayon = rayon;
    }
    public Circle clone() {
        return new Circle(this.x,this.y,this.rayon,this.couleur);
    }
    public void affiche(){
        System.out.println("Cercle [x="+x+", y="+y+", rayon="+rayon+", couleur="+couleur+"]");
    }
}
