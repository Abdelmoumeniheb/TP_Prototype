public class Rectangle extends Shape{  
    public int largeur;
    public int hauteur;
    public Rectangle(int x,int y,String couleur,int largeur, int hauteur) {
        super(x,y,couleur);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
    public void affiche() {
        System.out.println("Rectangle [x="+x+", y="+y+", largeur=" + largeur + ", hauteur=" + hauteur + ", couleur=" + couleur+"]");
    }
    public Rectangle clone() {
        return new Rectangle(x,y,couleur,largeur, hauteur);
    }
}
